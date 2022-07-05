package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(15);
		l.add(5);
		System.out.println(l);
//		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Comparator<Integer> c=(I1,I2)->I1.compareTo(I2);
		Collections.sort(l,c);
		System.out.println(l);
		
		

	}

}
