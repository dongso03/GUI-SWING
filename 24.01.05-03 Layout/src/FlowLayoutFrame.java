import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {
	public FlowLayoutFrame() {
		// Flowlayout
		// => 요소 추가한 순서 나열
		// 정렬
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.CENTER);
		
		setLayout(layout);
		
		JButton btn1 = new JButton("1");
		// 각 요소의 선호 크기 설정
		JButton btn2 = new JButton("2");
		btn2.setPreferredSize(new Dimension(400,40));
		// 영역이 부족하면 다음줄에 배치
		JButton btn3 = new JButton("3");
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutFrame();
	}
}

