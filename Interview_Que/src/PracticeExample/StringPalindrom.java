package PracticeExample;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		String rev="";
		System.out.println("Enter your String:");
		
		Scanner sc= new Scanner(System.in);
		 String line =sc.nextLine();
		
		
		
		for(int i=line.length()-1;i>=0;i--) {
			rev=rev+line.charAt(i);
			
		}
		System.out.println(rev);
		
		if(line.equals(rev)) {
			System.out.println("String is palindrom   :"+line);
		}
		else {
			System.out.println("String is not palindrom  :"+line);
		}
		
	}

}
