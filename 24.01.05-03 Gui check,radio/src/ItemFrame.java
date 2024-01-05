import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ItemFrame extends JFrame {
	public ItemFrame () {
		JCheckBox chk1 = new JCheckBox("선택1");
		JCheckBox chk2 = new JCheckBox("선택2");
		JCheckBox chk3 = new JCheckBox("선택3");
		
		JPanel pnl = new JPanel()	;
		
		pnl.add(chk1);
		pnl.add(chk2);
		pnl.add(chk3);
		
		chk1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
				System.out.println("선택됨");
				}else if (e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("선택취소됨");
				}
			}
		});
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ItemFrame();
	}
}
