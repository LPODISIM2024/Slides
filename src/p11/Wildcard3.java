package p11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Wildcard3 {

	public void printList(List<Object> al) {
		Iterator<Object> i = al.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
	}

	public void test() {
		List<String> list = new ArrayList<>();
		printList(list); // errore in compilazione poiché String!=Object

	}
}
