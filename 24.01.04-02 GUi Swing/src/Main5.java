import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main5 extends JFrame implements ActionListener {
	JLabel lbl;
	public Main5() {
		
		// container 역할 
		JPanel pnl = new JPanel();
		// Text 를 표현 하는 요소
		lbl = new JLabel("텍스트");
		JButton button = new JButton("버튼입니다");
		JButton button2 = new JButton("버튼");
		
		button.addActionListener(this);
		button2.addActionListener(this);
		pnl.add(button);
		pnl.add(lbl);
		pnl.add(button2);
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	lbl.setText("글자를 바꿈");
		//	System.out.println("버튼을 누르면 텍스트가 나옵니다.");
	}
	public static void main(String[] args) {
		new Main5();
	}
	

}
