package Collection;
//it is specially designed class for first in first out order
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		//Vector v=new Vector();
		//Vector v=new Vector(24);
		Vector v=new Vector(10,15);
		System.out.println(v.capacity());
		
		for(int i=1; i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.add("A");
		System.out.println(v.capacity());
		System.out.println(v);
		
		


	}

}
