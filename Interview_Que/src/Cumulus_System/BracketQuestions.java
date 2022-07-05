package Cumulus_System;
/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
public class BracketQuestions {

	public static void main(String[] args) {
			BracketQuestions bs =new BracketQuestions();
			System.out.println(bs.isValid("{}}"));
			System.out.println(bs.isValid("()"));
			System.out.println(bs.isValid("[]"));
			System.out.println(bs.isValid("(}"));
			System.out.println(bs.isValid("()[]{}"));
		}

	public boolean isValid(String s) {
		boolean isSimpleBracketStart = false;
		boolean isCurlryBracketStart = false;
		boolean isSqureBracketStart = false;
		
		for (int i = 0; i < s.length(); i++) {

			String ch = s.charAt(i) + "";
			
			if ("(".equals(ch)) {
				isSimpleBracketStart = true;
				continue;
			} else if ("{".equals(ch)) {
				isCurlryBracketStart = true;
				continue;
			} else if ("[".equals(ch)) {
				isSqureBracketStart = true;
				continue;
			}

			if (isSimpleBracketStart && ch.equals(")")) {
				isSimpleBracketStart=false;
				continue;
			} else if (isCurlryBracketStart && ch.equals("}")) {
				isCurlryBracketStart=false;
				continue;
			} else if (isSqureBracketStart && ch.equals("]")) {
				isSqureBracketStart=false;
				continue;
			} else {
				return false;
			}

		}
		return true;
	}

}
