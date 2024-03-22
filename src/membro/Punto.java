package membro;

public class Punto {
	public int x, y;
	public final Punto root;
	public static final Punto ORIGIN;
	public static Punto staticPunto;
	public static int valore;
	static {
		ORIGIN = new Punto(0, 0);
	}

	

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
		root = null;
	}

	public Punto(int x, int y, Punto root) {
		this.x = x;
		this.y = y;
		this.root = root;
//		this.ORIGIN = new Punto(8, 10);
		Punto.staticPunto = new Punto(19, 20);
		Punto.valore = 1;

	}

	public static void main(String[] args) {
		Punto p1 = new Punto(100, 100);
		Punto p2 = new Punto(200, 200, p1);

//		p1.root = new Punto(300, 300); // ERRORE IN COMPILAZIONE
		p2.root.x = 300; // OK
		System.out.println("ORIGIN.x:" + Punto.ORIGIN.x);
		p2.root.x = 5;
		Punto.valore = 4;
		System.out.println(Punto.valore);
//		Punto.ORIGIN = new Punto(1000, 1000); // ERRORE IN COMPILAZIONE
		Punto.ORIGIN.x = 400; // OK
	}

}
