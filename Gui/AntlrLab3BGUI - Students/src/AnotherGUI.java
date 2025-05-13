import java.awt.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.text.JTextComponent;

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
	private JButton themeToggleBtn;
	private JLabel statusLabel;
	private JLabel compileStatusIcon;
	private JList<String> fileList;
	private DefaultListModel<String> fileListModel;
	private Map<String, String> fileContentsMap;
	private JTabbedPane mainTabs;

	// Theme colors
	private ThemeColors currentTheme;

	// Theme class to store color schemes
	private static class ThemeColors {
		Color background;
		Color foreground;
		Color accent;
		Color editorBackground;
		Color editorForeground;
		Color consoleBackground;
		Color consoleForeground;
		Color statusBarBackground;
		Color statusBarForeground;
		Color buttonBackground;
		Color buttonForeground;
		Color buttonHoverBackground;
		Color borderColor;
		Color tabBackground;
		Color tabForeground;
		Color selectionBackground;
		Color selectionForeground;

		// Light theme
		static ThemeColors lightTheme() {
			ThemeColors tc = new ThemeColors();
			tc.background = Color.WHITE;
			tc.foreground = new Color(50, 50, 50);
			tc.accent = new Color(0, 102, 102);
			tc.editorBackground = Color.WHITE;
			tc.editorForeground = Color.BLUE;
			tc.consoleBackground = new Color(240, 240, 240);
			tc.consoleForeground = new Color(50, 50, 50);
			tc.statusBarBackground = new Color(0, 51, 102);
			tc.statusBarForeground = Color.WHITE;
			tc.buttonBackground = new Color(0, 122, 255);
			tc.buttonForeground = Color.WHITE;
			tc.buttonHoverBackground = new Color(0, 102, 255);
			tc.borderColor = new Color(200, 200, 200);
			tc.tabBackground = new Color(240, 240, 240);
			tc.tabForeground = new Color(50, 50, 50);
			tc.selectionBackground = new Color(184, 207, 229);
			tc.selectionForeground = Color.BLACK;
			return tc;
		}

		// Dark theme
		static ThemeColors darkTheme() {
			ThemeColors tc = new ThemeColors();
			tc.background = new Color(43, 43, 43);
			tc.foreground = new Color(187, 187, 187);
			tc.accent = new Color(0, 150, 150);
			tc.editorBackground = new Color(30, 30, 30);
			tc.editorForeground = new Color(169, 183, 198);
			tc.consoleBackground = new Color(43, 43, 43);
			tc.consoleForeground = new Color(187, 187, 187);
			tc.statusBarBackground = new Color(0, 30, 60);
			tc.statusBarForeground = Color.WHITE;
			tc.buttonBackground = new Color(59, 80, 120);
			tc.buttonForeground = new Color(48, 50, 50);
			tc.buttonHoverBackground = new Color(75, 110, 175);
			tc.borderColor = new Color(80, 80, 80);
			tc.tabBackground = new Color(50, 50, 50);
			tc.tabForeground = new Color(116, 124, 132);
			tc.selectionBackground = new Color(50, 80, 120);
			tc.selectionForeground = Color.WHITE;
			return tc;
		}
	}

	private boolean isDarkTheme = true;

	private ArithmeticExpressionsParser parser;

	public AnotherGUI() {
		// Initialize with Dark theme
		currentTheme = ThemeColors.darkTheme();
		initUI();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("CS407 Compiler");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(currentTheme.background);
		menuBar.setForeground(currentTheme.foreground);

		// File menu
		JMenu fileMenu = new JMenu("File");
		fileMenu.setBackground(currentTheme.background);
		fileMenu.setForeground(currentTheme.foreground);

		JMenuItem openItem = new JMenuItem("Open");
		openItem.setBackground(currentTheme.background);
		openItem.setForeground(currentTheme.foreground);
		openItem.addActionListener(e -> loadFile());

		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setBackground(currentTheme.background);
		exitItem.setForeground(currentTheme.foreground);
		exitItem.addActionListener(e -> System.exit(0));

		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);

		// Settings menu
		JMenu settingsMenu = new JMenu("Settings");
		settingsMenu.setBackground(currentTheme.background);
		settingsMenu.setForeground(currentTheme.foreground);

		JMenuItem toggleThemeItem = new JMenuItem("Toggle Theme");
		toggleThemeItem.setBackground(currentTheme.background);
		toggleThemeItem.setForeground(currentTheme.foreground);
		toggleThemeItem.addActionListener(e -> toggleTheme());
		settingsMenu.add(toggleThemeItem);

		// Add menus to the menu bar
		menuBar.add(fileMenu);
		menuBar.add(settingsMenu);

		// Set the menu bar to the frame
		setJMenuBar(menuBar);
	}

	private void initUI() {
		fileListModel = new DefaultListModel<>();
		fileContentsMap = new HashMap<>();
		getContentPane().setBackground(currentTheme.background);
		getRootPane().setBackground(currentTheme.background);

		// Main Tabbed Pane
		mainTabs = new JTabbedPane();

		mainTabs.setBackground(currentTheme.tabBackground);
		mainTabs.setForeground(currentTheme.tabForeground);

		mainTabs.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
			@Override
			protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
				if (isSelected) {
					g.setColor(currentTheme.buttonBackground); // Set selected tab color
				} else {
					g.setColor(currentTheme.buttonForeground); // Set unselected tab color
				}
				g.fillRect(x, y, w, h);
			}

			@Override
			protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
				// Leave empty to not paint borders
			}

			// Override to remove the content border
			@Override
			protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
				// Leave empty to not paint content border
			}
		});
		editorPanel = new JPanel(new BorderLayout());
		createEditorComponents();
		mainTabs.addTab("Editor", editorPanel);

		treePanel = new JPanel(new BorderLayout());
		createTreeComponents();
		mainTabs.addTab("Parse Tree", treePanel);

		JPanel statusPanel = new JPanel(new BorderLayout());
		statusPanel.setBackground(currentTheme.statusBarBackground);

		statusLabel = new JLabel(" Ready");
		statusLabel.setForeground(currentTheme.statusBarForeground);
		statusLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));

		compileStatusIcon = new JLabel();
		compileStatusIcon.setPreferredSize(new Dimension(30, 48));

		JPanel statusLeftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
		statusLeftPanel.setBackground(currentTheme.statusBarBackground);
		statusLeftPanel.add(statusLabel);
		statusLeftPanel.add(compileStatusIcon);
		statusPanel.add(statusLeftPanel, BorderLayout.WEST);

		setLayout(new BorderLayout());

		add(mainTabs, BorderLayout.CENTER);
		add(statusPanel, BorderLayout.SOUTH);
	}

	private void toggleTheme() {
		SwingUtilities.invokeLater(() -> {
			if (isDarkTheme) {
				// Switch to light theme
				currentTheme = ThemeColors.lightTheme();
				isDarkTheme = false;
			} else {
				// Switch to dark theme
				currentTheme = ThemeColors.darkTheme();
				isDarkTheme = true;
			}

			// Apply the new theme
			applyTheme();
		});
	}

	private void applyTheme() {
		// Apply theme to the root components
		getContentPane().setBackground(currentTheme.background);
		getRootPane().setBackground(currentTheme.background);

		// Update menu bar
		JMenuBar menuBar = getJMenuBar();
		if (menuBar != null) {
			updateComponentRecursively(menuBar);
		}

		// Update tabbed pane
		mainTabs.setBackground(currentTheme.tabBackground);
		mainTabs.setForeground(currentTheme.tabForeground);

		// Update editor components
		updateEditorComponents();

		// Update tree components
		updateTreeComponents();

		// Update status bar
		Component[] statusComponents = ((Container) getContentPane().getComponent(1)).getComponents();
		for (Component component : statusComponents) {
			updateComponentRecursively(component);
		}

		// Recursively update all other components in the frame
		updateComponentRecursively(getContentPane());

		// Force repaint of the entire UI
		SwingUtilities.updateComponentTreeUI(this);
	}

	private void updateEditorComponents() {
		// Editor components
		codeEditor.setBackground(currentTheme.editorBackground);
		codeEditor.setForeground(currentTheme.editorForeground);
		codeEditor.setCaretColor(currentTheme.foreground);
		codeEditor.setSelectionColor(currentTheme.selectionBackground);
		codeEditor.setSelectedTextColor(currentTheme.selectionForeground);

		// Output console
		outputConsole.setBackground(currentTheme.consoleBackground);
		outputConsole.setForeground(currentTheme.consoleForeground);
		outputConsole.setSelectionColor(currentTheme.selectionBackground);
		outputConsole.setSelectedTextColor(currentTheme.selectionForeground);

		// File list
		fileList.setBackground(currentTheme.background);
		fileList.setForeground(currentTheme.foreground);
		fileList.setSelectionBackground(currentTheme.selectionBackground);
		fileList.setSelectionForeground(currentTheme.selectionForeground);

		// Update buttons
		updateButtonAppearance(compileBtn);
		updateButtonAppearance(showTreeBtn);
		updateButtonAppearance(loadFileBtn);

		// Update panels
		editorPanel.setBackground(currentTheme.background);

		// Update borders - using a safer approach
		Border editorBorder = BorderFactory.createLineBorder(currentTheme.borderColor, 2);

		// Find the editor component safely
		findAndUpdateBorder(editorPanel, editorBorder);
	}

	// Helper method to safely find and update the border of the text component
	private void findAndUpdateBorder(Container container, Border border) {
		for (Component comp : container.getComponents()) {
			if (comp instanceof JTextComponent) {
				((JComponent) comp).setBorder(border);
			} else if (comp instanceof JScrollPane) {
				Component view = ((JScrollPane) comp).getViewport().getView();
				if (view instanceof JComponent) {
					((JComponent) view).setBorder(border);
				}
			} else if (comp instanceof Container) {
				findAndUpdateBorder((Container) comp, border);
			}
		}
	}

	private void updateTreeComponents() {
		treePanel.setBackground(currentTheme.background);
		treeLabel.setBackground(currentTheme.background);
		treeLabel.setForeground(currentTheme.foreground);
		treeLabel.setBorder(BorderFactory.createLineBorder(currentTheme.borderColor, 1));
	}

	private void updateButtonAppearance(JButton button) {
		if (button != null) {
			button.setBackground(currentTheme.buttonBackground);
			button.setForeground(currentTheme.buttonForeground);
			button.setBorder(BorderFactory.createRaisedBevelBorder());

			// Remove existing listeners to avoid duplicates
			for (java.awt.event.MouseListener listener : button.getMouseListeners()) {
				if (listener instanceof java.awt.event.MouseAdapter) {
					button.removeMouseListener(listener);
				}
			}

			// Add hover effect
			button.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseEntered(java.awt.event.MouseEvent evt) {
					button.setBackground(currentTheme.buttonHoverBackground);
				}
				@Override
				public void mouseExited(java.awt.event.MouseEvent evt) {
					button.setBackground(currentTheme.buttonBackground);
				}
			});
		}
	}

	private void updateComponentRecursively(Component component) {
		if (component == compileBtn || component == showTreeBtn || component == loadFileBtn) {
			return; // Skip buttons with special handling
		}

		if (component instanceof JTextArea) {
			JTextArea textArea = (JTextArea) component;
			textArea.setBackground(currentTheme.editorBackground);
			textArea.setForeground(currentTheme.editorForeground);
			textArea.setCaretColor(currentTheme.foreground);
			textArea.setSelectionColor(currentTheme.selectionBackground);
			textArea.setSelectedTextColor(currentTheme.selectionForeground);
		} else if (component instanceof JList) {
			JList<?> list = (JList<?>) component;
			list.setBackground(currentTheme.background);
			list.setForeground(currentTheme.foreground);
			list.setSelectionBackground(currentTheme.selectionBackground);
			list.setSelectionForeground(currentTheme.selectionForeground);
		} else if (component instanceof JLabel) {
			JLabel label = (JLabel) component;
			label.setBackground(currentTheme.background);
			label.setForeground(currentTheme.foreground);
		} else if (component instanceof JPanel) {
			((JPanel) component).setBackground(currentTheme.background);
		} else if (component instanceof JScrollPane) {
			JScrollPane scrollPane = (JScrollPane) component;
			scrollPane.setBackground(currentTheme.background);
			scrollPane.getViewport().setBackground(currentTheme.background);
			if (scrollPane.getBorder() instanceof TitledBorder) {
				TitledBorder titledBorder = (TitledBorder) scrollPane.getBorder();
				titledBorder.setTitleColor(currentTheme.foreground);
				titledBorder.setBorder(BorderFactory.createLineBorder(currentTheme.borderColor, 1));
			}
		} else if (component instanceof JTabbedPane) {
			JTabbedPane tabbedPane = (JTabbedPane) component;
			tabbedPane.setBackground(currentTheme.tabBackground);
			tabbedPane.setForeground(currentTheme.tabForeground);
		} else if (component instanceof JSplitPane) {
			JSplitPane splitPane = (JSplitPane) component;
			splitPane.setBackground(currentTheme.background);
			splitPane.setBorder(BorderFactory.createLineBorder(currentTheme.borderColor, 1));
			splitPane.setDividerSize(3);
			splitPane.setDividerLocation(splitPane.getDividerLocation());
		}

		if (component instanceof Container) {
			for (Component child : ((Container) component).getComponents()) {
				updateComponentRecursively(child);
			}
		}
	}

	private void createEditorComponents() {
		createMenuBar();
		JPanel sidebarPanel = new JPanel(new BorderLayout());
		sidebarPanel.setPreferredSize(new Dimension(220, 0));
		sidebarPanel.setBackground(currentTheme.background);

		fileList = new JList<>(fileListModel);
		fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		fileList.setBackground(currentTheme.background);
		fileList.setForeground(currentTheme.foreground);
		fileList.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fileList.setSelectionBackground(currentTheme.selectionBackground);
		fileList.setSelectionForeground(currentTheme.selectionForeground);
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
		TitledBorder titledBorder = BorderFactory.createTitledBorder("Files");
		titledBorder.setTitleColor(currentTheme.foreground);
		titledBorder.setBorder(BorderFactory.createLineBorder(currentTheme.borderColor, 1));
		listScroll.setBorder(titledBorder);
		listScroll.setBackground(currentTheme.background);

		loadFileBtn = createButton("Load Files", this::loadFile);
		JButton removeFileBtn = createButton("Remove", this::removeFile);

		JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 10));
		buttonPanel.add(loadFileBtn);
		buttonPanel.add(removeFileBtn);
		buttonPanel.setBackground(currentTheme.background);

		sidebarPanel.add(listScroll, BorderLayout.CENTER);
		sidebarPanel.add(buttonPanel, BorderLayout.SOUTH);

		codeEditor = new JTextArea();
		codeEditor.setFont(new Font("Courier New", Font.PLAIN, 18));
		codeEditor.setBackground(currentTheme.editorBackground);
		codeEditor.setForeground(currentTheme.editorForeground);
		codeEditor.setCaretColor(currentTheme.foreground);
		codeEditor.setSelectionColor(currentTheme.selectionBackground);
		codeEditor.setSelectedTextColor(currentTheme.selectionForeground);

		JScrollPane editorScroll = new JScrollPane(codeEditor);
		editorScroll.setBorder(BorderFactory.createLineBorder(currentTheme.accent, 2));
		editorScroll.setBackground(currentTheme.background);

		outputConsole = new JTextArea();
		outputConsole.setEditable(false);
		outputConsole.setFont(new Font("Courier New", Font.PLAIN, 20));
		outputConsole.setBackground(currentTheme.consoleBackground);
		outputConsole.setForeground(currentTheme.consoleForeground);
		outputConsole.setSelectionColor(currentTheme.selectionBackground);
		outputConsole.setSelectedTextColor(currentTheme.selectionForeground);

		JScrollPane consoleScroll = new JScrollPane(outputConsole);
		TitledBorder consoleBorder = BorderFactory.createTitledBorder("Compilation Output");
		consoleBorder.setTitleColor(currentTheme.foreground);
		consoleBorder.setBorder(BorderFactory.createLineBorder(currentTheme.borderColor, 1));
		consoleScroll.setBorder(consoleBorder);
		consoleScroll.setBackground(currentTheme.background);

		compileBtn = createButton("Compile", this::compileCode);

		JPanel buttonPanelRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		buttonPanelRight.add(compileBtn);
		buttonPanelRight.setBackground(currentTheme.background);

		JPanel editorMainPanel = new JPanel(new BorderLayout());
		editorMainPanel.setBackground(currentTheme.background);
		editorMainPanel.add(buttonPanelRight, BorderLayout.NORTH);
		editorMainPanel.add(editorScroll, BorderLayout.CENTER);
		editorMainPanel.add(consoleScroll, BorderLayout.SOUTH);

		editorSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sidebarPanel, editorMainPanel);
		editorSplitPane.setDividerLocation(220);
		editorSplitPane.setResizeWeight(0.2);
		editorSplitPane.setDividerSize(10); // Adjust divider size
		editorSplitPane.setBackground(currentTheme.borderColor); // Set divider color
		editorSplitPane.setUI(new BasicSplitPaneUI() {
			@Override
			public BasicSplitPaneDivider createDefaultDivider() {
				BasicSplitPaneDivider divider = super.createDefaultDivider();
				divider.setBackground(currentTheme.borderColor); // Set divider color
				return divider;
			}
		});
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
		treeLabel.setForeground(currentTheme.foreground);
		treeLabel.setBackground(currentTheme.background);
		treeLabel.setBorder(BorderFactory.createLineBorder(currentTheme.borderColor, 1));

		showTreeBtn = createButton("Show Parse Tree", this::showParseTree);

		JScrollPane treeScroll = new JScrollPane(treeLabel);
		treeScroll.setBackground(currentTheme.background);
		treePanel.setBackground(currentTheme.background);
		treePanel.add(treeScroll, BorderLayout.CENTER);
		treePanel.add(showTreeBtn, BorderLayout.SOUTH);
	}

	private JButton createButton(String text, Runnable action) {
		JButton button = new JButton(text);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(currentTheme.buttonBackground);
		button.setForeground(currentTheme.buttonForeground);
		button.setFocusPainted(false);
		button.setPreferredSize(new Dimension(120, 40));
		button.setBorder(BorderFactory.createRaisedBevelBorder());
		button.addActionListener(e -> action.run());
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		if (text.equals("Compile")) {
			try {
				ImageIcon icon = new ImageIcon("Run1.jpg");
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
				button.setBackground(currentTheme.buttonHoverBackground);
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				button.setBackground(currentTheme.buttonBackground);
			}
		});

		return button;
	}

	private void loadFile() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setMultiSelectionEnabled(true);

		// Update file chooser UI with current theme
		updateFileChooserUI(fileChooser);

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

	private void updateFileChooserUI(JFileChooser chooser) {
		// Update file chooser appearance
		updateComponentRecursively(chooser);

		// Specific handling for file chooser components
		for (Component c : chooser.getComponents()) {
			updateComponentRecursively(c);
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
					.replaceFirst("bgcolor=\"lightgrey\"", isDarkTheme ? "bgcolor=\"0.2 0.2 0.2\"" : "bgcolor=\"0 .4 .7\"")
					.replaceFirst("fontcolor=\"blue\"", isDarkTheme ? "fontcolor=\"white\"" : "fontcolor=\"black\"");

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