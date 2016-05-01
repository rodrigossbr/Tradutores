package questao2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrigo on 4/21/16.
 */
public class CiclomaticaEvalVisitor extends CiclomaticaBaseVisitor<Integer> {

    private enum TypesVisit {
        IF,
        ELSEIF,
        CASE,
        FOR,
        DO,
        WHILE,
        CATCH,
        TERNARY
    }

    private Map<TypesVisit, Integer> memory = new HashMap<>();

    private void AddVisit(TypesVisit type){
        if (memory.containsKey(type)) {
            memory.merge(type, 1, Integer::sum);
        } else {
            memory.put(type, 1);
        }
    }

    public void PrintResults(){

        System.out.println("Total de IFs");

        for (Map.Entry<TypesVisit, Integer> entry : memory.entrySet())
        {
            System.out.println(" Total para: " + entry.getKey() + " eh " + entry.getValue());
        }

    }

    @Override
    public Integer visitTernaryBlock(CiclomaticaParser.TernaryBlockContext ctx) {

        AddVisit(TypesVisit.TERNARY);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitWhileblock(CiclomaticaParser.WhileblockContext ctx) {

        AddVisit(TypesVisit.WHILE);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitIfblock(CiclomaticaParser.IfblockContext ctx) {

        AddVisit(TypesVisit.IF);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitElseifblock(CiclomaticaParser.ElseifblockContext ctx) {

        AddVisit(TypesVisit.ELSEIF);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitCatchClause(CiclomaticaParser.CatchClauseContext ctx) {

        AddVisit(TypesVisit.CATCH);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitForControl(CiclomaticaParser.ForControlContext ctx) {

        AddVisit(TypesVisit.FOR);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitSwitchLabel(CiclomaticaParser.SwitchLabelContext ctx) {

        AddVisit(TypesVisit.CASE);

        return visitChildren(ctx);
    }
}
