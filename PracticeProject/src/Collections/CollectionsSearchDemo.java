package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo {

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
		//System.out.println(Collections.binarySearch(l1, "a"));//If Order Is Default Natural Sorting Order
		//System.out.println(Collections.binarySearch(l1, "R"));
		
		System.out.println(Collections.binarySearch(l1, "S", new MyComparator1()));
		System.out.println(Collections.binarySearch(l1, "B", new MyComparator1()));
		System.out.println(Collections.binarySearch(l1, "L"));//unpredictable

	}

}
class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s3=(String)o1;
		String s4=(String)o2;
		
		return s3.compareTo(s4);
	}
	
}
