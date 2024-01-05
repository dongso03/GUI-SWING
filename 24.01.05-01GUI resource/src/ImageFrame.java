import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageFrame extends JFrame {
	public ImageFrame() {
		
		//자원 (resource)
		JLabel lbl = new JLabel(new ImageIcon("춘식1.png"));
		JButton btn = new JButton(new ImageIcon("춘식2.png"));
		JLabel lbl2 = new JLabel ( new  ImageIcon("춘식4.gif") );
		JPanel pnl = new JPanel();
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(lbl2);
		
		add(pnl);
		
		setSize(1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ImageFrame();
	}
}







