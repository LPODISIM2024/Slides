package costruttori;

public class Test {
	public static void main(String[] args) {
		PuntoColorato cp = new PuntoColorato(400, 500, 0xFF0000); // Rosso
		System.out.println("x=" + cp.x + ", y=" + cp.y + ", color=" + cp.color);
	}
}
