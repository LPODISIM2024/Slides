package slides;

public class Slide4_48 {
	private static int a;

	public Slide4_48() {
		System.out.println("COSTRUTOTRE");
		a += 10;
		System.out.println("a= " + a);
	}

	static {
		System.out.println("Inizializzatore statico");
		System.out.println("valore statico = " + a);
		a = 10;
		System.out.println("valore statico = " + a);
	}

	public static void main(String[] args) {
		System.out.println("valore statico = " + Slide4_48.a);
		Slide4_48 e = new Slide4_48();
		System.out.println("ACCESSO tramite istanza valore statico = " + e.a);
		System.out.println("ACCESSO tramite classe valore statico = " + Slide4_48.a);
	}
}
