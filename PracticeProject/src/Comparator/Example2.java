package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

//Write a program to insert string object into the treeset where all elements should be inserted according to reverse of alphabetical order
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-ge'nerated method stub
		TreeSet<String> t1=new TreeSet(new MyComparator1());
		t1.add("Prachi");
		t1.add("Sachin");
		t1.add("Swati");
		t1.add("Tushar");
		t1.add("Kavya");
		System.out.println(t1);
		
		

	}

}
class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
	
}

