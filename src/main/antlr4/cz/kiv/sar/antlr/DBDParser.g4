grammar DBDParser;

//import DBDLexer;

// options { tokenVocab=DBDLexer; } // use tokens from DBDLexer.g4

source: dbd dataset segment* end;

dbd: DBD dbd_params;

dbd_params
    : dbd_param COM dbd_params
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

dbd_name: NAME EQUAL String;

dbd_access: ACCESS EQUAL dbd_access_value;

dbd_access_value
    : LPAREN access_method COM operating_method RPAREN
    | access_method
    ;

dbd_rmname: RMNAME EQUAL dbd_rmname_value;

dbd_rmname_value
    : LPAREN String COM String COM String COM String RPAREN
    | LPAREN String COM String COM String RPAREN
    | LPAREN String COM String RPAREN
    | String
    ;

dbd_dbver: DBVER EQUAL Number;

dbd_passwd: PASSWD EQUAL bool_string;

// todo ignoring other exit types
dbd_exit: EXIT EQUAL LPAREN NONE RPAREN;

dbd_version: VERSION EQUAL String;

dbd_datxexit: DATXEXIT EQUAL bool_string;

dbd_encoding: ENCODING EQUAL String;

dbd_remarks: REMARKS EQUAL String ;

access_method: String;/*
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
    ;*/

operating_method: String;/*
    : 'BSAM'
    | 'VSAM'
    | 'OSAM'
    ;*/

dataset
    : dataset_without_label
    | dataset_with_label ;

dataset_with_label: String DATASET dataset_params;

dataset_without_label: DATASET dataset_params;

dataset_params
    : dataset_param COM dataset_params
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

dataset_dd1: DD1 EQUAL String;

dataset_size: SIZE EQUAL String;

dataset_block: BLOCK EQUAL String;

dataset_device: DEVICE EQUAL String;

dataset_scan: SCAN EQUAL String;

dataset_frspc: FRSPC EQUAL LPAREN String RPAREN;

dataset_searcha: SEARCHA EQUAL Number;

dataset_remarks: REMARKS EQUAL String;

segment: segment_definition (field | lchild)*;

segment_definition: SEGM segment_params ;

segment_params
    : segment_param COM segment_params
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

segment_name: NAME EQUAL String;

segment_external_name: EXTERNAL_NAME EQUAL String;

segment_parent: PARENT EQUAL segment_parent_value;

segment_parent_value
    : LPAREN segment_parent_value_1 COM segment_parent_value_2 RPAREN
    | LPAREN segment_parent_value_1 RPAREN
    | String ;

segment_parent_value_1
    : String COM segment_parent_type_1
    | String ;

segment_parent_type_1: String;/*
    : 'SNGL'
    | 'DBLE' ;*/

segment_parent_value_2
    : LPAREN String COM segment_parent_type_2 COM String RPAREN
    | LPAREN String COM segment_parent_type_2 RPAREN
    | LPAREN String RPAREN ;

segment_parent_type_2: String;/*
    : 'VIRTUAL'
    | 'PHYSICAL' ;*/

segment_source: SOURCE EQUAL LPAREN String COM DATA COM String RPAREN;

segment_bytes: BYTES EQUAL segment_bytes_value;

segment_bytes_value
    : LPAREN String COM String RPAREN
    | String ;

segment_freq: FREQ EQUAL String;

segment_ptr: POINTER EQUAL LPAREN segment_ptr_value RPAREN;

segment_ptr_value
    : segment_ptr_type_1 (COM segment_ptr_type_2)? (COM String)? (COM String)? (COM String)? ;

segment_ptr_type_1: String;/*
    : 'HIER' | 'H'
    | 'HIERBWD' | 'HB'
    | 'TWIN' | 'T'
    | 'TWINBWD' | 'TB'
    | 'NOTWIN' | 'NT' ;*/

segment_ptr_type_2: String;/*
    : 'LTWIN' | 'LT'
    | 'LTWINBWD' | 'LTB' ;*/

segment_rules: RULES EQUAL LPAREN segment_rules_value RPAREN;

segment_rules_value: segment_rules_type_1 segment_rules_type_2 segment_rules_type_3 COM segment_rules_type_4 ;

segment_rules_type_1: String;/*
    : 'L'
    | 'P'
    | 'V' ;*/

segment_rules_type_2: String;/*
    : 'L'
    | 'P'
    | 'V'
    | 'B' ;*/

segment_rules_type_3: String;/*
    : 'L'
    | 'P'
    | 'V' ;*/

segment_rules_type_4: String;/*
    : 'LAST'
    | 'FIRST'
    | 'HERE' ;*/

// todo ignoring other exit types
segment_exit: EXIT EQUAL LPAREN NONE RPAREN ;

segment_comprtn: COMPRTN EQUAL LPAREN String RPAREN;

segment_encoding: ENCODING EQUAL String;

segment_remarks: REMARKS EQUAL String;

field: FIELD field_params ;

field_params
    : field_param COM field_params
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

field_name: NAME EQUAL field_name_value;

field_name_value
    : LPAREN String COM String COM field_name_value_type RPAREN
    | String ;

field_name_value_type: String;/*
    : 'U'
    | 'M' ;*/

field_external_name: EXTERNAL_NAME EQUAL String;

field_bytes: BYTES EQUAL String;

field_max_bytes: MAXBYTES EQUAL String;

field_start: START EQUAL String;

field_start_after: STARTAFTER EQUAL String;

field_rel_start: RELSTART EQUAL String;

field_datatype: DATATYPE EQUAL field_datatype_value;

field_datatype_value
    : String
    | String LPAREN String COM String RPAREN ;
    /*
    : 'ARRAY'
    | 'BINARY'
    | 'BIT'
    | 'BYTE'
    | 'UBYTE'
    | 'CHAR'
    | 'DATE'
    | 'DECIMAL' LPAREN String COM String RPAREN
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
    | 'XML' ;*/

field_type: TYPE EQUAL field_type_value;

field_type_value: String;/*
    : 'C'
    | 'X'
    | 'P' ;*/

field_case_name: CASENAME EQUAL String;

field_dependson: DEPENDSON EQUAL String;

field_min_occurs: MINOCCURS EQUAL String;

field_max_occurs: MAXOCCURS EQUAL String;

field_parent: PARENT EQUAL String;

field_redefines: REDEFINES EQUAL String;

field_remarks: REMARKS EQUAL String;

lchild: LCHILD lchild_params xdfld+;

lchild_params
    : lchild_param COM lchild_params
    | lchild_param ;

lchild_param
    : lchild_name
    | lchild_ptr
    | lchild_pair
    | lchild_rules
    | lchild_remarks ;

lchild_name: NAME EQUAL lchild_name_params;

lchild_name_params
    : LPAREN String COM String RPAREN ;

lchild_ptr: POINTER EQUAL lchild_ptr_type;

lchild_ptr_type: String;/*
    : 'SNGL'
    | 'DBLE'
    | 'NONE'
    | 'SYMB'
    | 'INDX';*/

lchild_pair: PAIR EQUAL String ;

lchild_rules: RULES EQUAL lchild_rules_type ;

lchild_rules_type: String;/*
    : 'LAST'
    | 'FIRST'
    | 'HERE' ;*/

lchild_remarks: REMARKS EQUAL String;

xdfld: XDFLD xdfld_params;

xdfld_params
    : xdfld_param COM xdfld_params
    | xdfld_param ;

xdfld_param
    : xdfld_name
    | xdfld_segment
    | xdfld_const
    | xdfld_srch
    | xdfld_subseq
    | xdfld_ddata
    | xdfld_nullval
    | xdfld_extrtn
    | xdfld_remarks
    | xdfld_externalname ;

xdfld_name: NAME EQUAL String;

xdfld_segment: SEGMENT EQUAL String;

xdfld_const: CONST EQUAL String;

xdfld_srch: SRCH EQUAL String;

xdfld_subseq: SUBSEQ EQUAL String;

xdfld_ddata: DDATA EQUAL String;

xdfld_nullval: NULLVAL EQUAL String;

xdfld_extrtn: EXTRTN EQUAL String;

xdfld_remarks: REMARKS EQUAL String;

xdfld_externalname: EXTERNAL_NAME EQUAL String;

end: DBD_GEN FINISH? END;

bool_string: String;/*
    : 'YES'
    | 'NO'
    ;*/

EQUAL: '=';// -> pushMode(PARAM);
COM : ',';
    LPAREN: '(';
    RPAREN: ')';

DBD: 'DBD';
DBD_GEN: 'DBDGEN';
FINISH: 'FINISH';
END: 'END';

NAME: 'NAME';
ACCESS: 'ACCESS';
RMNAME: 'RMNAME';
DBVER: 'DBVER';
PASSWD: 'PASSWD';
EXIT: 'EXIT';
NONE: 'NONE';
VERSION: 'VERSION';
DATXEXIT: 'DATXEXIT';
ENCODING: 'ENCODING';
REMARKS: 'REMARKS';

DATASET: 'DATASET';
DD1: 'DD1';
SIZE: 'SIZE';
BLOCK: 'BLOCK';
DEVICE: 'DEVICE';
SCAN: 'SCAN';
FRSPC: 'FRSPC';
SEARCHA: 'SEARCHA';

SEGM: 'SEGM';
EXTERNAL_NAME: 'EXTERNALNAME';
PARENT: 'PARENT';
SOURCE: 'SOURCE';
BYTES: 'BYTES';
DATA: 'DATA';
FREQ: 'FREQ';
POINTER: 'POINTER' | 'PTR';
RULES: 'RULES';
COMPRTN: 'COMPRTN';

FIELD: 'FIELD';
MAXBYTES: 'MAXBYTES';
START: 'START';
STARTAFTER: 'STARTAFTER';
RELSTART: 'RELSTART';
DATATYPE: 'DATATYPE';
TYPE: 'TYPE';
CASENAME: 'CASENAME';
DEPENDSON: 'DEPENDSON';
MINOCCURS: 'MINOCCURS';
MAXOCCURS: 'MAXOCCURS';
REDEFINES: 'REDEFINES';

LCHILD: 'LCHILD';
PAIR: 'PAIR';
XDFLD: 'XDFLD';
SEGMENT: 'SEGMENT';
CONST: 'CONST';
SRCH: 'SRCH';
SUBSEQ: 'SUBSEQ';
DDATA: 'DDATA';
NULLVAL: 'NULLVAL';
EXTRTN: 'EXTRTN';

WS: [ \t\r\n]+ -> skip ;
//Any: .*;

String: [a-zA-Z0-9]+;

Int
 : [1-9] Digit*
 | '0'
 ;

Number
 : Int ( '.' Digit* )?
 ;

Digit
 : [0-9]
 ;