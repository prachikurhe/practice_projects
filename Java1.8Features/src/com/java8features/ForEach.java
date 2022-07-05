package com.java8features;

import java.util.stream.Stream;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer>s= Stream.of(9,99,999,9999);
		s.forEach(System.out::println);
		
		Integer[]i= {10,20,30,40};
		Stream.of(i).forEach(System.out::println);

	}

}
