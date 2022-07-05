package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add("a");
		l.add("A");
		l.add("K");
		l.add("S");
		l.add("P");
		System.out.println("Befor Sorting"+l);
		//Collections.sort(l);
		
		Collections.sort(l,new MyComparator());
		System.out.println("After Sorting"+l);

	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=(String)o1;
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
	
}
