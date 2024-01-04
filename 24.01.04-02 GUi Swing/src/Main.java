import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		// 요소 (component)
		// window 역활 >> JFrame
		// container 역활
		JFrame frame = new JFrame();
		frame.setTitle("창의 제목입니다");
		frame.setSize(500,500); // >> 픽셀(pixel) 단위
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//요소(버튼)	>> 사용자가 마우스를 통해 (클릭) 상호작용
		JButton button = new JButton("버튼입니다.");
		frame.add(button);
		frame.setVisible(true);
	}
}
