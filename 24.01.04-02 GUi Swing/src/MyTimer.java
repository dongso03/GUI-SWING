import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

// 시작 버튼을 누르면
// 카운트 다운을 시작하는 프로그램
public class MyTimer extends JFrame implements ActionListener {
	private int number;
	private JLabel lbl;
	private Timer timer;
	private JButton btnCount;
	
	public MyTimer() {
		number = 10;
		JPanel pnl = new JPanel();
		lbl = new JLabel(String.valueOf(number));
		btnCount = new JButton("카운트");
		btnCount.addActionListener(this);
		
		timer = new Timer(1000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				number--;
				lbl.setText(String.valueOf(number));
				if(number==0) {
					timer.stop();
					btnCount.setEnabled(true);
				}
				
			}
		});
		
		pnl.add(lbl);
		pnl.add(btnCount);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		number = 10;
		lbl.setText(String.valueOf(number));
			timer.start();
		btnCount.setEnabled(false);
	}
	public static void main(String[] args) {
		new MyTimer();
	}
}
