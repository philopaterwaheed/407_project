grammar Bank;

options {
    output=AST;
    language=Java;
}

tokens {
    Start;
    Top_Level;
    Compilation_Unit;
    Include;
    NameSpace;
    Top_Level_Component;
    Function;
    Class;
    Declaration;
    Return_Type;
    Parameter;
    Type;
    Body;
    Statements;
    Statement;
    Qualified;
    Assign;
    Call;
    Delete;
    Return;
    Control_Structure;
    If;
    Else;
    For;
    While;
    While_EXP;
    Do_While;
    Switch;
    Switch_Case;
    Default_Case;
    Break;
    Class_Members;
    Class_Member;
    Constructor;
    Destructor;
    Arithmetic_Expression;
    Not;
    Factor;
    Member_Access;
    Manipulator;
}

@members {
    String s="";
}

start
    : top_level -> ^(Start top_level)
    ;

top_level
    : compilation_unit top_level_component -> ^(Top_Level compilation_unit top_level_component)
    ;

top_level_component
    : (function_definition -> ^(Top_Level_Component function_definition)
    | class_definition -> ^(Top_Level_Component class_definition)
    | declaration -> ^(Top_Level_Component declaration)
    )+
    ;

//======================================== compilation_unit ============================================

compilation_unit
    : ((include) -> ^(Compilation_Unit include)
    | (name_space) -> ^(Compilation_Unit name_space))*
    ;

include
    : '#include' (
      lib -> ^(Include lib)
    | header -> ^(Include header)
    )
    ;

lib : '<' (~('\r' | '\n' | '>'))* '>' ;

header : '"' (~('\r' | '\n' | '"'))* '"' ;

name_space
    : 'using' 'namespace' ((ID ('::' ID)*) -> ^(NameSpace ID ('::' ID)*)) ';'
    ;

//======================================== function_definition ===========================================

function_definition
    : return_type ID '(' parameters? ')' body -> ^(Function return_type ID '(' parameters? ')' body)
    ;

parameters
    : parameter (',' parameter)*
    ;

parameter
    : type ID -> ^(Parameter type ID)
    ;

//============================================= body ================================================

body
    : '{' statements '}' -> ^(Body '{' statements '}')
    | statement -> ^(Body statement)
    ;

statements
    : (statement)* -> ^(Statements (statement)*)
    ;

statement
    : declaration -> ^(Statement declaration)
    | assignment ';' -> ^(Statement assignment ';')
    | member_access ';' -> ^(Statement member_access ';')
    | control_structure -> ^(Statement control_structure)
    | return_statement -> ^(Statement return_statement)
    | output -> ^(Statement output)
    | input -> ^(Statement input)
    | delete_statement -> ^(Statement delete_statement)
    ;
    
assignment
    : ID ('=' | '+=' | '-=') expression
    ;

delete_statement
    : 'delete' expression ';' -> ^(Delete 'delete' expression ';')
    ;

return_statement
    : 'return' expression? ';' -> ^(Return 'return' expression? ';')
    ;

//========================================= control_structure ===========================================

control_structure
    : if_statement -> ^(Control_Structure if_statement)
    | for_loop -> ^(Control_Structure for_loop)
    | while_loop -> ^(Control_Structure while_loop)
    | do_while_loop -> ^(Control_Structure do_while_loop)
    | switch_statement -> ^(Control_Structure switch_statement)
    ;

if_statement
    : IF '(' expression ')' body else_statement? -> ^(If IF '(' expression ')' body else_statement?)
    ;

else_statement
    : ELSE body -> ^(Else ELSE body)
    ;

for_loop
    : FOR '(' 'const'? 'auto' '&'? ID ':' expression ')' body -> ^(For FOR '(' 'const'? 'auto' '&'? ID ':' expression ')' body)
    ;

while_loop
    : 'while' '(' while_exp ')' body -> ^(While 'while' '(' while_exp ')' body)
    ;
  
while_exp
    : expression -> ^(While_EXP expression)
    | file_input -> ^(While_EXP file_input)
    ;

do_while_loop
    : 'do' body 'while' '(' expression ')' ';' -> ^(Do_While 'do' body 'while' '(' expression ')' ';')
    ;

switch_statement
    : 'switch' '(' expression ')' '{' switch_case+ default_case? '}' -> ^(Switch 'switch' '(' expression ')' '{' switch_case+ default_case? '}')
    ;

switch_case
    : 'case' expression ':' statements break_statement? -> ^(Switch_Case 'case' expression ':' statements break_statement?)
    ;

default_case
    : 'default' ':' statements -> ^(Default_Case 'default' ':' statements)
    ;

break_statement
    : 'break' ';' -> ^(Break 'break' ';')
    ;

//============================================= type=================================================

type
    : (base_type -> ^(Type base_type)
    | vector_type -> ^(Type vector_type)
    | ID -> ^(Type ID)
    ) ('*')?
    ;

return_type
    : base_type -> ^(Return_Type base_type)
    | 'void' -> ^(Return_Type 'void')
    ;

base_type
    : 'int' | 'double' | 'string' | 'bool' | 'char' | 'long' | 'short' | 'float'
    ;

vector_type
    : 'vector' '<' type '>'
    ;

//===========================================declaration==============================================

declaration
    : (variable_declaration -> ^(Declaration variable_declaration)
    | file_declaration -> ^(Declaration file_declaration)
    ) ';'
    ;

variable_declaration
    : type variables
    ;

variables
    : declarator (',' declarator)*
    ;

declarator
    : qualified_id
    (('=' expression) -> ^(Assign '=' expression)
    | ('(' arguments? ')') -> ^(Call '(' arguments? ')')
    )?
    ;
  
qualified_id
    : ID ('::' ID)?
      -> ^(Qualified ID ('::' ID)?)
    ;

file_declaration
    : IFSTREAM ID '(' string_literal ')'
    ;

arguments
    : expression (',' expression)*
    ;

//=========================================class_definition=============================================

class_definition
    : CLASS ID (':' class_visibility ID)? '{' class_members '}' ';' -> ^(Class CLASS ID (':' class_visibility ID)? '{' class_members '}' ';')
    ;

class_members
    : (class_member)* -> ^(Class_Members (class_member)*)
    ;
 
class_member
    : (class_visibility ':')?
    (class_declaration -> ^(Class_Member class_declaration)
    | constructor -> ^(Class_Member constructor)
    | class_function_definition -> ^(Class_Member class_function_definition)
    | destructor -> ^(Class_Member destructor)
    )
    ;

class_declaration
    : 'static'? declaration
    ;

class_visibility
    : 'public' | 'private' | 'protected'
    ;

constructor
    : 'virtual'? ID '(' parameters? ')' (':' member_init_list)? class_function_body
        -> ^(Constructor 'virtual'? ID '(' parameters? ')' (':' member_init_list)? class_function_body)
    ;

destructor
    : 'virtual'? '~' ID '(' parameters? ')' (':' member_init_list)? class_function_body
        -> ^(Destructor 'virtual'? '~' ID '(' parameters? ')' (':' member_init_list)? class_function_body)
    ;
  
member_init_list
    : function_call (',' function_call)*
    ;

class_function_definition
    : 'virtual'? return_type ID '(' parameters? ')' 'const'? class_function_body
        -> ^(Function 'virtual'? return_type ID '(' parameters? ')' 'const'? class_function_body)
    ;

class_function_body
    : '{' statements '}' -> ^(Body '{' statements '}')
    ;

//===========================================expression==============================================

expression
    : and_exp ('||' and_exp)*
    ;

and_exp
    : equality_exp ('&&' equality_exp)*
    ;

equality_exp
    : relational_exp (('==' | '!=') relational_exp)*
    ;

relational_exp
    : unary_exp (('<' | '>' | '<=' | '>=') unary_exp)*
    ;

unary_exp
    : arithmetic_expression -> ^(Arithmetic_Expression arithmetic_expression)
    | '!' unary_exp -> ^(Not '!' unary_exp)
    ;

arithmetic_expression
    : term (('+' | '-') term)*
    ;
    
term
    : factor (('*' | '/') factor)*
    ;

factor
    : '(' arithmetic_expression ')' -> ^(Factor '(' arithmetic_expression ')')
    | ID -> ^(Factor ID)
    | change -> ^(Factor change)
    | true_false -> ^(Factor true_false)
    | integer_literal -> ^(Factor integer_literal)
    | string_literal -> ^(Factor string_literal)
    | object_declaration -> ^(Factor object_declaration)
    | member_access -> ^(Factor member_access)
    ;

true_false
    : BOOLEAN
    ;

member_access
    : function_access -> ^(Member_Access function_access)
    | pointer_access -> ^(Member_Access pointer_access)
    ;

function_access
    : ID '.' ID ('(' arguments? ')')?
    ;

pointer_access
    : ID ('->' | '.') ID ('(' arguments? ')')?
    ;

function_call
    : ID '(' arguments? ')' -> ^(Call ID '(' arguments? ')')
    ;

object_declaration
    : 'new' function_call
    ;

change
    : ('++' | '--') ID | ID ('++' | '--')
    ;

//=============================================literal================================================

integer_literal
    : DIGIT+
    ;

float_literal
    : DIGIT+ '.' DIGIT+
    ;

string_literal
    : '"' (~'"')* '"'
    ;

character_literal
    : '\'' (~('\'' | '\\'))* '\''
    ;

//============================================output================================================

output
    : ('cout' | ID) ('<<' (expression | 'endl' | manipulators))* ';'
    ;

manipulators
    : 'left' -> ^(Manipulator 'left')
    | 'right' -> ^(Manipulator 'right')
    | 'setw' '(' expression ')' -> ^(Manipulator 'setw' '(' expression ')')
    | 'string' '(' expression ',' character_literal ')' -> ^(Manipulator 'string' '(' expression ',' character_literal ')')
    ;

//=============================================input================================================

input
    : stream ('>>' expression)+ ';'
    | 'getline' '(' stream ',' ID (',' character_literal)? ')' ';'
    | stream '.ignore' '(' ')' ';'
    ;

file_input
    : ID ('>>' expression)+
    | 'getline' '(' stream ',' ID ')'
    | stream '.ignore' '(' ')'
    ;

stream
    : 'cin' | ID
    ;

// Lexer Rules
BOOLEAN : 'true' | 'false' ;
CLASS : 'class' ;
IF : 'if' ;
ELSE : 'else' ;
FOR : 'for' ;
IFSTREAM : 'ofstream' | 'ifstream' ;
ID : ('a'..'z' | 'A'..'Z') ( 'a'..'z' | 'A'..'Z' | DIGIT | '_')* ;
DIGIT : '0'..'9' ;
WS : (' ' | '\n' | '\r' | '\t')+ { $channel = HIDDEN; } ;
COMMENT : ('//' ~( '\t' | '\r' | '\n' | '\r\n' )* ) | ('/*' (options {greedy=false;} : .)* '*/') { $channel = HIDDEN; } ;