import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutFrame extends JFrame{
	public BoxLayoutFrame() {
		// x축이나y축으로 요소들을 나열
		JPanel pnl = new JPanel();
		// 생성시에 컨테이너의 참조가 필요하다
		BoxLayout layout = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(layout);
		pnl.add(Box.createGlue());
		
		for (int i = 0; i < 5; i++) {
			pnl.add(new JButton("버튼"));
			JButton btn = new JButton("버튼");
			btn.setAlignmentX(0.5F);
			pnl.add(btn);
			pnl.add(Box.createGlue());
					
		}
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		
	}
	public static void main(String[] args) {
		new BoxLayoutFrame();
	}
}
