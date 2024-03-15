package slides;

import java.util.ArrayList;
import java.util.List;

public class Slide3_40 {

	public static <E> void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				break;
			else
				System.out.println("i: " + i);
		}
		System.out.println("Out of Loop");

		System.out.println("================");

		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			else
				System.out.println("i: " + i);
		}
		System.out.println("Out of Loop");
		System.out.println("================");
		
		
		List<Punto> ints = new ArrayList<Punto>();
		ints.add(new Punto(3,5));
		ints.add(new Punto(3,5));
		ints.add(new Punto(3,5));
		ints.remove(ints.get(0));
		System.out.println(ints.size());
		
	}
}
