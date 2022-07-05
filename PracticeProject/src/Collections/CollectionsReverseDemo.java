package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1=new ArrayList();
		l1.add("a");
		l1.add("A");
		l1.add("K");
		l1.add("S");
		l1.add("P");
		System.out.println("Befor Sorting:"+l1);
		Collections.sort(l1);
		System.out.println("After Sorting:"+l1);
		//Collections.reverse(l1);
		System.out.println(l1);
		//Collections.reverseOrder();
		System.out.println(l1);
		Collections.reverseOrder(new MyComparator3());
		System.out.println(l1);

	}

}
class MyComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String S5=o1.toString();
		String S6=o2.toString();
		return S6.compareTo(S5);
	}
	
}
