package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet();
		t.add("a");
		t.add("d");
		t.add("s");
		t.add("l");
		//t.add(null);
		System.out.println(t);
		
		/*Iterator itr=t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		for(String value :t) {
			System.out.print(value+" , ");
		}
			 System.out.println();
		
		
		

	}

}
