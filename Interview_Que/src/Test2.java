import java.util.HashMap;
import java.util.Map;

/*
 * Example
String s="This is test string This is string";

Output

This=2
is=2
test=1 
string=2
Example
*/

public class Test2 {  //count each of word in string

	public static void main(String[] args) {
		String s="This is test string This is string";
		
		Map<String,Integer>map=new HashMap<>();
		
		String[] word=s.split(" ");
		
		 for(String st:word) {
			 if(map.containsKey(st)) 
				 map.put(st, map.get(st)+1);
			 
			 else 
				map.put(st,1);
			 
		 }
		 System.out.println(map);

		}

}
