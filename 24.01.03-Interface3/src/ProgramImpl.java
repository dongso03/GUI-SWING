
public class ProgramImpl implements Program {
	private InputOutput io;
	private CircleCalculator cal;
	
	public ProgramImpl() {
		io = new ConsoleInputOutputImpl();
		cal = new CircleCalculatorImpl();
	}
	
	@Override
	public void run() {
		int radius = io.inputRadius();
		double area = cal.calculateArea(radius);
		io.printArea(area);
	}
}
