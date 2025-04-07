grammar Bank;

options {
    language = Java;
}

class_definition
    : 'class' class_name '{' member_declarations '}'
    ;

class_name
    : ID
    ;

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

type : ('int' | 'double' | 'string' | custom_type) ('*')? ;


custom_type
    : ID
    ;

body
    : '{' statements '}'
    ;

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

declaration
    : type ID ('=' expression (','expression )*)? ';'
    ;

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
    ;

if_statement
    : 'if' '(' (expression | pointer) ')' body else_part
    ;

pointer : ID '->' function_call (';' | Roper expression)? ;



else_part
    : 'else' body
    | 
    ;

for_loop
    : 'for' '(' (declaration expression ';' expression | ('const'? 'auto' ID ':' ID)) ')' body
    ;


while_loop
    : 'while' '(' expression ')' body
    ;

do_while_loop
    : 'do' body 'while' '(' expression ')' ';'
    ;

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

bankAccount_class
    : 'class' 'BankAccount' '{' member_declarations '}'
    ;

member_declarations
    : (function_definition | declaration | static_member)*
    ;

bankAccount_deposit_function
    : 'virtual' 'void' 'deposit' '(' 'double' amount ')'
    ;

bankAccount_withdraw_function
    : 'virtual' 'bool' 'withdraw' '(' 'double' amount ')'
    ;

display_function
    : 'virtual' 'void' 'display' '(' ')' 'const'
    ;

bank_class
    : 'class' 'Bank' '{' function_declarations '}'
    ;

function_declarations
    : (create_account_function
    | deposit_function
    | withdraw_function
    | transfer_funds_function
    | display_all_accounts_function
    | function_definition)*
    ;

create_account_function
    : 'void' 'createAccount' '(' ')'
    ;

deposit_function
    : 'void' 'deposit' '(' ')'
    ;

withdraw_function
    : 'void' 'withdraw' '(' ')'
    ;

transfer_funds_function
    : 'void' 'transferFunds' '(' ')'
    ;

display_all_accounts_function
    : 'void' 'displayAllAccounts' '(' ')'
    ;

amount
    : expression
    ;

amount_value
    : DIGIT+ ('.' DIGIT+)?
    ;


ID
    : LETTER (LETTER | DIGIT | '_')*
    ;

DIGIT
    : '0'..'9'
    ;

LETTER
    : 'a'..'z' | 'A'..'Z'
    ;

Roper	: '>' | '<' | '==' | '>=' | '<=' ;

WS: (' '|'\n'|'\r'|'\t')+ {skip();} ;


COMMENT
    :   ('//' ~( '\r'|'\n'|'\r\n')* ) | ('/*' (options {greedy=false;} : .)* '*/') {skip();}
    ;
