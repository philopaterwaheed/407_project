import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.JTextComponent;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class AnotherGUI extends JFrame {

	private final DotRunner dotRunner;
	private Path outputDirectory;

	private static final String DEFAULT_OUTPUT_DIR = "graphs";

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



	private ThemeType currentThemeType = ThemeType.DRACULA;



	private ArithmeticExpressionsParser parser;

	public AnotherGUI() {
		this.dotRunner = new DotRunner();
		this.outputDirectory = Paths.get(DEFAULT_OUTPUT_DIR);
		try {
			PathUtils.ensureDirectoryExists(this.outputDirectory);
		} catch (IOException e) {
			throw new RuntimeException("Failed to create output directory: " + e.getMessage(), e);
		}
		// Initialize with dracula theme
		currentTheme = ThemeColors.draculaTheme();
		initUI();
		switchTheme(currentThemeType);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("CS407 Compiler");
		setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

	private void createMenuBar() {
		JMenuBar menuBar = new JMenuBar() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				setOpaque(true);
			}
		};
		menuBar.setBackground(currentTheme.background);
		menuBar.setForeground(currentTheme.foreground);

		// File menu
		JMenu fileMenu = createMenu("File");

		JMenuItem openItem = createMenuItem("Open", e -> loadFile());
		JMenuItem exitItem = createMenuItem("Exit", e -> System.exit(0));

		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);

		// Settings menu
		JMenu settingsMenu = createMenu("Settings");

		// Create Themes submenu
		JMenu themesMenu = createMenu("Themes");

		// Create menu items for each theme
		for (ThemeType themeType : ThemeType.values()) {
			JMenuItem themeItem = createMenuItem(themeType.toString(), e -> switchTheme(themeType));
			themesMenu.add(themeItem);
		}

		settingsMenu.add(themesMenu);

		// Add menus to the menu bar
		menuBar.add(fileMenu);
		menuBar.add(settingsMenu);

		// Set the menu bar to the frame
		setJMenuBar(menuBar);
	}
	private JMenuItem createMenuItem(String text, ActionListener action) {
		JMenuItem item = new JMenuItem(text) {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				setOpaque(true);
			}
		};
		item.setBackground(currentTheme.background);
		item.setForeground(currentTheme.foreground);
		item.addActionListener(action);

		// Add hover effect
		item.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				item.setBackground(currentTheme.selectionBackground);
				item.setForeground(currentTheme.selectionForeground);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				item.setBackground(currentTheme.background);
				item.setForeground(currentTheme.foreground);
			}
		});

		return item;
	}

	private JMenu createMenu(String text) {
		JMenu menu = new JMenu(text) {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				setOpaque(true);
			}
		};
		menu.setBackground(currentTheme.background);
		menu.setForeground(currentTheme.foreground);
		menu.getPopupMenu().setBackground(currentTheme.background);
		menu.getPopupMenu().setForeground(currentTheme.foreground);

		// Add hover effect for the menu itself
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu.setBackground(currentTheme.selectionBackground);
				menu.setForeground(currentTheme.selectionForeground);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu.setBackground(currentTheme.background);
				menu.setForeground(currentTheme.foreground);
			}
		});

		return menu;
	}




	private void initUI() {
		fileListModel = new DefaultListModel<>();
		fileContentsMap = new HashMap<>();
		getContentPane().setBackground(currentTheme.background);
		getRootPane().setBackground(currentTheme.background);

		// Main Tabbed Pane
		mainTabs = new JTabbedPane() {
			@Override
			public void updateUI() {
				setUI(new CustomTabbedPaneUI());
			}
		};


		mainTabs.setBackground(currentTheme.tabBackground);
		mainTabs.setForeground(currentTheme.tabForeground);

		mainTabs.setUI(new BasicTabbedPaneUI() {
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

	private void switchTheme(ThemeType newTheme) {
		SwingUtilities.invokeLater(() -> {
			currentThemeType = newTheme;
			switch (newTheme) {
				case DARK:
					currentTheme = ThemeColors.darkTheme();
					break;
				case LIGHT:
					currentTheme = ThemeColors.lightTheme();
					break;
				case DRACULA:
					currentTheme = ThemeColors.draculaTheme();
					break;
				case MONOKAI:
					currentTheme = ThemeColors.monokaiTheme();
					break;
				case SOLARIZED_DARK:
					currentTheme = ThemeColors.solarizedDarkTheme();
					break;
				case SOLARIZED_LIGHT:
					currentTheme = ThemeColors.solarizedLightTheme();
					break;
				case NORD:
					currentTheme = ThemeColors.nordTheme();
					break;
				case GRUVBOX_DARK:
					currentTheme = ThemeColors.gruvboxDarkTheme();
					break;
				case ONE_DARK:
					currentTheme = ThemeColors.oneDarkTheme();
					break;
				case GITHUB_DARK:
					currentTheme = ThemeColors.githubDarkTheme();
					break;
					case  CATPPUCCIN_MOCHA:
					currentTheme = ThemeColors.catppuccinMochaTheme();
					break;
				case CATPPUCCIN_MACCHIATO:
					currentTheme = ThemeColors.catppuccinMacchiatoTheme();
					break;
				case CATPPUCCIN_FRAPPE:
					currentTheme = ThemeColors.catppuccinFrappeTheme();
					break;
				case CATPPUCCIN_LATTE:
					currentTheme = ThemeColors.catppuccinLatteTheme();
					break;


			}
			applyTheme();
		});
	}



	private void updateSplitPaneUI() {
		if (editorSplitPane != null) {
			int location = editorSplitPane.getDividerLocation();
			editorSplitPane.setUI(new CustomSplitPaneUI());
			editorSplitPane.setDividerLocation(location);
			editorSplitPane.setDividerSize(3);
			editorSplitPane.setBorder(null);
		}
	}
	private void updateMainTabsUI() {
		if (mainTabs != null) {
			mainTabs.setUI(new CustomTabbedPaneUI());
			mainTabs.setBorder(BorderFactory.createEmptyBorder());
			mainTabs.setBackground(currentTheme.tabBackground);
			mainTabs.setForeground(currentTheme.tabForeground);

			// Update each tab component if any
			for (int i = 0; i < mainTabs.getTabCount(); i++) {
				Component comp = mainTabs.getComponentAt(i);
				if (comp != null) {
					comp.setBackground(currentTheme.tabBackground);
					comp.setForeground(currentTheme.tabForeground);
				}
			}
		}
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

		// Update tabbed pane with custom UI
		updateMainTabsUI();

		// Update split pane UI
		updateSplitPaneUI();

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

		// Ensure the updates are applied
		revalidate();
		repaint();
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

		Border editorBorder = BorderFactory.createLineBorder(currentTheme.borderColor, 2);

		editorSplitPane.setUI(new BasicSplitPaneUI() {
			@Override
			public BasicSplitPaneDivider createDefaultDivider() {
				BasicSplitPaneDivider divider = super.createDefaultDivider();
				divider.setBackground(currentTheme.borderColor); // Set divider color
				return divider;
			}
		});
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
			for (MouseListener listener : button.getMouseListeners()) {
				if (listener instanceof MouseAdapter) {
					button.removeMouseListener(listener);
				}
			}

			// Add hover effect
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent evt) {
					button.setBackground(currentTheme.buttonHoverBackground);
				}
				@Override
				public void mouseExited(MouseEvent evt) {
					button.setBackground(currentTheme.buttonBackground);
				}
			});
		}
	}

	private void updateComponentRecursively(Component component) {
		if (component == compileBtn || component == showTreeBtn || component == loadFileBtn) {
			return; // Skip buttons with special handling
		}

		if (component instanceof JMenuBar) {
			component.setBackground(currentTheme.background);
			component.setForeground(currentTheme.foreground);
		} else if (component instanceof JMenu) {
			JMenu menu = (JMenu) component;
			menu.setBackground(currentTheme.background);
			menu.setForeground(currentTheme.foreground);
			menu.getPopupMenu().setBackground(currentTheme.background);
			menu.getPopupMenu().setForeground(currentTheme.foreground);
		} else if (component instanceof JMenuItem) {
			JMenuItem menuItem = (JMenuItem) component;
			menuItem.setBackground(currentTheme.background);
			menuItem.setForeground(currentTheme.foreground);

			for (MouseListener listener : menuItem.getMouseListeners()) {
				if (listener instanceof MouseAdapter) {
					menuItem.removeMouseListener(listener);
				}
			}

			menuItem.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					menuItem.setBackground(currentTheme.selectionBackground);
					menuItem.setForeground(currentTheme.selectionForeground);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					menuItem.setBackground(currentTheme.background);
					menuItem.setForeground(currentTheme.foreground);
				}
			});
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

			// Special handling for JMenu popup menus
			if (component instanceof JMenu) {
				JMenu menu = (JMenu) component;
				JPopupMenu popup = menu.getPopupMenu();
				popup.setBackground(currentTheme.background);
				popup.setForeground(currentTheme.foreground);
				updateComponentRecursively(popup);
			}
		}
	}

	private class CustomTabbedPaneUI extends BasicTabbedPaneUI {
		@Override
		protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
			// Don't paint content border
		}

		@Override
		protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
			// Don't paint tab border
		}

		@Override
		protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect, boolean isSelected) {
			// Don't paint focus indicator
		}

		@Override
		protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
			Graphics2D g2d = (Graphics2D) g;
			if (isSelected) {
				g2d.setColor(currentTheme.buttonBackground);
			} else {
				g2d.setColor(currentTheme.tabBackground);
			}
			g2d.fillRect(x, y, w, h);
		}

		@Override
		protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {
			// Remove tab area border
			int tabCount = tabPane.getTabCount();
			Rectangle iconRect = new Rectangle(),
					textRect = new Rectangle();
			Rectangle clipRect = g.getClipBounds();

			for (int i = runCount - 1; i >= 0; i--) {
				for (int j = rects.length - 1; j >= 0; j--) {
					if (j < tabPane.getTabCount()) {
						if (rects[j].intersects(clipRect)) {
							paintTab(g, tabPlacement, rects, j, iconRect, textRect);
						}
					}
				}
			}
		}

		@Override
		protected void paintContentBorderTopEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
			// Don't paint top border
		}

		@Override
		protected void paintContentBorderLeftEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
			// Don't paint left border
		}

		@Override
		protected void paintContentBorderBottomEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
			// Don't paint bottom border
		}

		@Override
		protected void paintContentBorderRightEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
			// Don't paint right border
		}

		@Override
		protected int getTabLabelShiftX(int tabPlacement, int tabIndex, boolean isSelected) {
			return 0; // Remove tab text shift
		}

		@Override
		protected int getTabLabelShiftY(int tabPlacement, int tabIndex, boolean isSelected) {
			return 0; // Remove tab text shift
		}
	}


	private class CustomSplitPaneUI extends BasicSplitPaneUI {
		@Override
		public BasicSplitPaneDivider createDefaultDivider() {
			return new BasicSplitPaneDivider(this) {
				@Override
				public void paint(Graphics g) {
					g.setColor(currentTheme.borderColor);
					g.fillRect(0, 0, getSize().width, getSize().height);
				}
			};
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
		editorSplitPane.setUI(new CustomSplitPaneUI());
		editorSplitPane.setDividerLocation(220);
		editorSplitPane.setResizeWeight(0.2);
		editorSplitPane.setDividerSize(3);
		editorSplitPane.setBorder(null);
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

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent evt) {
				button.setBackground(currentTheme.buttonHoverBackground);
			}
			@Override
			public void mouseExited(MouseEvent evt) {
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

	private void generateGraphVisualization(String dotInput) {
		try {
			Path outputPath = outputDirectory.resolve("Parse.png");
			dotRunner.generateGraph(dotInput, outputPath, "png");
			statusLabel.setText("Graph generated successfully: " + outputPath);
			outputConsole.setText("Graph visualization saved to: " + outputPath);
		} catch (IOException | InterruptedException e) {
			statusLabel.setText("Error generating graph");
			outputConsole.setText("Error: " + e.getMessage());
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
			String bgColor;
			switch (currentThemeType) {
				case DARK: bgColor = "bgcolor=\"0.2 0.2 0.2\""; break;
				case DRACULA: bgColor = "bgcolor=\"0.16 0.16 0.21\""; break;
				case MONOKAI: bgColor = "bgcolor=\"0.15 0.16 0.13\""; break;
				case SOLARIZED_DARK: bgColor = "bgcolor=\"0.0 0.17 0.21\""; break;
				case SOLARIZED_LIGHT: bgColor = "bgcolor=\"0.99 0.96 0.89\""; break;
				default: bgColor = "bgcolor=\"0.94 0.94 0.94\""; break;
			}

			String fontColor;
			switch (currentThemeType) {
				case LIGHT:
				case SOLARIZED_LIGHT:
					fontColor = "fontcolor=\"black\"";
					break;
				default:
					fontColor = "fontcolor=\"white\"";
					break;
			}

			String formattedDot = st.toString()
					.replaceFirst("bgcolor=\"lightgrey\"", bgColor)
					.replaceFirst("fontcolor=\"blue\"", fontColor);


			try (PrintWriter out = new PrintWriter("Dot.dot")) {
				out.print(formattedDot);
			}
			generateGraphVisualization(formattedDot);

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