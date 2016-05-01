import org.antlr.v4.runtime.misc.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrigo on 4/21/16.
 */
public class CiclomaticaEvalVisitor extends CiclomaticaBaseVisitor<Integer> {

    private Map<Integer, Integer> memory = new HashMap<Integer, Integer>();

    public void PrintTotalComplexity()
    {
	Integer total =0;

	for (Integer v: memory.values())
	{
	    total +=v;
	}	

	System.out.println("A complexidade Ciclomatica:"+ total);
    }    

    @Override
    public Integer visitWhileblock(CiclomaticaParser.WhileblockContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Integer visitIfblock(CiclomaticaParser.IfblockContext ctx) 
    {
        Integer value =1;
        return value;
    }

    @Override
    public Integer visitElseifblock(CiclomaticaParser.ElseifblockContext ctx) 
    {
        Integer value = 1;
        return value;
    }

    @Override
    public Integer visitCatches(CiclomaticaParser.CatchesContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitCatchClause(CiclomaticaParser.CatchClauseContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitForControl(CiclomaticaParser.ForControlContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitForInit(CiclomaticaParser.ForInitContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitForExpression(CiclomaticaParser.ForExpressionContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitForUpdate(CiclomaticaParser.ForUpdateContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitParExpression(CiclomaticaParser.ParExpressionContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitSwitchLabel(CiclomaticaParser.SwitchLabelContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitSwitchBlock(CiclomaticaParser.SwitchBlockContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitSwitchBlockStatementGroup(CiclomaticaParser.SwitchBlockStatementGroupContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitBlockStatement(CiclomaticaParser.BlockStatementContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitBlock(CiclomaticaParser.BlockContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitCondition(CiclomaticaParser.ConditionContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitExpr(CiclomaticaParser.ExprContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitExpression(CiclomaticaParser.ExpressionContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Integer visitExpressionList(CiclomaticaParser.ExpressionListContext ctx) {

        return visitChildren(ctx);
    }
}
