package slides;

public class Punto {
	public int x;
	public int y;

	public Punto() {
		System.out.println("PUNTO NO PARAM;");
	}

	public Punto(int dx, int dy) {
		System.out.println("PUNTO COLORATO PARAM;");
		x = dx;
		y = dy;
	}

	public static void main(String[] args) {

		PuntoColorato p1 = new PuntoColorato();
		PuntoColorato p2 = new PuntoColorato(4, 5);
	}
}
