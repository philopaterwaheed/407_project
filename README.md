# Compy - C++ Language Parser and IDE



![ezgif-5fddc727bc2483](https://github.com/user-attachments/assets/d2f9ea1c-29df-4946-87b0-8baff070c163)



A comprehensive C++ language parser and integrated development environment (IDE) built with ANTLR 3. This project provides syntax analysis, parse tree visualization, and a feature-rich code editor with multiple syntax highlighting themes.

## Overview

This project implements a complete C++ language parser using ANTLR 3 grammar definitions. It features a modern Swing-based IDE that provides real-time syntax highlighting, parse tree generation and visualization, error reporting, and comprehensive file management capabilities.

### Key Features

- **Complete C++ Grammar Support**: Handles variables, expressions, control structures, functions, classes, file I/O, and more
- **Real-time Syntax Highlighting**: Multiple color themes with token-specific highlighting
- **Parse Tree Visualization**: Generate and display visual parse trees using Graphviz
- **Advanced Editor Features**: Find/replace functionality, saving/loading files, config saving
- **Multiple Themes**: 14 different color schemes including Dracula, Monokai, Nord, and more
- **Cross-platform Support**: Works on Windows, macOS, and Linux
- **Error Handling**: Comprehensive error reporting and recovery

## Grammar Features

The `Bank.g` grammar file supports:

### Data Types and Literals
- **Primitive Types**: `int`, `float`, `double`, `char`, `bool`, `string`
- **Numeric Literals**: integers, floating-point, hexadecimal, binary, scientific notation
- **String and Character Literals**: with proper escape sequence handling

### Control Structures
- **Conditional Statements**: `if/else`, nested conditions
- **Loops**: `for`, `while`, `do-while`
- **Switch Statements**: with `case` and `default` clauses

### Functions and Classes
- **Function Definitions**: with parameters, return types, and local variables
- **Class Declarations**: with member variables and methods
- **Access Modifiers**: `public`, `private`, `protected`

### I/O Operations
- **Console I/O**: `cin`, `cout` with stream operators
- **File I/O**: `ifstream`, `ofstream` operations
- **Manipulators**: `setw`, `left`, `right`, `endl`

### Expressions and Operators
- **Arithmetic Operators**: `+`, `-`, `*`, `/`, `%`
- **Logical Operators**: `&&`, `||`, `!`
- **Comparison Operators**: `==`, `!=`, `<`, `>`, `<=`, `>=`
- **Assignment Operators**: `=`, `+=`, `-=`, etc.
- **Increment/Decrement**: `++`, `--` (prefix and postfix)

## Prerequisites

Before setting up the project, ensure you have:

1. **Java Development Kit (JDK) 8 or higher**
2. **ANTLR 3.5.3**
3. **Apache Ant** (for building)
4. **Graphviz** (for parse tree visualization)
    - Windows: Download from [Graphviz website](https://graphviz.org/download/)
    - macOS: `brew install graphviz`
    - Linux: `sudo apt-get install graphviz` (Ubuntu/Debian) or equivalent

## Project Setup

### 1. Clone the Repository
```bash
git clone https://github.com/philopaterwaheed/compy.git
cd compy
```

### 2. Generate Parser and Lexer with ANTLR 3

The project uses ANTLR 3 to generate the parser and lexer from the grammar file. Follow these steps:

#### Download ANTLR 3.5.3
```bash
wget https://www.antlr3.org/download/antlr-3.5.3-complete-no-st3.jar
# or download manually from ANTLR website
```

#### Generate Parser Files
```bash
# Navigate to the grammar directory
cd Grammer

# Generate the lexer and parser
java -cp ../lib/antlr-3.5.3-complete-no-st3.jar org.antlr.Tool Bank.g

# This generates:
# - BankLexer.java (lexical analyzer)
# - BankParser.java (syntax parser)
# - Bank.tokens (token definitions)
```

#### Move Generated Files
```bash
# Move the generated Java files to the src directory
mv BankLexer.java ../src/
mv BankParser.java ../src/
mv Bank.tokens ../src/
```

### 3. Compile the Project

#### Using Ant (Recommended)
```bash
# Build the entire project
ant clean compile

# Create executable JAR
ant jar

# Run the application
ant run
```

#### Manual Compilation
```bash
# Compile all Java files
javac -cp "lib/*:src" src/*.java -d build/

# Create JAR file
jar cvfm compy.jar META-INF/MANIFEST.MF -C build/ .

# Run the application
java -cp "lib/*:." -jar compy.jar
```

## Usage Guide

### Starting the IDE

1. Launch the application:
   ```bash
   java -jar compy.jar
   ```

2. The IDE opens with a default editor and console panel

### Writing C++ Code

The editor supports standard C++ syntax. Example code:

```cpp
#include <iostream>
using namespace std;

class Calculator {
private:
    int result;
    
public:
    Calculator() {
        result = 0;
    }
    
    int add(int a, int b) {
        result = a + b;
        return result;
    }
    
    void display() {
        cout << "Result: " << result << endl;
    }
};

int main() {
    Calculator calc;
    int x = 10, y = 20;
    
    if (x > 0 && y > 0) {
        int sum = calc.add(x, y);
        calc.display();
        
        for (int i = 0; i < 5; i++) {
            cout << "Iteration: " << i << endl;
        }
    }
    
    return 0;
}
```

### Key Features Usage

#### 1. Compilation and Parsing
- Click **"Compile Code"** to parse your C++ code
- View compilation results in the output console
- Error messages show line numbers and descriptions

#### 2. Parse Tree Visualization
- Click **"Show Parse Tree"** after successful compilation
- The system generates a visual parse tree using Graphviz
- Trees are saved as PNG files in the `graphs/` directory
- A separate viewer window displays the parse tree

#### 3. File Operations
- **Load File**: Open existing C++ files
- **Save File**: Save your current work

#### 4. Search and Navigation
- **Ctrl+F**: Open find dialog
- **F3**: Find next occurrence
- **Shift+F3**: Find previous occurrence
- **Esc**: Close search panel

#### 5. Theme Customization
- Click the **Theme** button to cycle through available themes:
    - Light Theme (default)
    - Dark Theme
    - Dracula
    - Monokai
    - Nord
    - One Dark
    - Solarized (Dark/Light)
    - Gruvbox Dark
    - GitHub Dark
    - Catppuccin variants

### Advanced Features

#### Syntax Highlighting
The editor provides context-aware syntax highlighting:
- **Keywords**: Control flow, data types, access modifiers
- **Numbers**: Different colors for integers, floats, hex, binary, scientific notation
- **Strings and Characters**: Quoted literals
- **Comments**: Single-line and multi-line
- **Operators**: Arithmetic, logical, comparison
- **Identifiers**: Variable and function names

#### Error Recovery
The parser includes sophisticated error recovery:
- **Catch Blocks**: Handle different types of parsing errors
- **Error Messages**: Detailed descriptions with context
- **Partial Parsing**: Continue parsing after errors when possible

#### Configuration Management
- Automatic theme preference saving
- Project configuration in `config/` directory
- Cross-platform path handling

## Project Structure

```
compy/
├── Grammer/
│   └── Bank.g                 # ANTLR 3 grammar definition
├── src/
│   ├── AnotherGUI.java        # Main IDE application
│   ├── BankLexer.java         # Generated lexer (after ANTLR)
│   ├── BankParser.java        # Generated parser (after ANTLR)
│   ├── SyntaxHighlighter.java # Syntax highlighting engine
│   ├── DotRunner.java         # Graphviz integration
│   ├── ParseTreeViewer.java   # Parse tree display window
│   ├── ThemeColors.java       # Theme color definitions
│   ├── ThemeType.java         # Theme enumeration
│   ├── ConfigManager.java     # Configuration handling
│   └── PathUtils.java         # Cross-platform path utilities
├── lib/
│   └── antlr-3.5.3-complete-no-st3.jar
├── config/                    # Configuration files
├── graphs/                    # Generated parse tree images
├── build.xml                  # Ant build configuration
└── README.md
```

## Grammar Modifications

To extend the C++ grammar:

1. Edit `Grammer/Bank.g`
2. Add new token definitions in the lexer section
3. Add new parser rules for syntax structures
4. Regenerate parser files:
   ```bash
   java -cp lib/antlr-3.5.3-complete-no-st3.jar org.antlr.Tool Grammer/Bank.g
   ```
5. Move generated files to `src/` directory
6. Update syntax highlighter token mappings if needed
7. Recompile the project

## Troubleshooting

### Common Issues

1. **"DOT executable not found"**
    - Install Graphviz and ensure it's in your system PATH
    - On Windows, add Graphviz bin directory to PATH environment variable

2. **ANTLR compilation errors**
    - Verify ANTLR 3.5.3 JAR is in the correct location
    - Check grammar syntax in `Bank.g`
    - Ensure proper Java classpath setup

3. **Theme not persisting**
    - Check write permissions in the project directory
    - Verify `config/` directory exists and is writable

4. **Parse tree not displaying**
    - Ensure successful compilation before showing tree
    - Check Graphviz installation and PATH configuration
    - Verify `graphs/` directory permissions

### Performance Tips

- Large files may take longer to highlight; consider breaking into smaller modules
- Parse tree generation time increases with code complexity
- Close unused theme windows to conserve memory

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test with various C++ code samples
5. Update documentation if needed
6. Submit a pull request

## License

This project is open source and available under the MIT License.

## Acknowledgments

- Built with ANTLR 3 for robust parsing capabilities
- Graphviz integration for parse tree visualization
- Multiple theme inspirations from popular code editors
- Cross-platform compatibility through Java Swing
