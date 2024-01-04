import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class  MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("사용자가 클릭 했습니다.");
	}
	
}

public class Main3 extends JFrame {
	public Main3() {
		setTitle("제목");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton button = new JButton("버튼");
		button.addActionListener(new MyActionListener());
		add(button);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main3();
	}
}
