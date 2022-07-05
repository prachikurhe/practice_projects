package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m=new HashMap();
		m.put("nikki", 101);
		m.put("mani", 102);
		m.put("pooja", 103);
		m.put("varsha", 104);
		m.put("tanu", 104);
		System.out.println(m);
		System.out.println(m.put("nikki", 106));
		
		Set s=m.keySet();
		System.out.println(s);
		
		Collection c=m.values();
		System.out.println(c);
		
		Set s1=m.entrySet();
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+"  "+m1.getValue());
			if(m1.getKey().equals("nikki")) {
				m1.setValue(101);
			}
		}
		System.out.println(m);
		
		
		

	}

}
