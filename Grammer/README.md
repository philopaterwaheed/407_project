# C++ Grammar Parser

This project implements an ANTLR grammar for parsing a subset of C++ language features. The grammar is designed to handle common C++ constructs and is organized into several main categories.

## Supported C++ Features

### Basic Language Constructs

#### Data Types
- **Primitive types**: `int`, `double`, `string`, `bool`, `char`, `long`, `short`, `float`
- **Pointers**: Type declarations with `*` operator
- **Vectors**: `vector<type>` template syntax
- **Custom types**: User-defined class types

#### Literals
- **Integer literals**: Numeric constants
- **Float literals**: Decimal numbers with floating point
- **String literals**: Text enclosed in double quotes
- **Character literals**: Single characters in single quotes
- **Boolean literals**: `true` and `false`

### Control Structures

#### Conditional Statements
- **If statements**: `if (condition) body`
- **If-else statements**: `if (condition) body else body`
- **If-else if-else chains**: Multiple conditional branches
- **Switch statements**: `switch (expression)` with `case` and `default` clauses

#### Loops
- **While loops**: `while (condition) body`
- **Do-while loops**: `do body while (condition);`
- **Range-based for loops**: `for (const auto& item : container)`

#### Control Flow
- **Break statements**: `break;` for loop/switch termination
- **Return statements**: `return [expression];`

### Functions

#### Function Definitions
- **Return types**: All supported types plus `void`
- **Parameters**: Typed parameter lists
- **Function bodies**: Block statements or single statements
- **Function calls**: `function(arguments)`

#### Class Member Functions
- **Virtual functions**: `virtual` keyword support
- **Const functions**: `const` qualifier
- **Static members**: `static` keyword
- **Override functionality**: Function overriding

### Object-Oriented Programming

#### Classes
- **Class definitions**: `class Name { members };`
- **Inheritance**: `class Derived : visibility Base`
- **Access modifiers**: `public`, `private`, `protected`
- **Constructors**: Same name as class, no return type
- **Destructors**: `~ClassName()`
- **Member initialization lists**: Constructor initialization syntax

#### Object Management
- **Object creation**: `new` keyword for dynamic allocation
- **Object deletion**: `delete` keyword for deallocation
- **Member access**: Dot operator (`.`) and arrow operator (`->`)

### Variable Declarations and Assignments

#### Declarations
- **Variable declarations**: `type variable_name;`
- **Multiple declarations**: `type var1, var2, var3;`
- **Initialization**: `type variable = value;`
- **Constructor-style initialization**: `type variable(arguments);`

#### Assignments
- **Basic assignment**: `variable = expression;`
- **Compound assignments**: `+=`, `-=`
- **Increment/decrement**: `++`, `--` (both prefix and postfix)

### Expressions and Operators

#### Arithmetic Operators
- **Basic arithmetic**: `+`, `-`, `*`, `/`
- **Operator precedence**: Proper mathematical precedence handling

#### Logical Operators
- **Boolean operators**: `&&` (AND), `||` (OR), `!` (NOT)
- **Comparison operators**: `==`, `!=`, `<`, `>`, `<=`, `>=`

#### Other Operators
- **Parentheses**: Expression grouping
- **Member access**: `.` and `->` operators

### Input/Output Operations

#### Output Streams
- **cout**: Standard output with `<<` operator
- **Stream chaining**: Multiple `<<` operations
- **Manipulators**: `endl`, `left`, `right`, `setw()`, `string()`

#### Input Streams
- **cin**: Standard input with `>>` operator
- **getline**: Line-based input
- **File streams**: `ifstream`, `ofstream`
- **Stream methods**: `.ignore()`

### Preprocessor and Namespace Support

#### Preprocessor Directives
- **Include statements**: `#include <library>` and `#include "header.h"`

#### Namespaces
- **Using declarations**: `using namespace name;`
- **Qualified names**: `namespace::identifier`

### Advanced Features

#### Pointers and References
- **Pointer declarations**: Type with `*`
- **Pointer dereferencing**: `->` operator
- **Reference parameters**: `&` in function parameters

#### Templates (Limited)
- **Vector templates**: `vector<type>` syntax

#### Memory Management
- **Dynamic allocation**: `new` operator
- **Deallocation**: `delete` operator

## Grammar Structure

The grammar is organized into logical sections:
- **Compilation units**: Includes and namespace declarations
- **Top-level components**: Functions, classes, and global declarations
- **Statements and expressions**: Control flow and operations
- **Class definitions**: Object-oriented constructs
- **Input/output**: Stream operations

## Error Handling

The grammar includes comprehensive error handling with catch blocks for:
- `MismatchedTokenException`
- `NoViableAltException`
- `RecognitionException`

This grammar provides a solid foundation for parsing a significant subset of C++ code, covering the most commonly used language features in educational and basic programming contexts.