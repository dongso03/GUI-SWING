import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 색 변경 버튼 (임의의 색으로 변경된다)
public class MyColoFrame extends JFrame implements ActionListener {
	private JButton jb;
	Random r = new Random();
	private JPanel pnl;
	int rd;

	public MyColoFrame() {
		pnl = new JPanel();
		jb = new JButton("버튼");
		pnl.setBackground(new Color(255, 240, 245));
		jb.addActionListener(this);
		
		add(pnl);
		pnl.add(jb);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rd = r.nextInt(256);
		int gr = r.nextInt(256);
		pnl.setBackground(new Color(rd, gr, rd));
	}

	public static void main(String[] args) {
		new MyColoFrame();
	}

}
