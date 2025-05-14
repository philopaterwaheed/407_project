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

    public SyntaxHighlighter(JTextPane textPane) {
        this.doc = textPane.getStyledDocument();
        this.tokenStyles = new HashMap<>();

        defaultStyle = doc.addStyle("default", null);
        StyleConstants.setForeground(defaultStyle, Color.BLACK);

        initStyles();

        highlightTimer = new Timer(300, e -> performHighlighting());
        highlightTimer.setRepeats(false);
    }

    private void initStyles() {
        for (int i = 87; i <= 121; i++) {
            addStyle(i, new Color(147, 199, 99)); // greenish
        }
        addStyle(30, new Color(103, 140, 177)); // identifier
        addStyle(56, new Color(214, 157, 133)); // string
        addStyle(18, new Color(104, 151, 187)); // number
        addStyle(10, new Color(128, 128, 128)); // comment
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
                    int start = token.getTokenIndex();
                    start = ((org.antlr.runtime.CommonToken) token).getStartIndex(); // ← ✅ CORRECT
                    int end = ((org.antlr.runtime.CommonToken) token).getStopIndex();

                    int length = end - start + 1;
                    if (start >= 0 && length > 0 && (start + length) <= doc.getLength()) {
                        Style style = tokenStyles.getOrDefault(token.getType(), defaultStyle);
                        doc.setCharacterAttributes(start, length, style, true);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void updateColors(Color keywords, Color identifiers, Color strings, Color numbers, Color comments) {
        for (int i = 87; i <= 121; i++) {
            if (tokenStyles.containsKey(i)) {
                StyleConstants.setForeground(tokenStyles.get(i), keywords);
            }
        }
        if (tokenStyles.containsKey(30)) StyleConstants.setForeground(tokenStyles.get(30), identifiers);
        if (tokenStyles.containsKey(56)) StyleConstants.setForeground(tokenStyles.get(56), strings);
        if (tokenStyles.containsKey(18)) StyleConstants.setForeground(tokenStyles.get(18), numbers);
        if (tokenStyles.containsKey(10)) StyleConstants.setForeground(tokenStyles.get(10), comments);
    }

    public void updateSyntaxHighlighterTheme(ThemeType theme) {
        switch (theme) {
            case DRACULA:
                updateColors(
                        new Color(189, 147, 249),
                        new Color(248, 248, 242),
                        new Color(255, 121, 198),
                        new Color(139, 233, 253),
                        new Color(98, 114, 164)
                );
                break;
            case LIGHT:
                updateColors(
                        new Color(147, 199, 99),
                        new Color(103, 140, 177),
                        new Color(214, 157, 133),
                        new Color(104, 151, 187),
                        new Color(128, 128, 128)
                );
                break;

        }
    }

    public enum ThemeType {
        DRACULA, LIGHT
    }
}
