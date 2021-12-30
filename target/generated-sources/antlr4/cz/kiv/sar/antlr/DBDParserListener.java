// Generated from cz\kiv\sar\antlr\DBDParser.g4 by ANTLR 4.9.3
package cz.kiv.sar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DBDParser}.
 */
public interface DBDParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DBDParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(DBDParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(DBDParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(DBDParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(DBDParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd}.
	 * @param ctx the parse tree
	 */
	void enterDbd(DBDParser.DbdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd}.
	 * @param ctx the parse tree
	 */
	void exitDbd(DBDParser.DbdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(DBDParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(DBDParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(DBDParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(DBDParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(DBDParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(DBDParser.Param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DBDParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DBDParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(DBDParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(DBDParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset}.
	 * @param ctx the parse tree
	 */
	void enterDataset(DBDParser.DatasetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset}.
	 * @param ctx the parse tree
	 */
	void exitDataset(DBDParser.DatasetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset_with_label}.
	 * @param ctx the parse tree
	 */
	void enterDataset_with_label(DBDParser.Dataset_with_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_with_label}.
	 * @param ctx the parse tree
	 */
	void exitDataset_with_label(DBDParser.Dataset_with_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset_without_label}.
	 * @param ctx the parse tree
	 */
	void enterDataset_without_label(DBDParser.Dataset_without_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_without_label}.
	 * @param ctx the parse tree
	 */
	void exitDataset_without_label(DBDParser.Dataset_without_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(DBDParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(DBDParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_definition}.
	 * @param ctx the parse tree
	 */
	void enterSegment_definition(DBDParser.Segment_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_definition}.
	 * @param ctx the parse tree
	 */
	void exitSegment_definition(DBDParser.Segment_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(DBDParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(DBDParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#lchild}.
	 * @param ctx the parse tree
	 */
	void enterLchild(DBDParser.LchildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#lchild}.
	 * @param ctx the parse tree
	 */
	void exitLchild(DBDParser.LchildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#xdfld}.
	 * @param ctx the parse tree
	 */
	void enterXdfld(DBDParser.XdfldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#xdfld}.
	 * @param ctx the parse tree
	 */
	void exitXdfld(DBDParser.XdfldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(DBDParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(DBDParser.EndContext ctx);
}