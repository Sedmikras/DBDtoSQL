grammar DBD;

source: dbd dataset segments end;

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
    : access_method
    | '(' access_method ',' operating_method ')'
    ;

dbd_rmname: 'RMNAME' dbd_rmname_value;

dbd_rmname_value
    : NAME
    | '(' NAME ',' NUMBER ')'
    | '(' NAME ',' NUMBER ',' NUMBER ')'
    | '(' NAME ',' NUMBER ',' NUMBER ',' NUMBER ')'
    ;

dbd_dbver: 'DBVER=' NUMBER;

dbd_passwd: 'PASSWD=' bool_string;

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

dataset: 'DATASET ' dataset_dd1;

dataset_dd1: 'DD1=' NAME;

dataset_size: 'SIZE=' NUMBER;

segments: 'todo';

end: 'todo';

bool_string
    : 'YES'
    | 'NO'
    ;

NAME: [a-zA-Z][a-zA-Z0-9]*;
STRING: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [1-9][0-9]*;
ANY: .;
WS : [ \t\r\n]+ -> skip ;