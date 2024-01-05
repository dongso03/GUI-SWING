import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBoxFrame extends JFrame implements ActionListener {
	private JCheckBox chk1;
	private JCheckBox chk2;
	private JCheckBox chk3;
	public CheckBoxFrame() {
		chk1 = new JCheckBox("첫번째 선택지");
		chk2 = new JCheckBox("두번째 선택지");
		chk3 = new JCheckBox("세번째 선택지");
		
		chk1.addActionListener(this);
		chk2.addActionListener(this);
		chk3.addActionListener(this);
		
		JPanel pnl = new JPanel();
		pnl.add(chk1);
		pnl.add(chk2);
		pnl.add(chk3);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("액션이벤트 확인");
		System.out.println(chk1.isSelected());
		System.out.println(chk2.isSelected());
		System.out.println(chk3.isSelected());
	}
	public static void main(String[] args) {
		new CheckBoxFrame();
	}
	
}
