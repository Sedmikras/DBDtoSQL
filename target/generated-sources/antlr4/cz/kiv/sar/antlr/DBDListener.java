// Generated from cz\kiv\sar\antlr\DBD.g4 by ANTLR 4.9.3
package cz.kiv.sar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DBDParser}.
 */
public interface DBDListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link DBDParser#dbd_params}.
	 * @param ctx the parse tree
	 */
	void enterDbd_params(DBDParser.Dbd_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_params}.
	 * @param ctx the parse tree
	 */
	void exitDbd_params(DBDParser.Dbd_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_param}.
	 * @param ctx the parse tree
	 */
	void enterDbd_param(DBDParser.Dbd_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_param}.
	 * @param ctx the parse tree
	 */
	void exitDbd_param(DBDParser.Dbd_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_name}.
	 * @param ctx the parse tree
	 */
	void enterDbd_name(DBDParser.Dbd_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_name}.
	 * @param ctx the parse tree
	 */
	void exitDbd_name(DBDParser.Dbd_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_access}.
	 * @param ctx the parse tree
	 */
	void enterDbd_access(DBDParser.Dbd_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_access}.
	 * @param ctx the parse tree
	 */
	void exitDbd_access(DBDParser.Dbd_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_access_value}.
	 * @param ctx the parse tree
	 */
	void enterDbd_access_value(DBDParser.Dbd_access_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_access_value}.
	 * @param ctx the parse tree
	 */
	void exitDbd_access_value(DBDParser.Dbd_access_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_rmname}.
	 * @param ctx the parse tree
	 */
	void enterDbd_rmname(DBDParser.Dbd_rmnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_rmname}.
	 * @param ctx the parse tree
	 */
	void exitDbd_rmname(DBDParser.Dbd_rmnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_rmname_value}.
	 * @param ctx the parse tree
	 */
	void enterDbd_rmname_value(DBDParser.Dbd_rmname_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_rmname_value}.
	 * @param ctx the parse tree
	 */
	void exitDbd_rmname_value(DBDParser.Dbd_rmname_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_dbver}.
	 * @param ctx the parse tree
	 */
	void enterDbd_dbver(DBDParser.Dbd_dbverContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_dbver}.
	 * @param ctx the parse tree
	 */
	void exitDbd_dbver(DBDParser.Dbd_dbverContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_passwd}.
	 * @param ctx the parse tree
	 */
	void enterDbd_passwd(DBDParser.Dbd_passwdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_passwd}.
	 * @param ctx the parse tree
	 */
	void exitDbd_passwd(DBDParser.Dbd_passwdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_exit}.
	 * @param ctx the parse tree
	 */
	void enterDbd_exit(DBDParser.Dbd_exitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_exit}.
	 * @param ctx the parse tree
	 */
	void exitDbd_exit(DBDParser.Dbd_exitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_version}.
	 * @param ctx the parse tree
	 */
	void enterDbd_version(DBDParser.Dbd_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_version}.
	 * @param ctx the parse tree
	 */
	void exitDbd_version(DBDParser.Dbd_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_datxexit}.
	 * @param ctx the parse tree
	 */
	void enterDbd_datxexit(DBDParser.Dbd_datxexitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_datxexit}.
	 * @param ctx the parse tree
	 */
	void exitDbd_datxexit(DBDParser.Dbd_datxexitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_encoding}.
	 * @param ctx the parse tree
	 */
	void enterDbd_encoding(DBDParser.Dbd_encodingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_encoding}.
	 * @param ctx the parse tree
	 */
	void exitDbd_encoding(DBDParser.Dbd_encodingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dbd_remarks}.
	 * @param ctx the parse tree
	 */
	void enterDbd_remarks(DBDParser.Dbd_remarksContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dbd_remarks}.
	 * @param ctx the parse tree
	 */
	void exitDbd_remarks(DBDParser.Dbd_remarksContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#access_method}.
	 * @param ctx the parse tree
	 */
	void enterAccess_method(DBDParser.Access_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#access_method}.
	 * @param ctx the parse tree
	 */
	void exitAccess_method(DBDParser.Access_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#operating_method}.
	 * @param ctx the parse tree
	 */
	void enterOperating_method(DBDParser.Operating_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#operating_method}.
	 * @param ctx the parse tree
	 */
	void exitOperating_method(DBDParser.Operating_methodContext ctx);
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
	 * Enter a parse tree produced by {@link DBDParser#dataset_dd1}.
	 * @param ctx the parse tree
	 */
	void enterDataset_dd1(DBDParser.Dataset_dd1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_dd1}.
	 * @param ctx the parse tree
	 */
	void exitDataset_dd1(DBDParser.Dataset_dd1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset_size}.
	 * @param ctx the parse tree
	 */
	void enterDataset_size(DBDParser.Dataset_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_size}.
	 * @param ctx the parse tree
	 */
	void exitDataset_size(DBDParser.Dataset_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segments}.
	 * @param ctx the parse tree
	 */
	void enterSegments(DBDParser.SegmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segments}.
	 * @param ctx the parse tree
	 */
	void exitSegments(DBDParser.SegmentsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link DBDParser#bool_string}.
	 * @param ctx the parse tree
	 */
	void enterBool_string(DBDParser.Bool_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#bool_string}.
	 * @param ctx the parse tree
	 */
	void exitBool_string(DBDParser.Bool_stringContext ctx);
}