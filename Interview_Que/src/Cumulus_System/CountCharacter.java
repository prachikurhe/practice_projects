package Cumulus_System;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Programming";
		Map<Character,Integer> map=new HashMap<>();
		char[] chars=s.toCharArray();
		
		for(char ch:chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				int count=map.get(ch);
				map.put(ch,	count+1);
			}
				
		}
		System.out.println(map);
		}

}
