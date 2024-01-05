import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioFrame extends JFrame {
	public RadioFrame()	{
		JRadioButton rdo1 = new JRadioButton("선택1");
		JRadioButton rdo2 = new JRadioButton("선택2");
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(rdo1);
		grp.add(rdo2);
		
		rdo1.setSelected(true);
		
		rdo1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("1번버튼 상태 변경됨");
			}
		});
		
		rdo2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("2번버튼 상태 변경됨");
			}
		});
		
		JPanel pnl = new JPanel();
		pnl.add(rdo1);
		pnl.add(rdo2);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioFrame();
	}
}
