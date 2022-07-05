package com.java8features;

interface Printable{
	void print(String msg);
}
public class LambdaExpression {

	public static void main(String[] args) {
		// without lambda
		 Printable printable=new Printable() {

			@Override
			public void print(String msg) {
				// TODO Auto-generated method stub
				System.out.println(msg);
			}
			
		};
		printable.print("Print message to console...");
		
		//with lambda
		Printable withlambda=(msg)-> System.out.println(msg);
		withlambda.print("print message...");

	}

}
