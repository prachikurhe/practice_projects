package Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector(10,15);

		for(int i=1; i<=10;i++) {
			v.addElement(i);
		}
		
		System.out.println(v.capacity());
		System.out.println(v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Integer I=(Integer)e.nextElement();
			if(I%2==0) {
				System.out.println(I);
				
			}
			
		}
		System.out.println(v);
		
		

	}

}
