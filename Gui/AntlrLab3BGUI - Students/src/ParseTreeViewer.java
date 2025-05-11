import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 * A separate window for displaying parse tree images.
 */
public class ParseTreeViewer extends JFrame {

	private JLabel imageLabel;

	public ParseTreeViewer() {
		setTitle("Parse Tree Viewer");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		imageLabel = new JLabel();
		imageLabel.setHorizontalAlignment(JLabel.CENTER);

		JScrollPane scrollPane = new JScrollPane(imageLabel);
		add(scrollPane, BorderLayout.CENTER);
	}

	/**
	 * Loads and displays the parse tree image.
	 */
	public void showParseTree() {
		try {
			Image image = ImageIO.read(new File("Parse.png"));

			// Set the image to the label
			ImageIcon icon = new ImageIcon(image);
			imageLabel.setIcon(icon);

			// Make sure the label is sized correctly
			imageLabel.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));

			// Make the window visible if it isn't already
			if (!isVisible()) {
				setVisible(true);
			}

			// Bring window to front
			toFront();
			repaint();
		} catch (Exception e) {
			System.err.println("Error displaying parse tree: " + e.getMessage());
			e.printStackTrace();
		}
	}
}