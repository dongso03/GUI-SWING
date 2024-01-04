import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class TempActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("다른 동작을 구현한 리스너입니다.");

	}

}

public class MyButtonsFrame extends JFrame implements ActionListener {
	private JButton btnFist;

	public MyButtonsFrame() {
		JPanel pnl = new JPanel();
		btnFist = new JButton("첫번째");
		JButton btnSecond = new JButton("두번째");
		btnFist.addActionListener(this);
		btnSecond.addActionListener(this);

		pnl.add(btnFist);
		pnl.add(btnSecond);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("첫번째")) {
			System.out.println("첫번째버튼");
		} else if (command.equals("두번째")) {
			System.out.println("두번째 버튼");
		}
	}

	public static void main(String[] args) {
		new MyButtonsFrame();
	}

}
