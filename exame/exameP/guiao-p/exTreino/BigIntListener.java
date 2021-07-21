// Generated from BigInt.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BigIntParser}.
 */
public interface BigIntListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BigIntParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(BigIntParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigIntParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(BigIntParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigIntParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(BigIntParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigIntParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(BigIntParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigIntParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BigIntParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigIntParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BigIntParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigIntParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BigIntParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigIntParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BigIntParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(BigIntParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(BigIntParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNum(BigIntParser.ExprNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNum(BigIntParser.ExprNumContext ctx);
}