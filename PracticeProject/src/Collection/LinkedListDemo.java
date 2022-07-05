package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Prachi");
		l.add(10);
		l.add(null);
		l.set(0,"Sachin");
		l.add(0, "Kavya");
		l.removeLast();
		l.addFirst("Aniket");
		System.out.println(l);
		
		
		
		
		


	}

}
