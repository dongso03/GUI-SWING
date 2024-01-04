class Another {
}

public class Main {
	public static void main(String[] args) {
		class Point {
		}
		Point p = new Point();

		class MyClass {
			private int x;
			private int y;

			public MyClass(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}

			public int getX() {
				return x;
			}

			public void setX(int x) {
				this.x = x;
			}

			public int getY() {
				return y;
			}

			public void setY(int y) {
				this.y = y;
			}

			@Override
			public String toString() {
				return "MyClass [x=" + x + ", y=" + y + "]";
			}

		}
	MyClass m = new MyClass(100, 150);
	System.out.println(m.getX());
	m.setX(300);
	System.out.println(m.getX());
	
	}
}
