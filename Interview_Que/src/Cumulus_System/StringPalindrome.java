package Cumulus_System;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Sachin";
			String reverse="";
		
		for(int i=s.length()-1; i>=0; i--) {
			 reverse=reverse+s.charAt(i);
			 
		}
		System.out.println("Reverse of String is:"+reverse);
		System.out.println("length of String is:"+reverse.length());
		if(reverse.equals(s)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
