package PracticeExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(32);
		set.add(21);
		set.add(90);
		System.out.println("Elements before sorting:");
		for (int count : set) {
			System.out.print(count + ",");
		}
		System.out.println();
		List<Integer> list=new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println("HashSet elements in sorted order using list"+list);

	}

}
