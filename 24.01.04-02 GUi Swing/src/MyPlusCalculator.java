import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPlusCalculator extends JFrame implements ActionListener {
	 private JTextField tfLeft;
	private JTextField tfRight;
	JLabel lblResult;
	public MyPlusCalculator() {
		JPanel pnl = new JPanel();
		tfLeft = new JTextField(6);
		JLabel lblPlus = new JLabel("+");
		tfRight = new JTextField(6);
		JButton btCal = new JButton("계산");
		lblResult = new JLabel("결과");
		
		btCal.addActionListener(this);
		
		pnl.add(tfLeft);
		pnl.add(lblPlus);
		pnl.add(tfRight);
		pnl.add(btCal);
		pnl.add(lblResult);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String input = tfLeft.getText();
		String input2 = tfRight.getText();
		
		int num1 = Integer.valueOf(input);
		int num2 = Integer.valueOf(input2);
		
		lblResult.setText(String.valueOf(num1 +num2));
		
	}
	public static void main(String[] args) {
		new MyPlusCalculator();
	}

}

