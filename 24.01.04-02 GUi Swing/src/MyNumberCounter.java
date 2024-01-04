import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyNumberCounter extends JFrame implements ActionListener{
	JLabel lblNumber;
	private int number;
	
	public MyNumberCounter() {
		JPanel pnl = new JPanel();
		lblNumber = new JLabel(String.valueOf(number));
		JButton btnIncrease = new JButton("증가");
		JButton btnDecrease = new JButton("감소");
		JButton btn = new JButton("초기화");
		btnIncrease.addActionListener(this);
		btnDecrease.addActionListener(this);
		btn.addActionListener(this);
		
		pnl.add(lblNumber);
		pnl.add(btnIncrease);
		pnl.add(btnDecrease);
		pnl.add(btn);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("증가")) {
		number++;
		lblNumber.setText(String.valueOf(number));
		}else if (command.equals("감소")) {
			number--;
			lblNumber.setText(String.valueOf(number) );
		} else if (command.equals("초기화")) {
			number = 0;
			lblNumber.setText(String.valueOf(number));
		}
	}	
	
	public static void main(String[] args) {
		new MyNumberCounter();
	}



}
