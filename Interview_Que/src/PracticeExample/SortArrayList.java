package PracticeExample;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(32);
		al.add(21);
		al.add(90);
		System.out.println("Elements before sorting:");
		for(int count:al) {
			System.out.print(count+",");
		}
		System.out.println();
		Collections.sort(al);
		//Collections.swap(al, 0, 3);
		Collections.reverse(al);
		System.out.println("Elements after sorting:");

		for(int count:al) {
			System.out.print(count+",");
		}
		

	}

}
