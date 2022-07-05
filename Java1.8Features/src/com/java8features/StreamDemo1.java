package com.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>s=new ArrayList<String>();
		s.add("Manisha");
		s.add("Soni");
		s.add("Ankita");
		s.add("Leena");
		s.add("Prachi");
		s.add("Nikita");
		System.out.println(s);
		Comparator<String>c=(s1,s2)->{
			Integer i1=s1.length();
			Integer i2=s2.length();
			if(i1<i2) return -1; 	
			else if(i1>i2) return 1; 
			else return s1.compareTo(s2);
			};
		List<String>l1=s.stream().sorted(c).collect(Collectors.toList());
		System.out.println(l1);
		

	}

}
