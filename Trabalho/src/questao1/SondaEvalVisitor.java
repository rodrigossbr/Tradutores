

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by rodrigo on 4/21/16.
 */
public class SondaEvalVisitor extends SondaBaseVisitor<Integer> {

    private Map<Integer, Integer> memory = new HashMap<Integer, Integer>();
    private boolean inCommand = false;
    private int cmdLeftIndex = 0;
    private int cmdRightIndex = 0;

    public void PrintTotalDistance() {
        Integer total = 0;

        for (Integer v: memory.values()) {
            total += v;
        }
        System.out.println("Distancia total percorrida: " + total);
    }

    private Integer addDistance(int direction, int value) {
        if (direction != SondaParser.FRENTE && direction != SondaParser.TRAS
                && direction != SondaParser.ESQUERDA && direction != SondaParser.DIREITA)
            return 0;

        if (memory.containsKey(direction)) {
            memory.merge(direction, value, Integer::sum);
        } else {
            memory.put(direction, value);
        }

        String directionName = SondaParser.VOCABULARY.getSymbolicName(direction);

        if(!inCommand)
            System.out.println("Andou para: " + directionName + ", Distancia: " + value);

        return memory.get(direction);
    }

    @Override
    public Integer visitPrintCmd(SondaParser.PrintCmdContext ctx) {
        Integer value = (Integer) visit(ctx.command()); // evaluate the expr child
        return (Integer) 0;                          // return dummy value
    }

    @Override
    public Integer visitBlank(SondaParser.BlankContext ctx) {
        return (Integer) visitChildren(ctx);
    }

    @Override
    public Integer visitCmd(SondaParser.CmdContext ctx) {

        inCommand = true;
        SondaParser.BasicContext left = ctx.basic(0);
        SondaParser.BasicContext rigth = ctx.basic(1);
        cmdRightInde = left.getRuleIndex();
        cmdRightInde = rigth.getRuleIndex();

//        SondaParser.OpBasicContext opBasicLeft = new SondaParser.OpBasicContext(left);
//        SondaParser.OpBasicContext opBasicRigth = new SondaParser.OpBasicContext(rigth);

//        String directionLeft = SondaParser.VOCABULARY.getSymbolicName(opBasicLeft.opbasic.getType());
//        String directionRigth = SondaParser.VOCABULARY.getSymbolicName(opBasicRigth.opbasic.getType());

//        Integer valLeft = Integer.valueOf(opBasicLeft.N().getText()).intValue();
//        Integer valRigth = Integer.valueOf(opBasicLeft.N().getText()).intValue();
//
//        if(ctx.opcmd.getType() == SondaParser.ENTAO){
//            addDistance(opBasicLeft.opbasic.getType(), valLeft);
//            addDistance(opBasicRigth.opbasic.getType(), valRigth);
//
//            System.out.println("Andou p/: " + directionLeft + ", Distancia: " + valLeft + " e depois p/: " + directionRigth + ", Distancia: " + valRigth);
//
//        }else if(ctx.opcmd.getType() == SondaParser.APOS){
//            addDistance(opBasicRigth.opbasic.getType(), valRigth);
//            addDistance(opBasicLeft.opbasic.getType(), valLeft);
//
//            System.out.println("Andou p/: " + directionRigth + ", Distancia: " + valRigth + " e depois p/: " + directionLeft + ", Distancia: " + valLeft);
//        }
        inCommand = false;
        return (Integer) visitChildren(ctx);
    }

    @Override
    public Integer visitBasicCmd(SondaParser.BasicCmdContext ctx) {
        return (Integer) visit(ctx.basic()); // return child expr's value
    }

    @Override
    public Integer visitOpBasic(SondaParser.OpBasicContext ctx) {
        int n = Integer.valueOf(ctx.N().getText()).intValue();
        int total = addDistance(ctx.opbasic.getType(), n);
        return (Integer) total;
    }
}
