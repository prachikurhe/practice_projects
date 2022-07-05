package com.java8features;

interface Interf1{
	//public void add(int a,int b);
	public int squareIt(int n);
}
public class Example2 {

	public static void main(String[] args) {
		
//		Interf1 i1=(a,b)->System.out.println("The sum of:"+(a+b));
//		i1.add(12, 12);
		Interf1 i2=n->n*n;
		System.out.println(i2.squareIt(3));
		
		
		

	}

}
