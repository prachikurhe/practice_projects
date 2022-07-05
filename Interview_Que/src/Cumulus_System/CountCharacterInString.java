
package Cumulus_System;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountCharacterInString {
	public static void main(String[] args) {
		String word="leela";
		
		Map<Character, Integer>  map=new HashMap<>();
		
		for(int i=0;i<word.length();i++) 
		{
		char ch=	word.charAt(i);
		if(map.containsKey(ch))
        {
            map.put(ch, map.get(ch)+1);
        }
       
        // If char is not present set key value to 1
        else
        {
            map.put(ch, 1);
        }
		
		}
		System.out.println(map);

}
}
