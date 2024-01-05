import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		JButton btnCent = new JButton("중앙");
		JButton btnleft = new JButton("왼쪽");
		
		setLayout(new FlowLayout());

		btnCent.setPreferredSize(new Dimension(100,100));
		
//		btnCent.setSize(new Dimension(100,100));
//		btnCent.setLocation(new Point(250,250));
		
//		btnleft.setBounds(0,150,100,100);
		
		add(btnleft);
		add(btnCent);
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
