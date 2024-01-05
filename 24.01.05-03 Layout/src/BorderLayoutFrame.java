import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutFrame extends JFrame {
	public BorderLayoutFrame() {
		// BorderLayout => JFrame의 기본 레이아웃
		// 영역을 동,서,남,북,중앙 영역으로 나누어 사용
//		BorderLayout layout = new BorderLayout();
//		
//		setLayout(layout);
		
		JButton btnNorth = new JButton("N");
		JButton btnWest = new JButton("W");
		JButton btnEast = new JButton("E");
		JButton btnSouth = new JButton("S");
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(100, 100, 100));
		
		// 한 요소가 한 영역을 모두 차지함.
		// 컨테이너에 추가 시, 영역을 문자열로 전달
		btnNorth.setPreferredSize(new Dimension(100,100));
		add(btnNorth, BorderLayout.NORTH);
		add(btnWest, "West");
		btnWest.setPreferredSize(new Dimension(100,100));
		add(btnEast, "East");
		add(btnSouth, "South");
		// 생략시 중앙
		add(pnlCenter);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutFrame();
	}
}






