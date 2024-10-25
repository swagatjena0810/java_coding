package hashmap;

import java.util.HashMap;
import java.util.Map;

public class StoreCharactersInMap {
	public static void main(String[] args) {
		String name="swagat";
		Map<Character, Integer> freq=new HashMap<>();
		char[] letters=name.toCharArray();
		for(char ch:letters) {
			if(freq.containsKey(ch)) {
				freq.put(ch, freq.get(ch)+1);
			}
			else {
				freq.put(ch, 1);
			}
		}
		System.out.println(freq);
	}
}
