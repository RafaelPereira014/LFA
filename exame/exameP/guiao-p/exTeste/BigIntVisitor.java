// Generated from BigInt.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BigIntParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BigIntVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BigIntParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(BigIntParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigIntParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(BigIntParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigIntParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(BigIntParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigIntParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BigIntParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link BigIntParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(BigIntParser.ExprNumContext ctx);
}