package PracticeExample;

import java.util.Comparator;
import java.util.TreeSet;

public class SortTreeSet {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(new MyComparator());
		set.add("S");
		set.add("C");
		set.add("A");
		set.add("P");
		System.out.println(set);

	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();

		return s2.compareTo(s1);
	}

}

