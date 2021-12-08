// Generated from C:/git/DBDtoSQL/grammar\Test.g4 by ANTLR 4.9.2
package cz.kiv.sar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(TestParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(TestParser.NameContext ctx);
}