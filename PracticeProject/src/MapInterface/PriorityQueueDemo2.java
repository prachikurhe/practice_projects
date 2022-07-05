package MapInterface;

import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q1=new PriorityQueue(15,new MyComparator2());
		q1.offer("A");
		q1.offer("S");
		q1.offer("Z");
		q1.offer("L");
		q1.offer("B");
		
		System.out.println(q1);

	}

}
class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String r1=(String)o1;
		String r2=o2.toString();
		return r2.compareTo(r1);
	}
	
}

