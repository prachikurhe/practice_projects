package CollectiosArray;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,5,20,11,6};
		System.out.println("primitive array before sorting:");
		 for(int a1:a) {
			 System.out.println(a1);
		 }
		 Arrays.sort(a);
		 System.out.println("primitive array after sorting:");
		 for(int a1:a) {
			 System.out.println(a1);
		 }
		 
		 String []s= {"A","Z","C"};
		 System.out.println("Object array before sorting:");
		 for(String s1:s) {
			 System.out.println(s1);
		 }
		 Arrays.sort(s);
		 System.out.println("Object array after sorting:" );
		 for(String s1:s) {
			 System.out.println(s1);
		 }
		 Arrays.sort(s, new MyComparator());
		 System.out.println("Object array after sorting by comparator:");
		 for(String s1:s) {
			 System.out.println(s1);
		 }

	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}
