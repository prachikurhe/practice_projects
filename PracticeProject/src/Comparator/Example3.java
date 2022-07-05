package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t2=new TreeSet(new MyComparator2());
		t2.add(new StringBuffer("A"));
		t2.add(new StringBuffer("L"));
		t2.add(new StringBuffer("K"));
		t2.add(new StringBuffer("Z"));
		System.out.println(t2);

	}

}
class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		

		return s1.compareTo(s2);
	}
	
}