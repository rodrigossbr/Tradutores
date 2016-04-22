// Generated from Sonda.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SondaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SondaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SondaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SondaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printCmd}
	 * labeled alternative in {@link SondaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCmd(SondaParser.PrintCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link SondaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(SondaParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmd}
	 * labeled alternative in {@link SondaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SondaParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicCmd}
	 * labeled alternative in {@link SondaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicCmd(SondaParser.BasicCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opBasic}
	 * labeled alternative in {@link SondaParser#basic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBasic(SondaParser.OpBasicContext ctx);
}