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
	 * Enter a parse tree produced by {@link DBDParser#dataset_params}.
	 * @param ctx the parse tree
	 */
	void enterDataset_params(DBDParser.Dataset_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_params}.
	 * @param ctx the parse tree
	 */
	void exitDataset_params(DBDParser.Dataset_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset_param}.
	 * @param ctx the parse tree
	 */
	void enterDataset_param(DBDParser.Dataset_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_param}.
	 * @param ctx the parse tree
	 */
	void exitDataset_param(DBDParser.Dataset_paramContext ctx);
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
	 * Enter a parse tree produced by {@link DBDParser#dataset_block}.
	 * @param ctx the parse tree
	 */
	void enterDataset_block(DBDParser.Dataset_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_block}.
	 * @param ctx the parse tree
	 */
	void exitDataset_block(DBDParser.Dataset_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset_device}.
	 * @param ctx the parse tree
	 */
	void enterDataset_device(DBDParser.Dataset_deviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_device}.
	 * @param ctx the parse tree
	 */
	void exitDataset_device(DBDParser.Dataset_deviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset_scan}.
	 * @param ctx the parse tree
	 */
	void enterDataset_scan(DBDParser.Dataset_scanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_scan}.
	 * @param ctx the parse tree
	 */
	void exitDataset_scan(DBDParser.Dataset_scanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset_frspc}.
	 * @param ctx the parse tree
	 */
	void enterDataset_frspc(DBDParser.Dataset_frspcContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_frspc}.
	 * @param ctx the parse tree
	 */
	void exitDataset_frspc(DBDParser.Dataset_frspcContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset_searcha}.
	 * @param ctx the parse tree
	 */
	void enterDataset_searcha(DBDParser.Dataset_searchaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_searcha}.
	 * @param ctx the parse tree
	 */
	void exitDataset_searcha(DBDParser.Dataset_searchaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#dataset_remarks}.
	 * @param ctx the parse tree
	 */
	void enterDataset_remarks(DBDParser.Dataset_remarksContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#dataset_remarks}.
	 * @param ctx the parse tree
	 */
	void exitDataset_remarks(DBDParser.Dataset_remarksContext ctx);
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
	 * Enter a parse tree produced by {@link DBDParser#segment_params}.
	 * @param ctx the parse tree
	 */
	void enterSegment_params(DBDParser.Segment_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_params}.
	 * @param ctx the parse tree
	 */
	void exitSegment_params(DBDParser.Segment_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_param}.
	 * @param ctx the parse tree
	 */
	void enterSegment_param(DBDParser.Segment_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_param}.
	 * @param ctx the parse tree
	 */
	void exitSegment_param(DBDParser.Segment_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_name}.
	 * @param ctx the parse tree
	 */
	void enterSegment_name(DBDParser.Segment_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_name}.
	 * @param ctx the parse tree
	 */
	void exitSegment_name(DBDParser.Segment_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_external_name}.
	 * @param ctx the parse tree
	 */
	void enterSegment_external_name(DBDParser.Segment_external_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_external_name}.
	 * @param ctx the parse tree
	 */
	void exitSegment_external_name(DBDParser.Segment_external_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_parent}.
	 * @param ctx the parse tree
	 */
	void enterSegment_parent(DBDParser.Segment_parentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_parent}.
	 * @param ctx the parse tree
	 */
	void exitSegment_parent(DBDParser.Segment_parentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_parent_value}.
	 * @param ctx the parse tree
	 */
	void enterSegment_parent_value(DBDParser.Segment_parent_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_parent_value}.
	 * @param ctx the parse tree
	 */
	void exitSegment_parent_value(DBDParser.Segment_parent_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_parent_value_1}.
	 * @param ctx the parse tree
	 */
	void enterSegment_parent_value_1(DBDParser.Segment_parent_value_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_parent_value_1}.
	 * @param ctx the parse tree
	 */
	void exitSegment_parent_value_1(DBDParser.Segment_parent_value_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_parent_type_1}.
	 * @param ctx the parse tree
	 */
	void enterSegment_parent_type_1(DBDParser.Segment_parent_type_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_parent_type_1}.
	 * @param ctx the parse tree
	 */
	void exitSegment_parent_type_1(DBDParser.Segment_parent_type_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_parent_value_2}.
	 * @param ctx the parse tree
	 */
	void enterSegment_parent_value_2(DBDParser.Segment_parent_value_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_parent_value_2}.
	 * @param ctx the parse tree
	 */
	void exitSegment_parent_value_2(DBDParser.Segment_parent_value_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_parent_type_2}.
	 * @param ctx the parse tree
	 */
	void enterSegment_parent_type_2(DBDParser.Segment_parent_type_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_parent_type_2}.
	 * @param ctx the parse tree
	 */
	void exitSegment_parent_type_2(DBDParser.Segment_parent_type_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_source}.
	 * @param ctx the parse tree
	 */
	void enterSegment_source(DBDParser.Segment_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_source}.
	 * @param ctx the parse tree
	 */
	void exitSegment_source(DBDParser.Segment_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_bytes}.
	 * @param ctx the parse tree
	 */
	void enterSegment_bytes(DBDParser.Segment_bytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_bytes}.
	 * @param ctx the parse tree
	 */
	void exitSegment_bytes(DBDParser.Segment_bytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_bytes_value}.
	 * @param ctx the parse tree
	 */
	void enterSegment_bytes_value(DBDParser.Segment_bytes_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_bytes_value}.
	 * @param ctx the parse tree
	 */
	void exitSegment_bytes_value(DBDParser.Segment_bytes_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_freq}.
	 * @param ctx the parse tree
	 */
	void enterSegment_freq(DBDParser.Segment_freqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_freq}.
	 * @param ctx the parse tree
	 */
	void exitSegment_freq(DBDParser.Segment_freqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_ptr}.
	 * @param ctx the parse tree
	 */
	void enterSegment_ptr(DBDParser.Segment_ptrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_ptr}.
	 * @param ctx the parse tree
	 */
	void exitSegment_ptr(DBDParser.Segment_ptrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_ptr_value}.
	 * @param ctx the parse tree
	 */
	void enterSegment_ptr_value(DBDParser.Segment_ptr_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_ptr_value}.
	 * @param ctx the parse tree
	 */
	void exitSegment_ptr_value(DBDParser.Segment_ptr_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_ptr_type_1}.
	 * @param ctx the parse tree
	 */
	void enterSegment_ptr_type_1(DBDParser.Segment_ptr_type_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_ptr_type_1}.
	 * @param ctx the parse tree
	 */
	void exitSegment_ptr_type_1(DBDParser.Segment_ptr_type_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_ptr_type_2}.
	 * @param ctx the parse tree
	 */
	void enterSegment_ptr_type_2(DBDParser.Segment_ptr_type_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_ptr_type_2}.
	 * @param ctx the parse tree
	 */
	void exitSegment_ptr_type_2(DBDParser.Segment_ptr_type_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_rules}.
	 * @param ctx the parse tree
	 */
	void enterSegment_rules(DBDParser.Segment_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_rules}.
	 * @param ctx the parse tree
	 */
	void exitSegment_rules(DBDParser.Segment_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_rules_value}.
	 * @param ctx the parse tree
	 */
	void enterSegment_rules_value(DBDParser.Segment_rules_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_rules_value}.
	 * @param ctx the parse tree
	 */
	void exitSegment_rules_value(DBDParser.Segment_rules_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_rules_type_1}.
	 * @param ctx the parse tree
	 */
	void enterSegment_rules_type_1(DBDParser.Segment_rules_type_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_rules_type_1}.
	 * @param ctx the parse tree
	 */
	void exitSegment_rules_type_1(DBDParser.Segment_rules_type_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_rules_type_2}.
	 * @param ctx the parse tree
	 */
	void enterSegment_rules_type_2(DBDParser.Segment_rules_type_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_rules_type_2}.
	 * @param ctx the parse tree
	 */
	void exitSegment_rules_type_2(DBDParser.Segment_rules_type_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_rules_type_3}.
	 * @param ctx the parse tree
	 */
	void enterSegment_rules_type_3(DBDParser.Segment_rules_type_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_rules_type_3}.
	 * @param ctx the parse tree
	 */
	void exitSegment_rules_type_3(DBDParser.Segment_rules_type_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_rules_type_4}.
	 * @param ctx the parse tree
	 */
	void enterSegment_rules_type_4(DBDParser.Segment_rules_type_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_rules_type_4}.
	 * @param ctx the parse tree
	 */
	void exitSegment_rules_type_4(DBDParser.Segment_rules_type_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_exit}.
	 * @param ctx the parse tree
	 */
	void enterSegment_exit(DBDParser.Segment_exitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_exit}.
	 * @param ctx the parse tree
	 */
	void exitSegment_exit(DBDParser.Segment_exitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_comprtn}.
	 * @param ctx the parse tree
	 */
	void enterSegment_comprtn(DBDParser.Segment_comprtnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_comprtn}.
	 * @param ctx the parse tree
	 */
	void exitSegment_comprtn(DBDParser.Segment_comprtnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_encoding}.
	 * @param ctx the parse tree
	 */
	void enterSegment_encoding(DBDParser.Segment_encodingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_encoding}.
	 * @param ctx the parse tree
	 */
	void exitSegment_encoding(DBDParser.Segment_encodingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#segment_remarks}.
	 * @param ctx the parse tree
	 */
	void enterSegment_remarks(DBDParser.Segment_remarksContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#segment_remarks}.
	 * @param ctx the parse tree
	 */
	void exitSegment_remarks(DBDParser.Segment_remarksContext ctx);
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
	 * Enter a parse tree produced by {@link DBDParser#field_params}.
	 * @param ctx the parse tree
	 */
	void enterField_params(DBDParser.Field_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_params}.
	 * @param ctx the parse tree
	 */
	void exitField_params(DBDParser.Field_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_param}.
	 * @param ctx the parse tree
	 */
	void enterField_param(DBDParser.Field_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_param}.
	 * @param ctx the parse tree
	 */
	void exitField_param(DBDParser.Field_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_name}.
	 * @param ctx the parse tree
	 */
	void enterField_name(DBDParser.Field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_name}.
	 * @param ctx the parse tree
	 */
	void exitField_name(DBDParser.Field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_name_value}.
	 * @param ctx the parse tree
	 */
	void enterField_name_value(DBDParser.Field_name_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_name_value}.
	 * @param ctx the parse tree
	 */
	void exitField_name_value(DBDParser.Field_name_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_name_value_type}.
	 * @param ctx the parse tree
	 */
	void enterField_name_value_type(DBDParser.Field_name_value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_name_value_type}.
	 * @param ctx the parse tree
	 */
	void exitField_name_value_type(DBDParser.Field_name_value_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_external_name}.
	 * @param ctx the parse tree
	 */
	void enterField_external_name(DBDParser.Field_external_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_external_name}.
	 * @param ctx the parse tree
	 */
	void exitField_external_name(DBDParser.Field_external_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_bytes}.
	 * @param ctx the parse tree
	 */
	void enterField_bytes(DBDParser.Field_bytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_bytes}.
	 * @param ctx the parse tree
	 */
	void exitField_bytes(DBDParser.Field_bytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_max_bytes}.
	 * @param ctx the parse tree
	 */
	void enterField_max_bytes(DBDParser.Field_max_bytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_max_bytes}.
	 * @param ctx the parse tree
	 */
	void exitField_max_bytes(DBDParser.Field_max_bytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_start}.
	 * @param ctx the parse tree
	 */
	void enterField_start(DBDParser.Field_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_start}.
	 * @param ctx the parse tree
	 */
	void exitField_start(DBDParser.Field_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_start_after}.
	 * @param ctx the parse tree
	 */
	void enterField_start_after(DBDParser.Field_start_afterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_start_after}.
	 * @param ctx the parse tree
	 */
	void exitField_start_after(DBDParser.Field_start_afterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_rel_start}.
	 * @param ctx the parse tree
	 */
	void enterField_rel_start(DBDParser.Field_rel_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_rel_start}.
	 * @param ctx the parse tree
	 */
	void exitField_rel_start(DBDParser.Field_rel_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_datatype}.
	 * @param ctx the parse tree
	 */
	void enterField_datatype(DBDParser.Field_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_datatype}.
	 * @param ctx the parse tree
	 */
	void exitField_datatype(DBDParser.Field_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_datatype_value}.
	 * @param ctx the parse tree
	 */
	void enterField_datatype_value(DBDParser.Field_datatype_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_datatype_value}.
	 * @param ctx the parse tree
	 */
	void exitField_datatype_value(DBDParser.Field_datatype_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_type}.
	 * @param ctx the parse tree
	 */
	void enterField_type(DBDParser.Field_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_type}.
	 * @param ctx the parse tree
	 */
	void exitField_type(DBDParser.Field_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_type_value}.
	 * @param ctx the parse tree
	 */
	void enterField_type_value(DBDParser.Field_type_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_type_value}.
	 * @param ctx the parse tree
	 */
	void exitField_type_value(DBDParser.Field_type_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_case_name}.
	 * @param ctx the parse tree
	 */
	void enterField_case_name(DBDParser.Field_case_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_case_name}.
	 * @param ctx the parse tree
	 */
	void exitField_case_name(DBDParser.Field_case_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_dependson}.
	 * @param ctx the parse tree
	 */
	void enterField_dependson(DBDParser.Field_dependsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_dependson}.
	 * @param ctx the parse tree
	 */
	void exitField_dependson(DBDParser.Field_dependsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_min_occurs}.
	 * @param ctx the parse tree
	 */
	void enterField_min_occurs(DBDParser.Field_min_occursContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_min_occurs}.
	 * @param ctx the parse tree
	 */
	void exitField_min_occurs(DBDParser.Field_min_occursContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_max_occurs}.
	 * @param ctx the parse tree
	 */
	void enterField_max_occurs(DBDParser.Field_max_occursContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_max_occurs}.
	 * @param ctx the parse tree
	 */
	void exitField_max_occurs(DBDParser.Field_max_occursContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_parent}.
	 * @param ctx the parse tree
	 */
	void enterField_parent(DBDParser.Field_parentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_parent}.
	 * @param ctx the parse tree
	 */
	void exitField_parent(DBDParser.Field_parentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_redefines}.
	 * @param ctx the parse tree
	 */
	void enterField_redefines(DBDParser.Field_redefinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_redefines}.
	 * @param ctx the parse tree
	 */
	void exitField_redefines(DBDParser.Field_redefinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBDParser#field_remarks}.
	 * @param ctx the parse tree
	 */
	void enterField_remarks(DBDParser.Field_remarksContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBDParser#field_remarks}.
	 * @param ctx the parse tree
	 */
	void exitField_remarks(DBDParser.Field_remarksContext ctx);
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