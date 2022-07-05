package MapInterface;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap m1=new HashMap();
		IdentityHashMap m1=new IdentityHashMap();
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		m1.put(I1, "pawan");
		m1.put(I2, "kalyan");
		
		System.out.println(m1);
				

	}

}
