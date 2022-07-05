package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //  HashSet h=new HashSet();
		LinkedHashSet h=new LinkedHashSet();
		h.add("a");
		h.add("c");
		h.add("f");
		h.add(10);
		h.add(null);
		System.out.println(h.add("a"));
		System.out.println(h);
		
		

	}

}
