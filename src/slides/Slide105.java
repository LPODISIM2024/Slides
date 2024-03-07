package slides;

public class Slide105 {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		swap( x, y );
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
}
