package Cumulus_System;
/*
 * four ways to reverse String
 * 1.Using toCharArray() method
 * 2.Using charAt(int index) method
 * 3.Using java.lang.StringBuffer class provided reverse()method
 * 4.Using java.lang.StringBuilder class provided reverse()method

 */
public class StringReverseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		//1
		char []ch=s.toCharArray();
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		//2
		for(int i=s.length()-1; i>=0;i--) {
        System.out.print(s.charAt(i));
		}
		
		System.out.println();
        //3
		StringBuffer sb=new StringBuffer(s);
		System.out.print(sb.reverse());
		
		System.out.println();
		//4
		StringBuilder sbu=new StringBuilder(s);
		System.out.print(sbu.reverse());
		
		//
	}

}
