// Generated from cz\kiv\sar\antlr\DBDParser.g4 by ANTLR 4.9.3
package cz.kiv.sar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DBDParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DBDParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DBDParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(DBDParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd(DBDParser.DbdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(DBDParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(DBDParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(DBDParser.Param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DBDParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(DBDParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset(DBDParser.DatasetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_with_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_with_label(DBDParser.Dataset_with_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_without_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_without_label(DBDParser.Dataset_without_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment(DBDParser.SegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_definition(DBDParser.Segment_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(DBDParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#lchild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLchild(DBDParser.LchildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#xdfld}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXdfld(DBDParser.XdfldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(DBDParser.EndContext ctx);
}