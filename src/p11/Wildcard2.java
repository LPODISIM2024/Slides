package p11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Wildcard2 {

	public void printList(List<?> al) {
		Iterator<?> i = al.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
		al.add("Stringa"); // Errore in compilazione
	}

	public void test() {
		List<String> list = new ArrayList<>();
		printList(list); //OK

	}
}
