package com.java8features;

import java.time.Year;
import java.util.Scanner;

public class DateTimeAPILeapY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year Number:");
		int n=sc.nextInt();
		Year y=Year.of(n);
		if(y.isLeap()) {
			System.out.printf("%d Year is leap year",n);
		}
		else
		{
			System.out.printf("%d Year is Not leap year",n);
		}
		

	}

}
