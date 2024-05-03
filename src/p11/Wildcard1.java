package p11;

import java.util.Iterator;
import java.util.List;

public class Wildcard1 {

	public void printList(List al) { 
        Iterator i = al.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            System.out.println(o);
        }
}

}
