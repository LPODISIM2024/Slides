package th1s;

public class Test {
	public static void main(String[] args) {
		Punto p = new Punto(100, 100);
		Punto p1 = p.clonePoint();
		p.muovi(200, 200);
	  	System.out.println("p.x: " + p.x);
		System.out.println("p.y: " + p.y);
	 	System.out.println("p1.x: " + p1.x);
		System.out.println("p1.y: " + p1.y);

	}
}
