import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PriceFrame extends JFrame {
	public PriceFrame() {
		JPanel pnl = new JPanel();
		JCheckBox chkDefault = new JCheckBox("수저 미포함");
		chkDefault.setSelected(true);
		
		JCheckBox chkCheese = new JCheckBox("치즈 추가 (2000원)");
		JCheckBox chkRamen = new JCheckBox("라면 사리 추가 (1000원)");
		
		pnl.add(chkDefault);
		pnl.add(chkCheese);
		pnl.add(chkRamen);
		
		JButton btnCal = new JButton("계산");
		JLabel lbl = new JLabel("");
		
		btnCal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int price = 0;
				price += chkCheese.isSelected() ? 2000 : 0;
				price += chkRamen.isSelected() ? 1000 : 0;
				
				lbl.setText("옵션 가격: " + price);
			}
		});
		
		pnl.add(btnCal);
		pnl.add(lbl);
		
		add(pnl);
		
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PriceFrame();
	}
}
