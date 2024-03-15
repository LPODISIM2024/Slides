package slides;

public class Slide3_11 {
	private static String LINGUAGGIO_JAVA = "Java";

	public static void main(String[] args) {
		String a = "Java";
		String b = "Java";
		String c = new String("Java");
		String d = c;
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(a == LINGUAGGIO_JAVA);
		System.out.println(c == LINGUAGGIO_JAVA);
		System.out.println(Test.LINGUAGGIO_JAVA == LINGUAGGIO_JAVA);
		System.out.println(a == Test.LINGUAGGIO_JAVA);
		System.out.println(c == d);
		System.out.println(c == d);
		Punto[] ps = new Punto[2];
		ps[0] = new Punto(2, 3);
		ps[1] = new Punto(3, 4);
		for (Punto p : ps) {
			ps[0] = new Punto(1,3);
		}

	}

}

class Test {
	public static String LINGUAGGIO_JAVA = "Java";
}
