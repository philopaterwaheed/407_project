grammar Bank;

options {
    language = Java;
}

class_definition : 'class' class_name '{' member_declarations '}' ;

class_name: ID ;

function_definition
    :( return_type function_name '(' parameters? ')' 
    | deposit_function 
    | create_account_function
    | withdraw_function
    | transfer_funds_function
    | display_all_accounts_function body )body
    ;

return_type
    : 'void' | 'int' | 'double' | 'string' | 'bool' | custom_type
    ;

function_name
    : ID
    ;

parameters
    : parameter (',' parameter)*
    ;

parameter
    : type ID
    ;

type : ('int' | 'double' | 'string' | custom_type | 'vector' '<' type '>') ('*')? ;

custom_type : ID;

body : '{' statements '}' | statement ;

statements
    : statement*
    ;

statement
    : declaration
    | assignment
    | function_call
    | control_structure
    | return_statement
    | output
    | input
    | pointer
    ;

declaration: type variables ('=' expression)?  ';' ;

variables : ID (',' ID)*;


assignment
    : ID '=' expression ';'
    ;

expression
    : term (('+' | '-') term)*
    ;

term
    : factor (('*' | '/') factor)*
    ;

factor
    : function_call
    | literal
    | '(' expression ')'
    | string_literal
    | ID
    | manipulators
    | 'nullptr'
    ;


literal
    : integer_literal
    | float_literal
    | string_literal
    ;

integer_literal
    : DIGIT+
    ;

float_literal
    : DIGIT+ '.' DIGIT+
    ;

string_literal
    : '"' (~'"')* '"'
    ;

function_call
    : (function_name | 'deposit' | 'withdraw' | 'display') '(' arguments? ')'
    ;

arguments
    : expression (',' expression)*
    ;

return_statement : 'return' expression? ';' ;


control_structure
    : if_statement
    | for_loop
    | while_loop
    | do_while_loop
    | switch_cases
    ;

compilation_unit : (include | name_space)*;
    
include: '#include' (lib | header);

lib: '<' (~('\r' | '\n' | '>'))* '>';

header: '"' (~('\r' | '\n' | '"'))* '"';

name_space : 'using' 'namespace' ID ';';

if_statement : 'if' '(' condition ')' body  ('else' body)? ;

switch_statment : 'switch' '(' expression ')'  '{' switch_cases+  default_case? '}' ;

switch_cases : 'case' expression ':' statements break_statement?;

default_case: 'default' ':'  statements;

break_statement: 'break' ';';

for_loop : 'for' '(' (declaration expression ';' expression | ('const'? 'auto' ID ':' ID)) ')' body ;

while_loop : 'while' '(' expression ')' body ;

do_while_loop : 'do' body 'while' '(' expression ')' ';' ;

static_member
    : 'static' type ID
    ;

input : 'cin' ('>>' expression)* ';' ;
output : 'cout' ( '<<' (expression | function_call) )+ ('<<' 'endl')? ';' ;


manipulators
    : 'left' | 'right' | 'setw'
    ;

file_operation
    : open_file
    | write_to_file
    | close_file
    ;

open_file
    : 'ifstream' file_name
    ;

write_to_file
    : 'ofstream' file_name
    ;

close_file
    : file_stream '.close()'
    ;

file_name
    : ID
    ;

file_stream
    : ID
    ;


function_declarations
    : (create_account_function
    | deposit_function
    | withdraw_function
    | transfer_funds_function
    | display_all_accounts_function
    | function_definition)*
    ;


amount
    : expression
    ;

amount_value : DIGIT+  ('.' DIGIT+)? ;
    
condition: boolean_expression* ;
    
boolean_expression: and_exp ( '||' and_exp )*;

and_exp : bitwiseOR_exp  ( '&&' bitwiseOR_exp)*;

bitwiseOR_exp : bitwiseXOR_exp ( '|' bitwiseXOR_exp)* ;	

bitwiseXOR_exp : bitwiseAND_exp ( '^' bitwiseAND_exp)* ;	

bitwiseAND_exp : equality_exp ( '&' equality_exp)*;	

equality_exp: relational_exp ( ('==' | '!=') relational_exp)*;

relational_exp: unary_exp ( ( '<' | '>' | '<=' | '>=' ) unary_exp )*;

unary_exp: primary_exp | '!' unary_exp;

primary_exp : '(' boolean_expression ')' | ( ID | expression | BOOLEAN | pointer_access);  

pointer: pointer_access ';';

pointer_access : ID '->' function_call;

ID : LETTER (LETTER | DIGIT | '_')* ;

DIGIT : '0'..'9' ;
    
BOOLEAN : 'true' | 'false' ;

LETTER : 'a'..'z' | 'A'..'Z' ;

WS: (' '|'\n'|'\r'|'\t')+ {skip();} ;

COMMENT : ('//' ~( '\r'|'\n'|'\r\n')* ) | ('/*' (options {greedy=false;} : .)* '*/') {skip();} ;
