import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PriceFrame2 extends JFrame implements ActionListener {
	private int price;

	public PriceFrame2() {
		JPanel pnl = new JPanel();
		JCheckBox chkDefault = new JCheckBox("수저 미포함");
		chkDefault.setSelected(true);

		JCheckBox chkCheese = new JCheckBox("치즈 추가(2000원)");
		JCheckBox chkRamen = new JCheckBox("라면 사리 추가(1000원)");

		
		chkCheese.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (chkCheese.isSelected()) {
					price += 2000;
				} else {
					price -= 2000;
				}
				System.out.println(price);

			}
		});

		chkRamen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (chkRamen.isSelected()) {
					price += 1000;
				} else {
					price -= 1000;
				}
				System.out.println(price);
			}
		});
		pnl.add(chkDefault);
		pnl.add(chkCheese);
		pnl.add(chkRamen);

		JLabel lbl = new JLabel("");

		pnl.add(lbl);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		new PriceFrame2();
	}

}
