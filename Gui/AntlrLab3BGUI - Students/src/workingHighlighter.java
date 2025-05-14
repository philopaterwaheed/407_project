import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.util.regex.*;
import javax.swing.event.*;

public class workingHighlighter extends JFrame {
    private final JTextPane textPane = new JTextPane();
    private final StyledDocument doc = textPane.getStyledDocument();
    private final Timer highlightTimer;

    public workingHighlighter() {
        setTitle("Simple Syntax Highlighter");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane(textPane);
        add(scrollPane);

        initStyles();

        highlightTimer = new Timer(300, e -> highlightSyntax());
        highlightTimer.setRepeats(false);

        doc.addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                scheduleHighlight();
            }

            public void removeUpdate(DocumentEvent e) {
                scheduleHighlight();
            }

            public void changedUpdate(DocumentEvent e) {
                scheduleHighlight();
            }
        });

        setVisible(true);
    }

    private void scheduleHighlight() {
        highlightTimer.restart();
    }

    private void initStyles() {
        Style defaultStyle = doc.addStyle("default", null);
        StyleConstants.setForeground(defaultStyle, Color.BLACK);

        Style keywordStyle = doc.addStyle("keyword", null);
        StyleConstants.setForeground(keywordStyle, Color.BLUE);
        StyleConstants.setBold(keywordStyle, true);

        Style commentStyle = doc.addStyle("comment", null);
        StyleConstants.setForeground(commentStyle, Color.GRAY);

        Style stringStyle = doc.addStyle("string", null);
        StyleConstants.setForeground(stringStyle, new Color(0, 128, 0));
    }

    private void highlightSyntax() {
        SwingUtilities.invokeLater(() -> {
            String text = textPane.getText();
            doc.setCharacterAttributes(0, text.length(), doc.getStyle("default"), true);

            // Keywords
            String[] keywords = {
                    "public", "class", "static", "void", "if", "else", "for", "while", "return", "new"
            };
            for (String keyword : keywords) {
                Matcher matcher = Pattern.compile("\\b" + keyword + "\\b").matcher(text);
                while (matcher.find()) {
                    doc.setCharacterAttributes(matcher.start(), matcher.end() - matcher.start(), doc.getStyle("keyword"), true);
                }
            }

            // Strings
            Matcher stringMatcher = Pattern.compile("\"(\\\\.|[^\"])*\"").matcher(text);
            while (stringMatcher.find()) {
                doc.setCharacterAttributes(stringMatcher.start(), stringMatcher.end() - stringMatcher.start(), doc.getStyle("string"), true);
            }

            // Comments
            Matcher commentMatcher = Pattern.compile("//.*").matcher(text);
            while (commentMatcher.find()) {
                doc.setCharacterAttributes(commentMatcher.start(), commentMatcher.end() - commentMatcher.start(), doc.getStyle("comment"), true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(workingHighlighter::new);
    }
}
