import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SyntaxHighlighter {
    private final StyledDocument doc;
    private final Style defaultStyle;
    private final Map<Integer, Style> tokenStyles;
    private final Timer highlightTimer;
    private String lastText = "";

    Color integerColor = new Color(104, 151, 187);      // Blue
    Color floatColor = new Color(108, 166, 151);        // Teal-Blue
    Color hexColor = new Color(180, 142, 173);          // Purple
    Color binaryColor = new Color(152, 104, 186);       // Darker Purple
    Color scientificColor = new Color(86, 182, 194);    // Cyan


    public SyntaxHighlighter(JTextPane textPane) {
        this.doc = textPane.getStyledDocument();
        this.tokenStyles = new HashMap<>();

        defaultStyle = doc.addStyle("default", null);
        StyleConstants.setForeground(defaultStyle, Color.BLACK);

        initStyles();

        highlightTimer = new Timer(1000, e -> performHighlighting());
        highlightTimer.setRepeats(false);
    }

    private void initStyles() {
        // Keywords (auto, bool, break, etc.)
        for (int i = 87; i <= 121; i++) {
            addStyle(i, new Color(147, 199, 99));
        }

        // Identifiers
        addStyle(30, new Color(103, 140, 177));

        // Strings
        addStyle(56, new Color(214, 157, 133));

        // Numbers - base style
        addStyle(18, new Color(104, 151, 187));

        // Number styles - will be created during highlighting
        doc.addStyle("integer", null);
        StyleConstants.setForeground(doc.getStyle("integer"), new Color(104, 151, 187));

        doc.addStyle("float", null);
        StyleConstants.setForeground(doc.getStyle("float"), new Color(108, 166, 151));

        doc.addStyle("hex", null);
        StyleConstants.setForeground(doc.getStyle("hex"), new Color(180, 142, 173));

        doc.addStyle("binary", null);
        StyleConstants.setForeground(doc.getStyle("binary"), new Color(152, 104, 186));

        doc.addStyle("scientific", null);
        StyleConstants.setForeground(doc.getStyle("scientific"), new Color(86, 182, 194));

        // Comments
        addStyle(10, new Color(128, 128, 128));

        // Operators
        for (int i : new int[]{54, 55, 58, 59, 62, 63, 64, 65, 67, 68, 69, 70, 71, 73, 77, 78, 79, 80, 81, 82, 83, 84, 123}) {
            addStyle(i, new Color(224, 180, 100));
        }

        // Punctuation
        for (int i : new int[]{60, 61, 66, 74, 75, 76, 122, 124}) {
            addStyle(i, new Color(150, 150, 150));
        }

        // Preprocessor directives
        addStyle(57, new Color(187, 155, 211));

        // Booleans (true, false)
        addStyle(6, new Color(209, 154, 102));

        // Language keywords (class, if, else, for)
        addStyle(9, new Color(198, 120, 221));
        addStyle(31, new Color(198, 120, 221));
        addStyle(24, new Color(198, 120, 221));
        addStyle(26, new Color(198, 120, 221));

        // Stream
        addStyle(32, new Color(152, 195, 121));
    }

    private void addStyle(int tokenType, Color color) {
        Style style = doc.addStyle("token_" + tokenType, null);
        StyleConstants.setForeground(style, color);
        tokenStyles.put(tokenType, style);
    }

    public void highlight(String text) {
        if (text == null) return;
        lastText = text;
        highlightTimer.restart();
    }

    private void performHighlighting() {
        SwingUtilities.invokeLater(() -> {
            try {
                doc.setCharacterAttributes(0, doc.getLength(), defaultStyle, true);

                ANTLRStringStream input = new ANTLRStringStream(lastText);
                BankLexer lexer = new BankLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                tokens.fill(); // force token generation

                List<Token> tokenList = tokens.getTokens();
                for (Token token : tokenList) {
                    int start = ((org.antlr.runtime.CommonToken) token).getStartIndex();
                    int end = ((org.antlr.runtime.CommonToken) token).getStopIndex();
                    int length = end - start + 1;

                    if (start >= 0 && length > 0 && (start + length) <= doc.getLength()) {
                        // Get the default style for this token type
                        Style style = tokenStyles.getOrDefault(token.getType(), defaultStyle);

                        // Special case for numbers - detect different formats
                        if (token.getType() == 18) { // DIGIT token type
                            String text = token.getText();

                            // Create specialized numeric styles if needed
                            Style intStyle = doc.getStyle("integer");
                            if (intStyle == null) {
                                intStyle = doc.addStyle("integer", null);
                                StyleConstants.setForeground(intStyle, integerColor);
                            }

                            Style floatStyle = doc.getStyle("float");
                            if (floatStyle == null) {
                                floatStyle = doc.addStyle("float", null);
                                StyleConstants.setForeground(floatStyle, floatColor);
                            }

                            Style hexStyle = doc.getStyle("hex");
                            if (hexStyle == null) {
                                hexStyle = doc.addStyle("hex", null);
                                StyleConstants.setForeground(hexStyle, hexColor);
                            }

                            Style binaryStyle = doc.getStyle("binary");
                            if (binaryStyle == null) {
                                binaryStyle = doc.addStyle("binary", null);
                                StyleConstants.setForeground(binaryStyle, binaryColor);
                            }

                            Style scientificStyle = doc.getStyle("scientific");
                            if (scientificStyle == null) {
                                scientificStyle = doc.addStyle("scientific", null);
                                StyleConstants.setForeground(scientificStyle, scientificColor);
                            }

                            // Determine number type and apply appropriate style
                            if (text.matches("0[xX][0-9a-fA-F]+")) {
                                // Hexadecimal
                                doc.setCharacterAttributes(start, length, hexStyle, true);
                            } else if (text.matches("0[bB][01]+")) {
                                // Binary
                                doc.setCharacterAttributes(start, length, binaryStyle, true);
                            } else if (text.matches("\\d+\\.\\d*([eE][+-]?\\d+)?") || text.matches("\\d*\\.\\d+([eE][+-]?\\d+)?")) {
                                // Floating point or scientific notation with decimal point
                                if (text.contains("e") || text.contains("E")) {
                                    doc.setCharacterAttributes(start, length, scientificStyle, true);
                                } else {
                                    doc.setCharacterAttributes(start, length, floatStyle, true);
                                }
                            } else if (text.matches("\\d+[eE][+-]?\\d+")) {
                                // Scientific notation without decimal point
                                doc.setCharacterAttributes(start, length, scientificStyle, true);
                            } else {
                                // Regular integer
                                doc.setCharacterAttributes(start, length, intStyle, true);
                            }
                        } else {
                            // Apply the default style for this token type
                            doc.setCharacterAttributes(start, length, style, true);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }



    public void updateSyntaxHighlighterTheme(ThemeType theme) {
        // Default colors - will be used if theme is not recognized
        Color integerColor = new Color(104, 151, 187);        // Blue
        Color floatColor = new Color(108, 166, 151);          // Teal-Blue
        Color hexColor = new Color(180, 142, 173);            // Purple
        Color binaryColor = new Color(152, 104, 186);         // Darker Purple
        Color scientificColor = new Color(86, 182, 194);      // Cyan

        // Default keyword group colors
        Color keywords = new Color(147, 199, 99);             // Default Green
        Color identifiers = new Color(103, 140, 177);         // Blue
        Color strings = new Color(214, 157, 133);             // Red-brown
        Color numbers = new Color(104, 151, 187);             // Blue
        Color comments = new Color(128, 128, 128);            // Gray
        Color controlFlowColor = new Color(198, 120, 221);    // Purple
        Color typeKeywordColor = new Color(230, 192, 123);    // Yellow
        Color memoryKeywordColor = new Color(224, 108, 117);  // Red
        Color accessModifierColor = new Color(86, 182, 194);  // Teal
        Color streamOpColor = new Color(152, 195, 121);       // Green
        Color operatorColor = new Color(224, 180, 100);       // Orange
        Color punctuationColor = new Color(150, 150, 150);    // Gray
        Color preprocessorColor = new Color(187, 155, 211);   // Light Purple
        Color namespaceColor = new Color(209, 154, 102);      // Gold
        Color booleanColor = new Color(209, 154, 102);        // Gold

        // Select theme-specific colors
        if (theme != null) {
            switch (theme) {
                case DRACULA:
                    // Base colors
                    keywords = new Color(189, 147, 249);          // Purple
                    identifiers = new Color(248, 248, 242);       // White
                    strings = new Color(255, 121, 198);           // Pink
                    numbers = new Color(139, 233, 253);           // Cyan
                    comments = new Color(98, 114, 164);           // Blue-gray

                    // Keyword group colors
                    controlFlowColor = new Color(255, 121, 198);  // Pink
                    typeKeywordColor = new Color(139, 233, 253);  // Cyan
                    memoryKeywordColor = new Color(255, 184, 108); // Orange
                    accessModifierColor = new Color(189, 147, 249); // Purple
                    streamOpColor = new Color(80, 250, 123);      // Green
                    operatorColor = new Color(255, 184, 108);     // Orange
                    punctuationColor = new Color(248, 248, 242);  // White
                    preprocessorColor = new Color(189, 147, 249); // Purple
                    namespaceColor = new Color(255, 184, 108);    // Orange
                    booleanColor = new Color(255, 184, 108);      // Orange

                    // Number type colors
                    integerColor = new Color(139, 233, 253);      // Cyan
                    floatColor = new Color(80, 250, 123);         // Green
                    hexColor = new Color(255, 184, 108);          // Orange
                    binaryColor = new Color(255, 121, 198);       // Pink
                    scientificColor = new Color(189, 147, 249);   // Purple
                    break;

                case LIGHT:
                    // Already using default colors
                    break;

                case MONOKAI:
                    keywords = new Color(249, 38, 114);           // Pink
                    identifiers = new Color(230, 219, 116);       // Yellow
                    strings = new Color(230, 219, 116);           // Yellow
                    numbers = new Color(174, 129, 255);           // Purple
                    comments = new Color(117, 113, 94);           // Gray-brown

                    controlFlowColor = new Color(249, 38, 114);   // Pink
                    typeKeywordColor = new Color(102, 217, 239);  // Cyan
                    memoryKeywordColor = new Color(253, 151, 31); // Orange
                    accessModifierColor = new Color(166, 226, 46); // Green
                    streamOpColor = new Color(166, 226, 46);      // Green
                    operatorColor = new Color(253, 151, 31);      // Orange
                    punctuationColor = new Color(248, 248, 242);  // White
                    preprocessorColor = new Color(174, 129, 255); // Purple
                    namespaceColor = new Color(102, 217, 239);    // Cyan
                    booleanColor = new Color(253, 151, 31);       // Orange

                    integerColor = new Color(174, 129, 255);      // Purple
                    floatColor = new Color(102, 217, 239);        // Cyan
                    hexColor = new Color(249, 38, 114);           // Pink
                    binaryColor = new Color(253, 151, 31);        // Orange
                    scientificColor = new Color(166, 226, 46);    // Green
                    break;


                case NORD:
                    keywords = new Color(94, 129, 172);           // Blue
                    identifiers = new Color(216, 222, 233);       // White
                    strings = new Color(163, 190, 140);           // Green
                    numbers = new Color(180, 142, 173);           // Purple
                    comments = new Color(76, 86, 106);            // Dark Blue-Gray

                    controlFlowColor = new Color(129, 161, 193);  // Light Blue
                    typeKeywordColor = new Color(143, 188, 187);  // Cyan
                    memoryKeywordColor = new Color(191, 97, 106); // Red
                    accessModifierColor = new Color(94, 129, 172); // Blue
                    streamOpColor = new Color(163, 190, 140);     // Green
                    operatorColor = new Color(235, 203, 139);     // Yellow
                    punctuationColor = new Color(216, 222, 233);  // White
                    preprocessorColor = new Color(180, 142, 173); // Purple
                    namespaceColor = new Color(235, 203, 139);    // Yellow
                    booleanColor = new Color(208, 135, 112);      // Orange

                    integerColor = new Color(180, 142, 173);      // Purple
                    floatColor = new Color(143, 188, 187);        // Cyan
                    hexColor = new Color(208, 135, 112);          // Orange
                    binaryColor = new Color(191, 97, 106);        // Red
                    scientificColor = new Color(129, 161, 193);   // Light Blue
                    break;

                case ONE_DARK:
                    keywords = new Color(198, 120, 221);          // Purple
                    identifiers = new Color(171, 178, 191);       // Light Gray
                    strings = new Color(152, 195, 121);           // Green
                    numbers = new Color(209, 154, 102);           // Orange
                    comments = new Color(92, 99, 112);            // Gray

                    controlFlowColor = new Color(198, 120, 221);  // Purple
                    typeKeywordColor = new Color(224, 108, 117);  // Red
                    memoryKeywordColor = new Color(229, 192, 123); // Yellow
                    accessModifierColor = new Color(86, 182, 194); // Cyan
                    streamOpColor = new Color(97, 175, 239);      // Blue
                    operatorColor = new Color(86, 182, 194);      // Cyan
                    punctuationColor = new Color(171, 178, 191);  // Light Gray
                    preprocessorColor = new Color(198, 120, 221); // Purple
                    namespaceColor = new Color(97, 175, 239);     // Blue
                    booleanColor = new Color(229, 192, 123);      // Yellow

                    integerColor = new Color(209, 154, 102);      // Orange
                    floatColor = new Color(86, 182, 194);         // Cyan
                    hexColor = new Color(224, 108, 117);          // Red
                    binaryColor = new Color(152, 195, 121);       // Green
                    scientificColor = new Color(97, 175, 239);    // Blue
                    break;

                case SOLARIZED_DARK:
                    keywords = new Color(38, 139, 210);           // Blue
                    identifiers = new Color(147, 161, 161);       // Base1
                    strings = new Color(42, 161, 152);            // Cyan
                    numbers = new Color(108, 113, 196);           // Violet
                    comments = new Color(101, 123, 131);          // Base00

                    controlFlowColor = new Color(181, 137, 0);    // Yellow
                    typeKeywordColor = new Color(133, 153, 0);    // Green
                    memoryKeywordColor = new Color(211, 54, 130); // Magenta
                    accessModifierColor = new Color(38, 139, 210); // Blue
                    streamOpColor = new Color(42, 161, 152);      // Cyan
                    operatorColor = new Color(181, 137, 0);       // Yellow
                    punctuationColor = new Color(147, 161, 161);  // Base1
                    preprocessorColor = new Color(108, 113, 196); // Violet
                    namespaceColor = new Color(38, 139, 210);     // Blue
                    booleanColor = new Color(203, 75, 22);        // Orange

                    integerColor = new Color(108, 113, 196);      // Violet
                    floatColor = new Color(42, 161, 152);         // Cyan
                    hexColor = new Color(203, 75, 22);            // Orange
                    binaryColor = new Color(211, 54, 130);        // Magenta
                    scientificColor = new Color(133, 153, 0);     // Green
                    break;

                default:
                    // Use default colors defined at the top
                    break;
            }
        }

        // Apply all colors with the standard or theme-specific colors
        updateColors(keywords, identifiers, strings, numbers, comments,
                controlFlowColor, typeKeywordColor, memoryKeywordColor,
                accessModifierColor, streamOpColor, operatorColor,
                punctuationColor, preprocessorColor, namespaceColor, booleanColor);

        // Apply number-specific colors
        updateNumberColors(integerColor, floatColor, hexColor, binaryColor, scientificColor);
    }

    public void updateColors(Color keywords, Color identifiers, Color strings, Color numbers,
                             Color comments, Color controlFlowColor, Color typeKeywordColor,
                             Color memoryKeywordColor, Color accessModifierColor,
                             Color streamOpColor, Color operatorColor, Color punctuationColor,
                             Color preprocessorColor, Color namespaceColor, Color booleanColor) {
        // Group keywords into different categories
        Map<Integer, Color> keywordGroups = new HashMap<>();

        // Control flow keywords (if, else, while, for, switch, case, etc.)
        for (int i : new int[]{89, 90, 95, 97, 116, 121}) {
            keywordGroups.put(i, controlFlowColor);
        }

        // Type keywords (int, float, double, char, bool, etc.)
        for (int i : new int[]{88, 91, 98, 100, 102, 104, 113, 115}) {
            keywordGroups.put(i, typeKeywordColor);
        }

        // Memory management keywords (new, delete, const, etc.)
        for (int i : new int[]{93, 96, 106, 114}) {
            keywordGroups.put(i, memoryKeywordColor);
        }

        // Access modifiers (public, private, protected, etc.)
        for (int i : new int[]{107, 108, 109}) {
            keywordGroups.put(i, accessModifierColor);
        }

        // Stream operations (cout, cin, etc.)
        for (int i : new int[]{92, 94, 99, 101, 111, 112}) {
            keywordGroups.put(i, streamOpColor);
        }

        // Miscellaneous keywords
        for (int i = 87; i <= 121; i++) {
            if (!keywordGroups.containsKey(i) && tokenStyles.containsKey(i)) {
                keywordGroups.put(i, keywords); // Default keyword color
            }
        }

        // Apply all the different keyword colors
        for (Map.Entry<Integer, Color> entry : keywordGroups.entrySet()) {
            if (tokenStyles.containsKey(entry.getKey())) {
                StyleConstants.setForeground(tokenStyles.get(entry.getKey()), entry.getValue());
            }
        }

        // Other token types
        if (tokenStyles.containsKey(30)) StyleConstants.setForeground(tokenStyles.get(30), identifiers);
        if (tokenStyles.containsKey(56)) StyleConstants.setForeground(tokenStyles.get(56), strings);
        if (tokenStyles.containsKey(18)) StyleConstants.setForeground(tokenStyles.get(18), numbers);
        if (tokenStyles.containsKey(10)) StyleConstants.setForeground(tokenStyles.get(10), comments);

        // Add operator colors
        for (int i : new int[]{54, 55, 58, 59, 62, 63, 64, 65, 67, 68, 69, 70, 71, 73, 77, 78, 79, 80, 81, 82, 83, 84, 123}) {
            if (tokenStyles.containsKey(i)) {
                StyleConstants.setForeground(tokenStyles.get(i), operatorColor);
            }
        }

        // Add punctuation colors
        for (int i : new int[]{60, 61, 66, 74, 75, 76, 122, 124}) {
            if (tokenStyles.containsKey(i)) {
                StyleConstants.setForeground(tokenStyles.get(i), punctuationColor);
            }
        }

        // Add preprocessor directive colors
        if (tokenStyles.containsKey(57)) { // #include
            StyleConstants.setForeground(tokenStyles.get(57), preprocessorColor);
        }

        // Add namespace color
        if (tokenStyles.containsKey(105)) { // namespace
            StyleConstants.setForeground(tokenStyles.get(105), namespaceColor);
        }
        if (tokenStyles.containsKey(117)) { // using
            StyleConstants.setForeground(tokenStyles.get(117), namespaceColor);
        }

        // Add boolean color
        if (tokenStyles.containsKey(6)) { // BOOLEAN
            StyleConstants.setForeground(tokenStyles.get(6), booleanColor);
        }
    }



    private void updateNumberColors(Color integerColor, Color floatColor, Color hexColor,
                                    Color binaryColor, Color scientificColor) {
        if (doc.getStyle("integer") != null) {
            StyleConstants.setForeground(doc.getStyle("integer"), integerColor);
        }

        if (doc.getStyle("float") != null) {
            StyleConstants.setForeground(doc.getStyle("float"), floatColor);
        }

        if (doc.getStyle("hex") != null) {
            StyleConstants.setForeground(doc.getStyle("hex"), hexColor);
        }

        if (doc.getStyle("binary") != null) {
            StyleConstants.setForeground(doc.getStyle("binary"), binaryColor);
        }

        if (doc.getStyle("scientific") != null) {
            StyleConstants.setForeground(doc.getStyle("scientific"), scientificColor);
        }
    }
}

