package slides;

public class Slide107 {
	public static void main(String[] args) {
		Punto p1 = new Punto(100, 200);
		Punto p2 = new Punto(300, 400);
		System.out.println("p1=" + p1 + " x = " + p1.x);
		System.out.println("p2=" + p2 + " x = " + p2.x);
		swap(p1, p2);
		System.out.println("DOPO LO SWAP");
		
		System.out.println("p1=" + p1 + " x = " + p1.x);
		System.out.println("p2=" + p2 + " x = " + p2.x);
	}

	public static void swap(Punto p1, Punto p2) {
		int tempx = p1.x;
		int tempy = p1.y;
		p1.x = p2.x;
		p1.y = p2.y;
		p2.x = tempx;
		p2.y = tempy;
	}

}
