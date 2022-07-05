package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(70);
		l.add(40);
		l.add(25);
		l.add(65);
		System.out.println(l);
//		List<Integer>l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(l2);
//		
//		List<Integer>l2=l.stream().map(i->i+5).collect(Collectors.toList());
//		System.out.println(l2);

//		long noOfFailedStudents=l.stream().filter(m->m<35).count();
//		System.out.println(noOfFailedStudents);
	
//		List<Integer>l3=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
//		System.out.println(l3);
		
//		Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println(min);

		//		
//		Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println(max);
//		
	
//		Consumer<Integer>c1=i->{
//			System.out.println("The square of "+i+ " is:"+(i*i));
//		};
//		l.stream().forEach(c1);
		l.stream().forEach(i->{
			System.out.println("The square of "+i+ " is:"+(i*i));
		});
//		l.stream().forEach(System.out::println);
		
/*		toArray()-to convert stream of objects into array*/
		Integer[]i=l.stream().toArray(Integer[]::new);
		for(Integer i1:i) {
			System.out.println(i1);
		}
		
		
	
		
		
		
		

	}

}
