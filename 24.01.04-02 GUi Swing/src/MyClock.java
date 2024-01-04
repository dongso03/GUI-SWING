import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyClock extends JFrame implements ActionListener {
	private JLabel lbl;
	public MyClock() {
		JPanel pnl = new JPanel();
		lbl= new JLabel();
		lbl.setText(LocalTime.now().toString());
		
		
		pnl.add(lbl);
		add(pnl);
		
		
		// 1000ms =>1초    
		Timer timer = new Timer(1000/144,this);
		timer.start();
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		lbl.setText(LocalTime.now().toString());
		
	}
	public static void main(String[] args) {
		new MyClock();
	}

}
