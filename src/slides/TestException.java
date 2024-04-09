package slides;

public class TestException {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
//		try {
			int c = Math.floorDiv(5, 0);
			System.out.println(c);
//		} catch (ArithmeticException exc) {
//			System.out.println("Divisione per zero...");
//		}
	}

	public static int divisione(int a, int b) {
		return a / b;
	}

}
