import java.awt.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class AnotherGUI extends JFrame {

	// UI Components
	private JSplitPane editorSplitPane;
	private JPanel editorPanel;
	private JPanel treePanel;
	private JTextArea codeEditor;
	private JTextArea outputConsole;
	private JLabel treeLabel;
	private JButton compileBtn;
	private JButton showTreeBtn;
	private JButton loadFileBtn;
	private JLabel statusLabel;
	private JLabel compileStatusIcon;
	private JList<String> fileList;
	private DefaultListModel<String> fileListModel;
	private Map<String, String> fileContentsMap;
	private JTabbedPane mainTabs;

	private ArithmeticExpressionsParser parser;

	public AnotherGUI() {
		initUI();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("CS407 Compiler");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initUI() {

		fileListModel = new DefaultListModel<>();
		fileContentsMap = new HashMap<>();

		// Main Tabbed Pane
		mainTabs = new JTabbedPane();
		mainTabs.setBackground(new Color(240, 240, 240));
		mainTabs.setForeground(new Color(50, 50, 50));


		editorPanel = new JPanel(new BorderLayout());
		createEditorComponents();
		mainTabs.addTab("Editor", editorPanel);


		treePanel = new JPanel(new BorderLayout());
		createTreeComponents();
		mainTabs.addTab("Parse Tree", treePanel);


		JPanel statusPanel = new JPanel(new BorderLayout());
		statusLabel = new JLabel(" Ready");
		compileStatusIcon = new JLabel();
		compileStatusIcon.setPreferredSize(new Dimension(30, 48));

		JPanel statusLeftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
		statusLeftPanel.add(statusLabel);
		statusLeftPanel.add(compileStatusIcon);
		statusPanel.add(statusLeftPanel, BorderLayout.WEST);


		statusPanel.setBackground(new Color(0, 51, 102));


		setLayout(new BorderLayout());
		add(mainTabs, BorderLayout.CENTER);
		add(statusPanel, BorderLayout.SOUTH);
	}

	private void createEditorComponents() {
		// File Browser Sidebar
		JPanel sidebarPanel = new JPanel(new BorderLayout());
		sidebarPanel.setPreferredSize(new Dimension(220, 0));
		sidebarPanel.setBackground(Color.WHITE);

		fileList = new JList<>(fileListModel);
		fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		fileList.setBackground(new Color(238, 238, 238));
		fileList.setForeground(new Color(50, 50, 50));
		fileList.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fileList.addListSelectionListener(e -> {
			if (!e.getValueIsAdjusting()) {
				String selectedFile = fileList.getSelectedValue();
				if (selectedFile != null) {
					codeEditor.setText(fileContentsMap.get(selectedFile));
					statusLabel.setText(" Displaying: " + selectedFile);
				}
			}
		});

		JScrollPane listScroll = new JScrollPane(fileList);
		listScroll.setBorder(BorderFactory.createTitledBorder("Files"));
		listScroll.setBackground(Color.WHITE);

		loadFileBtn = createButton("Load Files", this::loadFile);
		JButton removeFileBtn = createButton("Remove", this::removeFile);

		JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 10));
		buttonPanel.add(loadFileBtn);
		buttonPanel.add(removeFileBtn);
		buttonPanel.setBackground(Color.WHITE);

		sidebarPanel.add(listScroll, BorderLayout.CENTER);
		sidebarPanel.add(buttonPanel, BorderLayout.SOUTH);


		codeEditor = new JTextArea();
		codeEditor.setFont(new Font("Courier New", Font.PLAIN, 18));
		codeEditor.setBackground(Color.WHITE);
		codeEditor.setForeground(Color.BLUE);
		JScrollPane editorScroll = new JScrollPane(codeEditor);
		editorScroll.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 102), 2));


		outputConsole = new JTextArea();
		outputConsole.setEditable(false);
		outputConsole.setFont(new Font("Courier New", Font.PLAIN, 20));
		outputConsole.setBackground(new Color(240, 240, 240));
		outputConsole.setForeground(new Color(50, 50, 50));
		JScrollPane consoleScroll = new JScrollPane(outputConsole);
		consoleScroll.setBorder(BorderFactory.createTitledBorder("Compilation Output"));


		compileBtn = createButton("Compile", this::compileCode);


		JPanel buttonPanelRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		buttonPanelRight.add(compileBtn);
		buttonPanelRight.setBackground(Color.WHITE);


		JPanel editorMainPanel = new JPanel(new BorderLayout());
		editorMainPanel.setBackground(Color.WHITE);
		editorMainPanel.add(buttonPanelRight, BorderLayout.NORTH);
		editorMainPanel.add(editorScroll, BorderLayout.CENTER);
		editorMainPanel.add(consoleScroll, BorderLayout.SOUTH);


		editorSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sidebarPanel, editorMainPanel);
		editorSplitPane.setDividerLocation(220);
		editorSplitPane.setResizeWeight(0.2);

		editorPanel.add(editorSplitPane, BorderLayout.CENTER);
	}

	private void removeFile() {
		String selectedFile = fileList.getSelectedValue();
		if (selectedFile != null) {
			fileContentsMap.remove(selectedFile);
			fileListModel.removeElement(selectedFile);
			statusLabel.setText(" Removed: " + selectedFile);
		}
	}

	private void createTreeComponents() {

		treeLabel = new JLabel("Compile code to generate parse tree", JLabel.CENTER);
		treeLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		treeLabel.setForeground(Color.BLACK);
		treeLabel.setBorder(BorderFactory.createLineBorder(new Color(255, 153, 153), 1));


		showTreeBtn = createButton("Show Parse Tree", this::showParseTree);

		JScrollPane treeScroll = new JScrollPane(treeLabel);
		treeScroll.setBackground(Color.WHITE);
		treePanel.setBackground(Color.WHITE);
		treePanel.add(treeScroll, BorderLayout.CENTER);
		treePanel.add(showTreeBtn, BorderLayout.SOUTH);
	}

	private JButton createButton(String text, Runnable action) {
		JButton button = new JButton(text);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(0, 122, 255)); // More vibrant blue
		button.setForeground(Color.WHITE);
		button.setFocusPainted(false);
		button.setPreferredSize(new Dimension(120, 40)); // Larger button size
		button.addActionListener(e -> action.run());
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


		if (text.equals("Compile")) {
			try {
				ImageIcon icon = new ImageIcon("Run1.jpg");
				// Scale the icon if needed
				Image img = icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
				button.setIcon(new ImageIcon(img));
				button.setHorizontalTextPosition(SwingConstants.LEFT);
				button.setIconTextGap(10);
			} catch (Exception e) {
				System.err.println("Error loading icon: " + e.getMessage());
			}
		}

		button.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				button.setBackground(new Color(0, 102, 255)); // Darker blue on hover
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				button.setBackground(new Color(0, 122, 255)); // Reset to original color
			}
		});

		return button;
	}
	private void loadFile() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setMultiSelectionEnabled(true);
		if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			for (File file : fileChooser.getSelectedFiles()) {
				try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
					StringBuilder content = new StringBuilder();
					String line;
					while ((line = reader.readLine()) != null) {
						content.append(line).append("\n");
					}

					String fileName = file.getName();
					fileContentsMap.put(fileName, content.toString());

					if (!fileListModel.contains(fileName)) {
						fileListModel.addElement(fileName);
					}

					statusLabel.setText(" Loaded: " + fileName);
				} catch (Exception ex) {
					statusLabel.setText(" Error loading: " + file.getName());
					compileStatusIcon.setIcon(new ImageIcon("False.JPG"));
					JOptionPane.showMessageDialog(this, "Error loading file: " + ex.getMessage(),
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}

	private void compileCode() {
		try {
			String code = codeEditor.getText();
			ANTLRStringStream input = new ANTLRStringStream(code);
			ArithmeticExpressionsLexer lexer = new ArithmeticExpressionsLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new ArithmeticExpressionsParser(tokens);

			ArithmeticExpressionsParser.startgeneralArithExpr_return r = parser.startgeneralArithExpr();
			CommonTree t = (CommonTree) r.getTree();


			DOTTreeGenerator gen = new DOTTreeGenerator();
			StringTemplate st = gen.toDOT(t);
			String formattedDot = st.toString()
					.replaceFirst("bgcolor=\"lightgrey\"", "bgcolor=\"0 .4 .7\"")
					.replaceFirst("fontcolor=\"blue\"", "fontcolor=\"black\"");

			try (PrintWriter out = new PrintWriter("Dot.dot")) {
				out.print(formattedDot);
			}


			Process process = new ProcessBuilder("DOT.BAT").start();
			process.waitFor();


			String msg = parser.s;
			if (msg.contains("line")) {
				outputConsole.setForeground(Color.RED);
				outputConsole.setText("Compilation Errors:\n" + msg);
				statusLabel.setText(" Compilation failed");
				compileStatusIcon.setIcon(new ImageIcon("False.JPG"));
			} else {
				outputConsole.setForeground(new Color(0, 102, 10));
				outputConsole.setText("Compilation Successful!\n" + msg);
				statusLabel.setText(" Compilation successful");
				compileStatusIcon.setIcon(new ImageIcon("Correct.JPG"));
			}

		} catch (Exception ex) {
			outputConsole.setForeground(Color.RED);
			outputConsole.setText("Error during compilation:\n" + ex.getMessage());
			statusLabel.setText(" Error during compilation");
			compileStatusIcon.setIcon(new ImageIcon("False.JPG"));
		}
	}

	private void showParseTree() {
		try {
			File treeImage = new File("Parse.png");
			if (treeImage.exists()) {

				Dimension panelSize = treePanel.getSize();
				int availableWidth = panelSize.width - 20;
				int availableHeight = panelSize.height - 50;


				Image originalImage = ImageIO.read(treeImage);
				double aspectRatio = (double)originalImage.getWidth(null)/originalImage.getHeight(null);

				int scaledWidth, scaledHeight;
				if (availableWidth/aspectRatio <= availableHeight) {
					scaledWidth = availableWidth;
					scaledHeight = (int)(availableWidth/aspectRatio);
				} else {
					scaledHeight = availableHeight;
					scaledWidth = (int)(availableHeight*aspectRatio);
				}

				Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(scaledImage);

				treeLabel.setIcon(icon);
				treeLabel.setText("");
				treeLabel.setHorizontalAlignment(JLabel.CENTER);
				treeLabel.setVerticalAlignment(JLabel.CENTER);


				JScrollPane scrollPane = (JScrollPane)treePanel.getComponent(0);
				scrollPane.getViewport().setViewPosition(new Point(0,0));

				mainTabs.setSelectedIndex(1);
				statusLabel.setText(" Parse tree displayed");
			} else {
				treeLabel.setIcon(null);
				treeLabel.setText("No parse tree available. Compile first.");
				statusLabel.setText(" No parse tree generated");
			}
		} catch (Exception ex) {
			treeLabel.setText("Error loading parse tree: " + ex.getMessage());
			statusLabel.setText(" Error loading parse tree");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			AnotherGUI gui = new AnotherGUI();
			gui.setVisible(true);
		});
	}
}
