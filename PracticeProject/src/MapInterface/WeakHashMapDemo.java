package MapInterface;

import java.util.HashMap;
import java.util.WeakHashMap;
class Temp {
	public String toString() {
		return "temp";
		
	}
	public void finalize() {
		System.out.println("finalize method called");
	}
}
public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//HashMap m2=new HashMap();
		WeakHashMap m2=new WeakHashMap();
		Temp t=new Temp();
		m2.put(t,"aaa");
		System.out.println(m2);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m2);
		
		
	}

}
