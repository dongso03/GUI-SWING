import javax.swing.JOptionPane;

public class MyProgram {
	public void showResult(String result, MyOutput myoutput) {
		myoutput.showResult(result);
	}

	public static void main(String[] args) {
		MyProgram pro = new MyProgram();

		pro.showResult("문자열과", new MyOutput() { // call back
			@Override
			public void showResult(String result) {
				System.out.println("콘솔출력으로 결과를 보여준다");
				System.out.println(result);
			}
		});
		pro.showResult("그때그때달라요", new MyOutput() {

			@Override
			public void showResult(String result) {
				JOptionPane.showMessageDialog(null, result);

			}
		});
		pro.showResult("별표가 포함된결과", new MyOutput() {
			
			@Override
			public void showResult(String result) {
				System.out.println("********"+result+"*****");
			}
		});
	}
}
