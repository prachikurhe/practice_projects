package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>s=new ArrayList<String>();
		s.add("M");
		s.add("S");
		s.add("A");
		s.add("L");
		System.out.println(s);
		Comparator<String>c=(S1,S2)->-S1.compareTo(S2);
		Collections.sort(s,c);
		System.out.println(s);

	}

}
