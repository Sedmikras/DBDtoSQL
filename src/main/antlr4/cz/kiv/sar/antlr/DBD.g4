grammar DBD;

source: dbd dataset segment* end;

dbd: 'DBD ' dbd_params;

dbd_params
    : dbd_param ',' dbd_params
    | dbd_param ;

dbd_param
    : dbd_name
    | dbd_access
    | dbd_rmname
    | dbd_dbver
    | dbd_passwd
    | dbd_exit
    | dbd_version
    | dbd_datxexit
    | dbd_encoding
    | dbd_remarks ;

dbd_name: 'NAME=' String;

dbd_access: 'ACCESS=' dbd_access_value;

dbd_access_value
    : '(' access_method ',' operating_method ')'
    | access_method
    ;

dbd_rmname: 'RMNAME=' dbd_rmname_value;

dbd_rmname_value
    : '(' String ',' String ',' String ',' String ')'
    | '(' String ',' String ',' String ')'
    | '(' String ',' String ')'
    | String
    ;

dbd_dbver: 'DBVER=' Number;

dbd_passwd: 'PASSWD=' bool_string;

// todo ignoring other exit types
dbd_exit: 'EXIT=(NONE)';

dbd_version: 'VERSION=' String;

dbd_datxexit: 'DATXEXIT=' bool_string;

dbd_encoding: 'ENCODING=' String;

dbd_remarks: 'REMARKS=' String ;

access_method
    : 'GSAM'
    | 'HDAM'
    | 'HIDAM'
    | 'HISAM'
    | 'SHISAM'
    | 'HSAM'
    | 'SHSAM'
    | 'INDEX'
    | 'LOGICAL'
    | 'MSDB'
    | 'PHDAM'
    | 'PHIDAM'
    | 'PSINDEX'
    | 'DEDB'
    ;

operating_method
    : 'BSAM'
    | 'VSAM'
    | 'OSAM'
    ;

dataset
    : dataset_without_label
    | dataset_with_label ;

dataset_with_label: String 'DATASET ' dataset_params;

dataset_without_label: 'DATASET ' dataset_params;

dataset_params
    : dataset_param ',' dataset_params
    | dataset_param ;

dataset_param
    : dataset_dd1
    | dataset_size
    | dataset_block
    | dataset_device
    | dataset_scan
    | dataset_frspc
    | dataset_searcha
    | dataset_remarks ;

dataset_dd1: 'DD1=' String;

dataset_size: 'SIZE=' String;

dataset_block: 'BLOCK=' String;

dataset_device: 'DEVICE=' String;

dataset_scan: 'SCAN=' String;

dataset_frspc: 'FRSPC=(' String ')';

dataset_searcha: 'SEARCHA=' Number;

dataset_remarks: 'REMARKS=' String;

segment: segment_definition field*;

segment_definition: 'SEGM ' segment_params ;

segment_params
    : segment_param ',' segment_params
    | segment_param ;

segment_param
    : segment_name
    | segment_external_name
    | segment_parent
    | segment_source
    | segment_bytes
    | segment_freq
    | segment_ptr
    | segment_rules
    | segment_exit
    | segment_comprtn
    | segment_encoding
    | segment_remarks;

segment_name: 'NAME=' String;

segment_external_name: 'EXTERNALNAME=' String;

segment_parent: 'PARENT=' segment_parent_value;

segment_parent_value
    : '(' segment_parent_value_1 ',' segment_parent_value_2 ')'
    | '(' segment_parent_value_1 ')'
    | String ;

segment_parent_value_1
    : String ',' segment_parent_type_1
    | String ;

segment_parent_type_1
    : 'SNGL'
    | 'DBLE' ;

segment_parent_value_2
    : '(' String ',' segment_parent_type_2 ',' String ')'
    | '(' String ',' segment_parent_type_2 ')'
    | '(' String ')' ;

segment_parent_type_2
    : 'VIRTUAL'
    | 'PHYSICAL' ;

segment_source: 'SOURCE=(' String ',' 'DATA' ',' String ')';

segment_bytes: 'BYTES=' segment_bytes_value;

segment_bytes_value
    : '(' String ',' String ')'
    | String ;

segment_freq: 'FREQ=' String;

segment_ptr
    : 'POINTER=(' segment_ptr_value ')'
    | 'PTR=(' segment_ptr_value ')' ;

segment_ptr_value
    : segment_ptr_type_1 (',' segment_ptr_type_2)? ',LPARNT'? ',CTR'? ',PAIRED'? ;

segment_ptr_type_1
    : 'HIER' | 'H'
    | 'HIERBWD' | 'HB'
    | 'TWIN' | 'T'
    | 'TWINBWD' | 'TB'
    | 'NOTWIN' | 'NT' ;

segment_ptr_type_2
    : 'LTWIN' | 'LT'
    | 'LTWINBWD' | 'LTB' ;

segment_rules: 'RULES=(' segment_rules_value ')';

segment_rules_value: segment_rules_type_1 segment_rules_type_2 segment_rules_type_3 ',' segment_rules_type_4 ;

segment_rules_type_1
    : 'L'
    | 'P'
    | 'V' ;

segment_rules_type_2
    : 'L'
    | 'P'
    | 'V'
    | 'B' ;

segment_rules_type_3
    : 'L'
    | 'P'
    | 'V' ;

segment_rules_type_4
    : 'LAST'
    | 'FIRST'
    | 'HERE' ;

// todo ignoring other exit types
segment_exit: 'EXIT=(NONE)' ;

segment_comprtn: 'COMPRTN=(' String ')';

segment_encoding: 'ENCODING=' String;

segment_remarks: 'REMARKS=' String;

field: 'FIELD ' field_params ;

field_params
    : field_param ',' field_params
    | field_param ;

field_param
    : field_name
    | field_external_name
    | field_bytes
    | field_start
    | field_max_bytes
    | field_start_after
    | field_rel_start
    | field_datatype
    | field_type
    | field_case_name
    | field_dependson
    | field_min_occurs
    | field_max_occurs
    | field_parent
    | field_redefines
    | field_remarks ;

field_name: 'NAME=' field_name_value;

field_name_value
    : '(' String ',' 'SEQ' ',' field_name_value_type ')'
    | String ;

field_name_value_type
    : 'U'
    | 'M' ;

field_external_name: 'EXTERALNAME=' String;

field_bytes: 'BYTES=' String;

field_max_bytes: 'MAXBYTES=' String;

field_start: 'START=' String;

field_start_after: 'STARTAFTER=' String;

field_rel_start: 'RELSTART=' String;

field_datatype: 'DATATYPE=' field_datatype_value;

field_datatype_value
    : 'ARRAY'
    | 'BINARY'
    | 'BIT'
    | 'BYTE'
    | 'UBYTE'
    | 'CHAR'
    | 'DATE'
    | 'DECIMAL(' String ',' String ')'
    | 'DOUBLE'
    | 'FLOAT'
    | 'INT'
    | 'UINT'
    | 'LONG'
    | 'ULONG'
    | 'OTHER'
    | 'SHORT'
    | 'USHORT'
    | 'STRUCT'
    | 'TIME'
    | 'TIMESTAMP'
    | 'XML' ;

field_type: 'TYPE=' field_type_value;

field_type_value
    : 'C'
    | 'X'
    | 'P' ;

field_case_name: 'CASENAME=' String;

field_dependson: 'DEPENDSON=' String;

field_min_occurs: 'MINOCCURS=' String;

field_max_occurs: 'MAXOCCURS=' String;

field_parent: 'PARENT=' String;

field_redefines: 'REDEFINES=' String;

field_remarks: 'REMARKS=' String;

end: 'DBDGEN' 'FINISH'? 'END';

bool_string
    : 'YES'
    | 'NO'
    ;

String
    : [a-zA-Z0-9]+
    | Number;

Number
 : Int ( '.' Digit* )?
 ;

WS: [ \t\r\n]+ -> skip ;

Int
 : [1-9] Digit*
 | '0'
 ;

Digit
 : [0-9]
 ;