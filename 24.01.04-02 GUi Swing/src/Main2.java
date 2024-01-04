import javax.swing.JButton;
import javax.swing.JFrame;

// GUI 프로그램
//창 <<
class MyFirstFrame extends JFrame{
	public MyFirstFrame () {
		setTitle("제목");
		setSize(500,500); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("버튼");
		add(button);
		
		setVisible(true);
	}
}



public class Main2 {
	public static void main(String[] args) {
		new MyFirstFrame();
	}
}
