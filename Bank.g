grammar Bank;

options {
    language = Java;
}

class_visibility : ('public' | 'private' | 'protected') ;

class_return_type : 'int' | 'double' | 'string' | 'bool' ;

class_method : '(' parameters? ')' class_method_body ;

constructor : ID '(' parameters? ')' (':' class_visibility ID)? constructor_body ;

destructor : '~' ID '(' parameters? ')' (':' class_visibility ID)? constructor_body ;

class_void_method
    :( class_visibility ':')? 'void' ID '(' parameters? ')' ('const')? class_method_body
    ;

method_qualifier
    : 'const'
    ;

class_ass : ('=' expression)? ';' ;

class_members : 
    ((class_visibility ':')? 
    (
        (ID constructor | destructor)
        | (class_return_type ID member_declaration 
        | 'virtual' ((class_return_type ID (class_method | class_void_method)) | ID constructor | destructor))
    ))* ;

member_declaration : ((class_method | class_ass) | class_void_method) ;

class_definition : 'class' ID (':' class_visibility ID)? '{' class_members '}' ';';

function_name : ID ;

function_definition : return_type function_name '(' parameters? ')' body ;

return_type : 'void' | 'int' | 'double' | 'string' | 'bool' | custom_type ;

parameters : parameter (',' parameter)* ;

parameter : type ID ;

type : ('int' | 'double' | 'string' | custom_type | 'vector' '<' type '>') ('*')? ;

custom_type : ID ;

body : '{' statements '}' | statement ;

class_method_body : '{' statements '}' ;

constructor_body : '{' constructor_statements '}' ;

constructor_statements : (constructor_statement)* ;

statements : (statement)* ;



statement
    : declaration
    | function_call
    | control_structure
    | return_statement
    | output
    | input
    | assignment ';'
    | pointer_access_statement
    | delete_statement
    | file_operation ';'
    ;

constructor_statement 
    : declaration 
    | function_call 
    | control_structure 
    | output 
    | input 
    | pointer_access_statement 
    | file_operation ';'
    ;

declaration
    : type variables ';'
    | type ID '(' arguments? ')' ';'  // Add this line for constructor calls
    | ('ofstream' | 'ifstream') ID '(' string_literal ')' ';'
    ;

variables : assignment (',' assignment)* ;

assignment : ID (('='|'+='|'-=') expression)? ;

pointer_assignment
    : pointer_access '=' expression ';'
    ;

member_access
    : ID '.' ID
    | ID '.' ID '(' arguments? ')'
    | pointer_access
    ;

pointer_access 
    : ID ('->' | '.') ID ('(' arguments? ')')?
    ;

expression
    : term (('+' | '-') term)*
    | 'new' type (('[' expression ']')|'('arguments')')?
    | literal
    | ID
    | pointer_access
    | member_access
    | ID '(' arguments? ')'
    | type '(' arguments ')'
    ;

term : factor (('*' | '/') factor)* ;

factor : literal | ID | pointer_access | 'nullptr' | '(' expression ')' ;

pointer_access_statement : pointer_access ';' ;

literal
    : integer_literal
    | float_literal
    | string_literal
    | character_literal
    ;

character_literal
    : '\'' (~'\'' | '\\\'')* '\''
    ;

integer_literal : DIGIT+ ;

float_literal : DIGIT+ '.' DIGIT+ ;

string_literal : '"' (~'"')* '"' ;

function_call : ID '(' arguments? ')' ';' ;

arguments : expression (',' expression)* ;

return_statement : 'return' expression? ';' ;

control_structure : if_statement | for_loop | while_loop | do_while_loop | switch_statement ;

compilation_unit : (include | name_space)* ;

include : '#include' (lib | header) ;

lib : '<' (~('\r' | '\n' | '>'))* '>' ;

header : '"' (~('\r' | '\n' | '"'))* '"' ;

name_space : 'using' 'namespace' ID ';' ;

if_statement : 'if' '(' condition ')' body ('else' body)? ;

switch_statement : 'switch' '(' expression ')' '{' switch_cases+ default_case? '}' ;

switch_cases : 'case' expression ':' statements break_statement? ;

default_case : 'default' ':' statements ;

break_statement : 'break' ';' ;

for_loop : 
    'for' '(' 
    (   
        (declaration | expression)? ';' expression? ';' expression? 
    |   
        'const'? 'auto' '&'? ID ':' expression
    ) 
    ')' body ;
    
while_loop : 'while' '(' expression ')' body ;

do_while_loop : 'do' body 'while' '(' expression ')' ';' ;

static_member : 'static' type ID ;
input
: stream ('>>' expression)+ ';'
| 'getline' '(' stream ',' ID (',' character_literal)? ')' ';'
|   stream '.ignore' '(' ')' ';'
;


stream : 'cin' | ID ;

manipulators : 'left' | 'right' | 'setw' '(' expression ')' ;

output : 'cout' ('<<' (expression | string_literal | 'endl' | manipulators))* ';' ;

file_operation
    : ('ofstream' | 'ifstream') ID '(' string_literal ')'
    | ID '.' 'close' '(' ')'
    ;

function_declarations : (function_definition)* ;

amount : expression ;

amount_value : DIGIT+ ('.' DIGIT+)? ;

condition : boolean_expression ;

boolean_expression : and_exp ('||' and_exp)* ;

and_exp : equality_exp ('&&' equality_exp)* ;

equality_exp : relational_exp (('==' | '!=') relational_exp)* ;

relational_exp : unary_exp (('<' | '>' | '<=' | '>=') unary_exp)* ;

unary_exp : primary_exp | '!' unary_exp ;

primary_exp : '(' boolean_expression ')' | (ID | expression | BOOLEAN | pointer_access) ;

delete_statement : 'delete' expression ';' ;

ID : LETTER (LETTER | DIGIT | '_')* ;

DIGIT : '0'..'9' ;

BOOLEAN : 'true' | 'false' ;

LETTER : 'a'..'z' | 'A'..'Z' ;

WS : (' ' | '\n' | '\r' | '\t')+ {skip();} ;

COMMENT : ('//' ~( '\t' | '\r' | '\n' | '\r\n' )* ) | ('/*' (options {greedy=false;} : .)* '*/') {skip();} ;
