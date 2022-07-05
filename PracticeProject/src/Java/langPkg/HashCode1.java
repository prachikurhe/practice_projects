package Java.langPkg;

import java.util.Scanner;

public class HashCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the desired input value:");
		Scanner sc=new Scanner(System.in);
		Integer i=sc.nextInt();
		int hashValue=i.hashCode();
		System.out.println("Hash code Value for object is: "+hashValue);
		
	}

}
