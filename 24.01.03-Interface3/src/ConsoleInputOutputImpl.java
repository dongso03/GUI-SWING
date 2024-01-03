import java.util.Scanner;

public class ConsoleInputOutputImpl implements InputOutput {
	private Scanner scanner;
	
	public ConsoleInputOutputImpl() {
		scanner = new Scanner(System.in);
	}
	
	@Override
	public int inputRadius() {
		System.out.println("반지름을 입력하세요");
		return scanner.nextInt();
	}

	@Override
	public void printArea(double area) {
		System.out.println("원의 넓이는 " + area);
	}

}
