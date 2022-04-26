// Generated from com\cent\antlr\cent\Cent.g4 by ANTLR 4.7.2
package com.cent.antlr.cent;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CentParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CentVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CentParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(CentParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link CentParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(CentParser.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link CentParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafexpr(CentParser.LeafexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link CentParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpexpr(CentParser.OpexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errexpr}
	 * labeled alternative in {@link CentParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrexpr(CentParser.ErrexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CentParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(CentParser.ListContext ctx);
}