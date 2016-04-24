

import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrigo on 4/21/16.
 */
public class SondaEvalVisitor extends SondaBaseVisitor<Integer> {

    private Map<Integer, Integer> memory = new HashMap<Integer, Integer>();
    private boolean inCommand = false;
    private int cmdType = 0;

    private Pair<Integer, Integer> c1;
    private Pair<Integer, Integer> c2;

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
        return memory.get(direction);
    }

    private boolean ExecCommand(Integer type, Integer n){
        boolean isNotContinue = false;
        if(inCommand){
            isNotContinue = true;
            if(c1 == null){
                c1 = new Pair<>(type, n);
            }else if(c2 == null){
                c2 = new Pair<>(type, n);
                if(cmdType == SondaParser.ENTAO){
                    String strEntao = SondaParser.VOCABULARY.getSymbolicName(SondaParser.ENTAO);
                    addDistance(c1.a, c1.b);
                    String dirNameC1 = SondaParser.VOCABULARY.getSymbolicName(c1.a);
                    System.out.print("Andou para: " + dirNameC1 + ", Distancia: " + c1.b);
                    System.out.print(" " + strEntao + " ");
                    addDistance(c2.a, c2.b);
                    String dirNameC2 = SondaParser.VOCABULARY.getSymbolicName(c2.a);
                    System.out.print("Andou para: " + dirNameC2 + ", Distancia: " + c2.b + "\n");
                } else if(cmdType == SondaParser.APOS){
                    String strApos = SondaParser.VOCABULARY.getSymbolicName(SondaParser.APOS);
                    addDistance(c2.a, c2.b);
                    String dirNameC2 = SondaParser.VOCABULARY.getSymbolicName(c2.a);
                    System.out.print("Andou para: " + dirNameC2 + ", Distancia: " + c2.b);
                    System.out.print(" " + strApos + " ");
                    addDistance(c1.a, c1.b);
                    String dirNameC1 = SondaParser.VOCABULARY.getSymbolicName(c1.a);
                    System.out.print("Andou para: " + dirNameC1 + ", Distancia: " + c1.b + "\n");
                }
                inCommand = false;
                c1 = null;
                c2 = null;
            }
        }
        return isNotContinue;
    }

    @Override
    public Integer visitCmdApos(SondaParser.CmdAposContext ctx) {
        inCommand = true;
        cmdType = ctx.APOS().getSymbol().getType();
        return visitChildren(ctx);
    }

    @Override
    public Integer visitCmdEntao(SondaParser.CmdEntaoContext ctx) {
        inCommand = true;
        cmdType = ctx.ENTAO().getSymbol().getType();
        return visitChildren(ctx);
    }

    @Override
    public Integer visitCmdBasic(SondaParser.CmdBasicContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitOpBasic(SondaParser.OpBasicContext ctx) {
        int n = Integer.valueOf(ctx.N().getText()).intValue();
        int type = ctx.opbasic.getType();

        if(ExecCommand(type, n)){
            return 0;
        }else{
            String directionName = SondaParser.VOCABULARY.getSymbolicName(type);
            System.out.print("Andou para: " + directionName + ", Distancia: " + n + "\n");

            return addDistance(type, n);
        }
    }
}
