package com.java8features;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer>f=i->i*i;
		System.out.println(f.apply(2));
		

//	    Function<Integer,Double>f1=i->Math.sqrt(i);
//		System.out.println(f1.apply(25));

		IntToDoubleFunction f1=i->Math.sqrt(i);
		System.out.println(f1.applyAsDouble(25));


	}

}
