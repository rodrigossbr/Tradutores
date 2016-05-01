// Generated from Ciclomatica.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CiclomaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CiclomaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CiclomaticaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CiclomaticaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#whileblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileblock(CiclomaticaParser.WhileblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(CiclomaticaParser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#elseifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifblock(CiclomaticaParser.ElseifblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(CiclomaticaParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(CiclomaticaParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(CiclomaticaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(CiclomaticaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(CiclomaticaParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(CiclomaticaParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(CiclomaticaParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(CiclomaticaParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(CiclomaticaParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(CiclomaticaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CiclomaticaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CiclomaticaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CiclomaticaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CiclomaticaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#ifexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexpr(CiclomaticaParser.IfexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CiclomaticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CiclomaticaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CiclomaticaParser.ExpressionListContext ctx);
}