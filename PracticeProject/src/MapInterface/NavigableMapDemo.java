package MapInterface;

import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <String,String>t=new TreeMap();
		t.put("a", "apple");
		t.put("b","bat");
		t.put("c","cat");
		t.put("d", "dog");
		t.put("g", "gun");
		System.out.println(t);
		System.out.println(t.floorKey("c"));
		System.out.println(t.lowerKey("e"));
		System.out.println(t.ceilingKey("c"));
		System.out.println(t.higherKey("c"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingKeySet());
		System.out.println(t.descendingMap());
		System.out.println(t);

	}

}
