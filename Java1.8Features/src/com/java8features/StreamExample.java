package com.java8features;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//Creating stream object from collection
		Collection<String> collection=Arrays.asList("java","j2ee","spring","jpa");
		Stream<String>stream=collection.stream();
		stream.forEach(System.out::println);

		//Creating stream object from Arrays
		Stream<String>StreamOfarray=Stream.of("A","B","C");
		StreamOfarray.forEach(System.out::println);
		
		//Creating stream object from string using chars method
		IntStream StreamOfChars="abc".chars();
		StreamOfChars.forEach(System.out::println);


	}

}
