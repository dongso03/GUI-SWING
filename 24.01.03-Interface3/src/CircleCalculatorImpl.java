
public class CircleCalculatorImpl implements CircleCalculator {
	private final double PI = 3.14;
	
	@Override
	public double calculateArea(int radius) {
		return radius * radius * PI;
	}
}
