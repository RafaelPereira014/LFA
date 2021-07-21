// Generated from FracLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracLangParser}.
 */
public interface FracLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracLangParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FracLangParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FracLangParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(FracLangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(FracLangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FracLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FracLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFract}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFract(FracLangParser.ExprFractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFract}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFract(FracLangParser.ExprFractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParents}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParents(FracLangParser.ExprParentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParents}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParents(FracLangParser.ExprParentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNUM}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNUM(FracLangParser.ExprNUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNUM}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNUM(FracLangParser.ExprNUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReadStr}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReadStr(FracLangParser.ExprReadStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReadStr}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReadStr(FracLangParser.ExprReadStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSumSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSumSub(FracLangParser.ExprSumSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSumSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSumSub(FracLangParser.ExprSumSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(FracLangParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(FracLangParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(FracLangParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(FracLangParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(FracLangParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(FracLangParser.FractionContext ctx);
}