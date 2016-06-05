// Generated from Csharp.g4 by ANTLR 4.5.1
package tradutorCsharp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CsharpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CsharpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CsharpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CsharpParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(CsharpParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(CsharpParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#classIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassIdentifier(CsharpParser.ClassIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(CsharpParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#multipleParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleParameters(CsharpParser.MultipleParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(CsharpParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CsharpParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#multipleVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleVariable(CsharpParser.MultipleVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#createNewObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateNewObject(CsharpParser.CreateNewObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#whileblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileblock(CsharpParser.WhileblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(CsharpParser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#elseifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifblock(CsharpParser.ElseifblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(CsharpParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(CsharpParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(CsharpParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(CsharpParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(CsharpParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(CsharpParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(CsharpParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(CsharpParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(CsharpParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(CsharpParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CsharpParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CsharpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CsharpParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CsharpParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#parametersType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersType(CsharpParser.ParametersTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#methodParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameters(CsharpParser.MethodParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#methodClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodClass(CsharpParser.MethodClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#ifexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexpr(CsharpParser.IfexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#multipleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleExpr(CsharpParser.MultipleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CsharpParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsharpParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CsharpParser.ExpressionListContext ctx);
}