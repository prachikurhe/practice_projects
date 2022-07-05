package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

//Write a program to insert integer object into the treeset where the sorting order is descending order
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);

	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		
		if(I1<I2) 
			return +1;
		else if(I1>I2)
			return -1;
		else
			return 0;
	}
	
}
