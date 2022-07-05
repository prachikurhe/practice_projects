package MapInterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap t3=new TreeMap(new MyComparator());
		t3.put("aaa", 10);
		t3.put("sss", 20);
		t3.put("eee", 30);
		t3.put("ppp", 40);
		t3.put("rrr", "uuu");
		System.out.println(t3);

	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}
