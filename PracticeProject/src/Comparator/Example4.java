package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t3=new TreeSet(new MyComparator3());
		t3.add("A");
		t3.add(new StringBuffer("ABC"));
		t3.add(new StringBuffer("AA"));
		t3.add(new StringBuffer("edfg"));
		t3.add("A");
		t3.add("fghy");
		System.out.println(t3);

	}

}
class MyComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s3=o1.toString();
		String s4=o2.toString();
		
		int l1=s3.length();
		int l2=s4.length();
		if(l1<l2) {
			return -1;
		}
		else if(l1>l2){
		    return +1;
		}
		    
		else {
			return s3.compareTo(s4);
		
	
		}	
	}
}
