package th1s;

public class PuntoColorato extends Punto {
	int color = 0xFFFFFF; // Bianco
	// Inizializzatore di istanza
	{
		System.out.println("JURI");
		System.out.println("color=" + color);
		System.out.println("x=" + x + ", y=" + y);
		System.out.println("Inizializzatore ColoredPoint");
		color = 0xFF00FF; // Magenta
	}

	public PuntoColorato(int x, int y, int c) {
		super(x, y);
		System.out.println("color=" + color);
		System.out.println("Costruttore di ColoredPoint");
		color = c;
	}
}
