package slides;

public class Slide92 {
	public static void main(String args[]) {
		Punto punto1;
		punto1 = new Punto();
		punto1.x = 2;
		punto1.y = 6;
		if (args[0].equals("punto")) {
			Punto punto2 = new Punto();
			punto2.x = 0;
			punto2.y = 1;
		}
		System.out.println(punto1.x); // Cosa succede qui?
		System.out.println(punto1.y); // e qui?
//		System.out.println(punto2.x); // Cosa succede qui?
//		System.out.println(punto2.y); // e qui?
	}

}
