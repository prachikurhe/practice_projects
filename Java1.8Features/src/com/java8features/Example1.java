package com.java8features;
interface Interf{
	public void m1();
}
public class Example1 {
//	public void m1() {
//		System.out.println("Hello");
//	}
	public static void main(String[] args) {

		Interf i=()-> System.out.println("Hello");
		i.m1();
	}

}
