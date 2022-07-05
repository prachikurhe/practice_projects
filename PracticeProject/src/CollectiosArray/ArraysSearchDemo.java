package CollectiosArray;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,5,20,11,6};
		Arrays.sort(a);
		
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		
		String[] s= {"A","X","B","E","R"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "A"));
		System.out.println(Arrays.binarySearch(s, "Z"));
		
		Arrays.sort(s, new MyComparator());
		System.out.println();
		System.out.println(Arrays.binarySearch(s, "A",new MyComparator1()));

	}
}
class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}