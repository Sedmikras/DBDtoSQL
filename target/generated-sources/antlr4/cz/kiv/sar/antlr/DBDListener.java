// Generated from cz\kiv\sar\antlr\DBD.g4 by ANTLR 4.9.3
package cz.kiv.sar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DBDParser}.
 */
public interface DBDListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DBDParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(DBDParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(DBDParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DBDParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DBDParser.NameContext ctx);
}