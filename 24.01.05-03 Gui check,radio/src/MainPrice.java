import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.security.acl.Group;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainPrice extends JFrame {
	public MainPrice() {
		JRadioButton rdoSuji = new JRadioButton("스지전골	");
		JRadioButton rdoDaechang = new JRadioButton("대창전골");
		JRadioButton rdoMushroom = new JRadioButton("버섯 전골");
		
		JLabel lbl = new JLabel("");
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(rdoSuji);
		grp.add(rdoDaechang);
		grp.add(rdoMushroom);
		
		rdoSuji.setSelected(true);
		
		ItemListener lis = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int price = 0;
				price += rdoSuji.isSelected() ? 30000 : 0;
				price += rdoDaechang.isSelected() ? 32000 : 0;
				price += rdoMushroom.isSelected() ? 27000 : 0;

				lbl.setText("주메뉴 가격:"+ price);
			}
		};
		rdoSuji.addItemListener(lis);
		rdoDaechang.addItemListener(lis);
		rdoMushroom.addItemListener(lis);
		
		

		JPanel pnl = new JPanel();
		pnl.add(rdoSuji);
		pnl.add(rdoDaechang);
		pnl.add(rdoMushroom);
		
		
		pnl.add(lbl);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {

		new MainPrice();
	}
}
