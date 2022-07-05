package MapInterface;

import java.util.Hashtable;
class Temp1{
	int i;
	Temp1(int i){
		this.i=i;
	}
	public int hashCode()
{
	return i;
		//return i% 9;
		}
	public String toString() {
		return i+" ";
		
	}
}
public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashtable h=new Hashtable();
		Hashtable h=new Hashtable(25);
		
		h.put(new Temp1(5), "a");
		h.put(new Temp1(2), "b");
		h.put(new Temp1(6), "c");
		h.put(new Temp1(15), "d");
		h.put(new Temp1(23), "E");
		h.put(new Temp1(16),"F");
		System.out.println(h);		

	}

	
}
