package questao2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrigo on 4/21/16.
 */
public class CiclomaticaEvalVisitor extends CiclomaticaBaseVisitor<Integer> {

    private ArrayList<Method> methods = new ArrayList<>();

    private Method actualMethod;

    public void PrintResults(){

        // este add deve ser colocado no visitor de cada metodo
        // dando um new com  com o nome do metodo visitado
        actualMethod = new Method("Main");
        methods.add(actualMethod);

        for (Method m : methods)
        {
            m.PrintResults();
        }
    }

    @Override
    public Integer visitTernaryBlock(CiclomaticaParser.TernaryBlockContext ctx) {

        actualMethod.AddVisit(Method.TypesVisit.TERNARY);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitWhileblock(CiclomaticaParser.WhileblockContext ctx) {

        actualMethod.AddVisit(Method.TypesVisit.WHILE);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitIfblock(CiclomaticaParser.IfblockContext ctx) {

        actualMethod.AddVisit(Method.TypesVisit.IF);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitElseifblock(CiclomaticaParser.ElseifblockContext ctx) {

        actualMethod.AddVisit(Method.TypesVisit.ELSEIF);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitCatchClause(CiclomaticaParser.CatchClauseContext ctx) {

        actualMethod.AddVisit(Method.TypesVisit.CATCH);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitForControl(CiclomaticaParser.ForControlContext ctx) {

        actualMethod.AddVisit(Method.TypesVisit.FOR);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitSwitchLabel(CiclomaticaParser.SwitchLabelContext ctx) {

        actualMethod.AddVisit(Method.TypesVisit.CASE);

        return visitChildren(ctx);
    }
}
