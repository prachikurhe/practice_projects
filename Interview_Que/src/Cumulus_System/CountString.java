package Cumulus_System;
/*
 * 
Given a string and a character, task is to make a function which count occurrence of the given 
character in the string.
 Examples:  

Input : str = "geeksforgeeks"
         c = 'e'
Output : 4
'e' appears four times in str.

Input : str = "abccdefgaa"
          c = 'a' 
Output : 3
'a' appears three times in str.
 *
 */

public class CountString {
	
	

	public static int count(String s, char c)
    {
        int res = 0;
 
        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
            res++;
        }
        return res;
    }
        
        
	
  public static void main(String[] args) {
	  String str="geeksforgeeks";
		char c='e';
	  System.out.println(count(str, c));

	}

}
