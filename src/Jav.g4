grammar Jav;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;							

Digit : [0-9]+ ;

ADD:'+';

SUB:'-';

MUL:'*' ;

DIV:'/' ;

MOD:'%' ;

arith_op: ADD | SUB | MUL | DIV | MOD;

bool_value : 'TRUE' | 'FALSE';

int_value : Digit;  
  
COMMA : ',' ;

EQ2 : '==' ;

EQ : '=' ;

NOT_EQ : '!=' ;

LT : '<' ;

GT : '>';

LT_EQ : '<=' ;

GT_EQ : '>=';

rel_op:EQ2|NOT_EQ|LT|GT|LT_EQ|GT_EQ;

value: bool_value | int_value;

type:'int'|'boolean';													

declr: type ID EQ value;												

var: ID | ID Digit;														

var_1: ID | ID Digit;

var_2: ID | ID Digit ;

back:'return' var|'return' WS ;											

assign: ID EQ value | ID EQ var;										

parameter : type ID;

arith_expr : var EQ var_1 (arith_op var_2)+ | type var EQ var_1 (arith_op var_2)+; 	

gen_expr : var_1 rel_op  var_2 | var_1 rel_op Digit;				

param : type ID;

open_sq : '<<';

close_sq : '>>';

double_colon : '::';

stack_declr : 'stack' ID;											

stack_push : ID'.push' open_sq (var|Digit) close_sq;					

stack_pop : type ID EQ var'.pop' | ID EQ var'.pop';					

display : 'print' double_colon var;									

loop : 'while' open_sq gen_expr close_sq  body;						

open_brace : '{';

close_brace : '}';

body : open_brace (statement)+ close_brace; 						

if_else : 'if' open_sq gen_expr close_sq body els;					

els : 'else' body | 'else if' body | WS;							

parameters : (param (COMMA param)*)*;								

arguments : ( ID (COMMA ID) *)*;

inc : ID'++';														

dec : ID'--';														

methodcall : 'Methodcall' ID open_sq arguments close_sq;							

methodstmt : 'method' ID open_sq parameters close_sq body;			

fact_call : type ID EQ var_1 '*' methodcall;						

statement : declr | methodcall | arith_expr | gen_expr | loop | if_else | parameter | fact_call | stack_push | stack_pop | stack_declr | display | assign | back | inc | dec;

start : (statement | methodstmt | methodcall)+;			

WS : [ \t\r\n]+ ->skip;									



