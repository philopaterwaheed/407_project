grammar Bank;

options {
    language = Java;
}

start: top_level ;

top_level : compilation_unit ( function_definition | class_definition | declaration )+ ;


//======================================== compilation_unit ============================================

compilation_unit : (include | name_space)* ;

include : '#include' (lib | header) ;

lib : '<' (~('\r' | '\n' | '>'))* '>' ;

header : '"' (~('\r' | '\n' | '"'))* '"' ;

name_space : 'using' 'namespace' ID ('::' ID)* ';' ;

//======================================== compilation_unit ============================================


//======================================== function_definition ===========================================

function_definition : return_type function_name '(' parameters? ')' body ;

function_name : ID ;

parameters : parameter (',' parameter)* ;

parameter : type ID ;

//======================================== function_definition ===========================================


//============================================= body ================================================

body : '{' statements '}' | statement ;

statements : (statement)* ;

statement
    : declaration
    | assignment ';'
    | member_access ';'
    | control_structure
    | return_statement
    | output
    | input
    | delete_statement
    ;
    
assignment : ID  ('=' | '+=' | '-=')  expression ;

delete_statement : 'delete' expression ';' ;

return_statement : 'return' expression? ';' ;

//========================================= function_body =============================================


//========================================= control_structure ===========================================

control_structure : if_statement | for_loop | while_loop | do_while_loop | switch_statement ;

if_statement : IF '(' expression ')' body else_statement? ;

else_statement : ELSE body ;

for_loop : FOR '(' 'const'? 'auto' '&'? ID ':' expression ')' body ;

while_loop : 'while' '(' (expression | file_input) ')' body ;

do_while_loop : 'do' body 'while' '(' expression ')' ';' ;

switch_statement : 'switch' '(' expression ')' '{' switch_cases+ default_case? '}' ;

switch_cases : 'case' expression ':' statements break_statement? ;

default_case : 'default' ':' statements ;

break_statement : 'break' ';' ;

//========================================= control_structure ===========================================


//============================================= type=================================================

type : (base_type | vector_type | ID) ('*')? ;

return_type : base_type | 'void' ;

base_type : 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float' ;

vector_type : 'vector' '<' type '>';

//============================================= type=================================================


//===========================================declaration==============================================

declaration: ( variable_declaration  | file_declaration ) ';';

variable_declaration : type variables; 

variables : declarator ( ',' declarator )*;

declarator : ID ( '::' ID )? ( ( '=' expression ) | ( '(' arguments? ')' ))? ;

file_declaration : ('ofstream' | 'ifstream') ID '(' string_literal ')' ;

arguments : expression (',' expression)* ;

//===========================================declaration==============================================


//=========================================class_definition=============================================

class_definition : CLASS ID (':' class_visibility ID)? '{' class_members '}' ';';

class_members : (class_member)*;
 
class_member : (class_visibility ':')? ( class_declaration | constructor | class_function_definition | destructor );

class_declaration : 'static'? declaration;

class_visibility : ('public' | 'private' | 'protected') ;

constructor : 'virtual'? ID '(' parameters? ')' ( ':' ( function_call ( ',' function_call )* ) )? class_function_body ;

destructor : 'virtual'? '~' ID '(' parameters? ')' ( ':' ( function_call ( ',' function_call )* ) )?  class_function_body;

class_function_definition : 'virtual'? return_type function_name '(' parameters? ')' 'const'?  class_function_body ;

class_function_body: '{' statements '}';

//=========================================class_definition=============================================


//===========================================expression==============================================

expression:  boolean_expression;

boolean_expression : and_exp ('||' and_exp)* ;

and_exp : equality_exp ('&&' equality_exp)* ;

equality_exp : relational_exp (('==' | '!=') relational_exp)* ;

relational_exp : unary_exp (('<' | '>' | '<=' | '>=') unary_exp)* ;

unary_exp : arithmetic_expression | '!' unary_exp ;

arithmetic_expression : term (('+' | '-') term)*;
    
term : factor (('*' | '/') factor)* ;

factor : '(' arithmetic_expression ')' | ID | change | true_false | integer_literal | string_literal | object_decleration | member_access;// | member_access | function_call | object_decleration |  change | 'nullptr'  |  ;

true_false : BOOLEAN;

member_access :  function_access | pointer_access ;

function_access : ID '.' ID  ( '(' arguments? ')' )? ;

pointer_access : ID ('->' | '.') ID ('(' arguments? ')')? ;

function_call : ID '(' arguments? ')';

object_decleration : 'new' function_call;

change : ( ('++' | '--') ID | ID ('++' | '--') ) ;

//===========================================expression==============================================


//=============================================literal================================================

integer_literal : DIGIT+ ;

float_literal : DIGIT+ '.' DIGIT+ ;

string_literal : '"' (~'"')* '"' ;

character_literal : '\'' (~('\'' | '\\'))* '\'' ;

//=============================================literal================================================


//============================================output================================================

output :  ('cout' | ID) ('<<' (expression | 'endl' | manipulators))* ';' ;

manipulators : 'left' | 'right' | 'setw' '(' expression ')' | 'string' '(' expression ',' character_literal ')' ;

//============================================output================================================


//=============================================input================================================

input
: stream ('>>' expression)+ ';'
| 'getline' '(' stream ',' ID (',' character_literal)? ')' ';'
|   stream '.ignore' '(' ')' ';'
;

file_input : ID ('>>' expression)+
| 'getline' '(' stream ',' ID ')'
|   stream '.ignore' '(' ')';

stream : 'cin' | ID ;

//=============================================input================================================

BOOLEAN : 'true' | 'false' ;

CLASS : 'class' ;

IF : 'if' ;

ELSE : 'else' ;

FOR : 'for' ;

ID : ('a'..'z' | 'A'..'Z') ( 'a'..'z' | 'A'..'Z' | DIGIT | '_')* ;

DIGIT : '0'..'9' ;

WS : (' ' | '\n' | '\r' | '\t')+ {skip();} ;

COMMENT : ('//' ~( '\t' | '\r' | '\n' | '\r\n' )* ) | ('/*' (options {greedy=false;} : .)* '*/') {skip();} ;
