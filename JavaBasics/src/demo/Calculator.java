package demo;

public class Calculator {
	
	
	public int add(int a, int b) {
		//System.out.println(a + b);
		return(a+b);
		

	}

	public void subtract(int a, int b) {
		System.out.println(a - b);

	}

	public void Multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(double a, double b) {
		System.out.println(a/b);

	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//cal.add(10, 20);
		//cal.subtract(10, 20);
		//cal.Multiply(1689111, 987);
		//cal.divide(20,9);

		System.out.println(cal.add(10, 20));
	}
}
