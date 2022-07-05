package PracticeExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringNonRepeatedCharacter {

	public static void main(String[] args) {

		String s = "HelloHi";

		Map<Character, Integer> map = new HashMap<>();
		char[] chars = s.toCharArray();

		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int count = map.get(ch);
				map.put(ch, count + 1);
			}

		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()== 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}

	}

}
