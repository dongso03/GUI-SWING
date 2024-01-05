import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClassLoaderFrame extends JFrame {
	public ClassLoaderFrame() {
		// Uniform Resource Locator
		URL url = ClassLoaderFrame.class.getClassLoader().getResource("춘식17.png");
		JLabel lbl = new JLabel(new ImageIcon(url));
		
		URL image = ClassLoaderFrame.class.getClassLoader().getResource("images/춘식3.png");
		JLabel lbl2 = new JLabel(new ImageIcon(image));
		
		
		JPanel pnl = new JPanel();
		pnl.add(lbl);
		pnl.add(lbl2);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ClassLoaderFrame();
	}
}
