import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main4 extends JFrame  implements ActionListener{
	public Main4() {
		setTitle("가영이 생일");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton button = new JButton("버튼");
		button.addActionListener(this);
	
		add(button);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("장소를 정해라");
	}
	
	public static void main(String[] args) {
		new Main4();
	}
	
}


