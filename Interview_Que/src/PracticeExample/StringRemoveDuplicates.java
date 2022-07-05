package PracticeExample;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Programming";
		//1
		char[]arr=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			boolean repeat=false;
			for(int j=i+1;j<s.length();j++) {
				if(arr[i]==arr[j]) {
					repeat=true;
					break;
				}
			}
			if(!repeat) {
				sb.append(arr[i]);
			}
			
			}
		System.out.println(sb);
      
		 //2
		StringBuilder sb1=new StringBuilder();
		Set<Character>set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character c:set) {
			sb1.append(c);
		}
		System.out.println(sb1);

}
}