package CollectiosArray;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s= {"A","B","R","C"};
		
		List l=Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1, "S");
		for(String s1:s) {
			System.out.println(s1);
		}
		l.add("prachi");
		l.add(2);
		l.set(1,new Integer(20));
		
		

	}

}
