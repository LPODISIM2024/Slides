package th1s;

public class Punto {
	int x = 100;
	int y = 100;
	// Inizializzatore di istanza
	{
		System.out.println("Inizializzatore di Punto");
		System.out.println("x=" + x + ", y=" + y);
		x = 200;
		y = 200;
		System.out.println("x=" + x + ", y=" + y);
		System.out.println("=======================");
	}

	Punto() {
		System.out.println("Costruttore di default di Punto");
		x = 300;
		y = 300;
		System.out.println("x=" + x + ", y=" + y);
		System.out.println("=======================");
	}

	Punto(int dx, int dy) {
		this();
		System.out.println("Costruttore con due parametri di Punto");
		x = dx;
		y = dy;
		System.out.println("x=" + x + ", y=" + y);
		System.out.println("=======================");
	}

	public Punto(Punto p) {
		System.out.println("Costruttore che prende come parametro Punto");
		this.x = p.x;
		this.y = p.y;
		System.out.println("x=" + x + ", y=" + y);
		System.out.println("=======================");
	}

	public void muovi(int x, int y) {
		System.out.println("Metodo move di Punto");
		this.x = x;
		this.y = y;
	}

	public Punto clonePoint() {
		System.out.println("Metodo clonePoint di Punto");
		Punto p = new Punto(this);
		return p;
	}

}
