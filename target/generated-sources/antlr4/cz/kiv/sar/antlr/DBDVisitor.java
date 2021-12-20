// Generated from cz\kiv\sar\antlr\DBD.g4 by ANTLR 4.9.3
package cz.kiv.sar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DBDParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DBDVisitor<T> extends ParseTreeVisitor<T> {
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
	 * Visit a parse tree produced by {@link DBDParser#dbd_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_params(DBDParser.Dbd_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_param(DBDParser.Dbd_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_name(DBDParser.Dbd_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_access(DBDParser.Dbd_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_access_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_access_value(DBDParser.Dbd_access_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_rmname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_rmname(DBDParser.Dbd_rmnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_rmname_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_rmname_value(DBDParser.Dbd_rmname_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_dbver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_dbver(DBDParser.Dbd_dbverContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_passwd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_passwd(DBDParser.Dbd_passwdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_exit(DBDParser.Dbd_exitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_version(DBDParser.Dbd_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_datxexit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_datxexit(DBDParser.Dbd_datxexitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_encoding(DBDParser.Dbd_encodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dbd_remarks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbd_remarks(DBDParser.Dbd_remarksContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#access_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method(DBDParser.Access_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#operating_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperating_method(DBDParser.Operating_methodContext ctx);
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
	 * Visit a parse tree produced by {@link DBDParser#dataset_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_params(DBDParser.Dataset_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_param(DBDParser.Dataset_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_dd1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_dd1(DBDParser.Dataset_dd1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_size(DBDParser.Dataset_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_block(DBDParser.Dataset_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_device}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_device(DBDParser.Dataset_deviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_scan(DBDParser.Dataset_scanContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_frspc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_frspc(DBDParser.Dataset_frspcContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_searcha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_searcha(DBDParser.Dataset_searchaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#dataset_remarks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_remarks(DBDParser.Dataset_remarksContext ctx);
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
	 * Visit a parse tree produced by {@link DBDParser#segment_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_params(DBDParser.Segment_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_param(DBDParser.Segment_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_name(DBDParser.Segment_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_external_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_external_name(DBDParser.Segment_external_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_parent(DBDParser.Segment_parentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_parent_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_parent_value(DBDParser.Segment_parent_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_parent_value_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_parent_value_1(DBDParser.Segment_parent_value_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_parent_type_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_parent_type_1(DBDParser.Segment_parent_type_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_parent_value_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_parent_value_2(DBDParser.Segment_parent_value_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_parent_type_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_parent_type_2(DBDParser.Segment_parent_type_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_source(DBDParser.Segment_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_bytes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_bytes(DBDParser.Segment_bytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_bytes_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_bytes_value(DBDParser.Segment_bytes_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_freq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_freq(DBDParser.Segment_freqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_ptr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_ptr(DBDParser.Segment_ptrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_ptr_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_ptr_value(DBDParser.Segment_ptr_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_ptr_type_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_ptr_type_1(DBDParser.Segment_ptr_type_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_ptr_type_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_ptr_type_2(DBDParser.Segment_ptr_type_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_rules(DBDParser.Segment_rulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_rules_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_rules_value(DBDParser.Segment_rules_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_rules_type_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_rules_type_1(DBDParser.Segment_rules_type_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_rules_type_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_rules_type_2(DBDParser.Segment_rules_type_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_rules_type_3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_rules_type_3(DBDParser.Segment_rules_type_3Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_rules_type_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_rules_type_4(DBDParser.Segment_rules_type_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_exit(DBDParser.Segment_exitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_comprtn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_comprtn(DBDParser.Segment_comprtnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_encoding(DBDParser.Segment_encodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#segment_remarks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_remarks(DBDParser.Segment_remarksContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(DBDParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_params(DBDParser.Field_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_param(DBDParser.Field_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_name(DBDParser.Field_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_name_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_name_value(DBDParser.Field_name_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_name_value_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_name_value_type(DBDParser.Field_name_value_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_external_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_external_name(DBDParser.Field_external_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_bytes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_bytes(DBDParser.Field_bytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_max_bytes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_max_bytes(DBDParser.Field_max_bytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_start(DBDParser.Field_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_start_after}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_start_after(DBDParser.Field_start_afterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_rel_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_rel_start(DBDParser.Field_rel_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_datatype(DBDParser.Field_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_datatype_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_datatype_value(DBDParser.Field_datatype_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_type(DBDParser.Field_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_type_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_type_value(DBDParser.Field_type_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_case_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_case_name(DBDParser.Field_case_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_dependson}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_dependson(DBDParser.Field_dependsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_min_occurs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_min_occurs(DBDParser.Field_min_occursContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_max_occurs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_max_occurs(DBDParser.Field_max_occursContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_parent(DBDParser.Field_parentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_redefines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_redefines(DBDParser.Field_redefinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#field_remarks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_remarks(DBDParser.Field_remarksContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(DBDParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBDParser#bool_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_string(DBDParser.Bool_stringContext ctx);
}