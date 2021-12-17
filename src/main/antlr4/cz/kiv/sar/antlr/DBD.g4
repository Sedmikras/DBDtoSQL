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

dbd_name: 'NAME=' NAME;

dbd_access: 'ACCESS=' dbd_access_value;

dbd_access_value
    : '(' access_method ',' operating_method ')'
    | access_method
    ;

dbd_rmname: 'RMNAME=' dbd_rmname_value;

dbd_rmname_value
    : '(' NAME ',' STRING ',' STRING ',' STRING ')'
    | '(' NAME ',' STRING ',' STRING ')'
    | '(' NAME ',' STRING ')'
    | NAME
    ;

dbd_dbver: 'DBVER=' Number;

dbd_passwd: 'PASSWD=' bool_string;

// todo ignoring other exit types
dbd_exit: 'EXIT=(NONE)';

dbd_version: 'VERSION=' NAME;

dbd_datxexit: 'DATXEXIT=' bool_string;

dbd_encoding: 'ENCODING=' NAME;

dbd_remarks: 'REMARKS=\'' STRING '\'';

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

dataset_with_label: STRING 'DATASET ' dataset_params;

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

dataset_dd1: 'DD1=' NAME;

dataset_size: 'SIZE=' STRING;

dataset_block: 'BLOCK=' STRING;

dataset_device: 'DEVICE=' STRING;

dataset_scan: 'SCAN=' STRING;

dataset_frspc: 'FRSPC=(' STRING ')';

dataset_searcha: 'SEARCHA=' Number;

dataset_remarks: 'REMARKS=' STRING;

segment: segment_definition field*;

segment_definition: 'SEGM ' segment_params ;

segment_params
    : segment_param ',' segment_params
    | segment_param ;

segment_param
    : segment_name
    | segment_parent
    | segment_bytes
    | segment_ptr ;

segment_name: 'NAME=' NAME;

segment_parent: 'PARENT=' STRING;

segment_bytes: 'BYTES=' STRING;

segment_ptr: 'PTR=(T)';

field: 'FIELD ' field_params ;

field_params
    : field_param ',' field_params
    | field_param ;

field_param
    : field_name
    | field_bytes
    | field_start
    | field_datatype
    | field_type ;

field_name
    : 'NAME=' NAME
    | 'NAME=(' STRING ',' STRING ',' STRING ')';

field_bytes: 'BYTES=' STRING;

field_start: 'START=' STRING;

field_datatype: 'DATATYPE=' STRING;

field_type: 'TYPE=' STRING;

end: 'todo';

bool_string
    : 'YES'
    | 'NO'
    ;

NAME: [a-zA-Z][a-zA-Z0-9]*;
STRING: [a-zA-Z0-9]+;
//NUMBER: [1-9][0-9]*;
ANY: .;

Number
 : Int ( '.' Digit* )?
 ;

WS: [ \t\r\n]+ -> skip ;

fragment Int
 : [1-9] Digit*
 | '0'
 ;

fragment Digit
 : [0-9]
 ;