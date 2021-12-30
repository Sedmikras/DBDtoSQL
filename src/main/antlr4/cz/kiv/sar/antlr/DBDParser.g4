parser grammar DBDParser;

//import DBDLexer;

options { tokenVocab=DBDLexer; } // use tokens from DBDLexer.g4

source: title? dbd dataset segment* end;

title: TITLE QUOTE TEXT_String QUOTE;

dbd: DBD params;

params
    : param COM params
    | param ;

param: param_name EQUAL values;

param_name: String;

value
    : String
    | String LPAREN values RPAREN
    | LPAREN values RPAREN;

values
    : value COM values
    | value ;

dataset
    : dataset_without_label
    | dataset_with_label ;

dataset_with_label: String DATASET params;

dataset_without_label: DATASET params;

segment: segment_definition (field | lchild)*;

segment_definition: SEGM params ;

field: FIELD params ;

lchild: LCHILD params xdfld*;

xdfld: XDFLD params;

end: DBD_GEN FINISH? END;