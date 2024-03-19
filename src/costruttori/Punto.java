package costruttori;

public class Punto {
	int x = 100;
	int y = 100;
	int [] ar = new int[10];
	// Inizializzatore di istanza
	{
		System.out.println("x=" + x + ", y=" + y);
		System.out.println("Inizializzatore di Point");
		for(int i= 0; i< 10; i++) {
			System.out.println(i);
		}
		x = 200;
		y = 200;
	}

	Punto() {
		System.out.println("x=" + x + ", y=" + y);
		System.out.println("Costruttore di default di Point");
		x = 300;
		y = 300;
		
	}

	Punto(int dx, int dy) {
		
		System.out.println("x=" + x + ", y=" + y);
		System.out.println("Costruttore con due parametri di Point");
		x = dx;
		y = dy;
	}
}
