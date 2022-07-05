package PracticeExample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>map=new HashMap<>();
		map.put("Sachin", 101);
		map.put("Prachi", 104);
		map.put("Aniket", 108);
		map.put("Tushar", 102);
		System.out.println(map);
		
		TreeMap<String,Integer> sorted=new TreeMap<>(map);
		
		for(Map.Entry<String,Integer> entry:sorted.entrySet()) {
			System.out.println("Key:"+entry.getKey()+","+"Value:"+entry.getValue());
		}
		

	}

}
