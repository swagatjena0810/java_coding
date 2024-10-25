package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortKey {
	public static void main(String[] args) {
		Map<Integer, String> maps=new LinkedHashMap<>();
		maps.put(1, "one");
		maps.put(3, "three");
		maps.put(4, "four");
		maps.put(2, "two");
		for(Map.Entry<Integer, String> entry:maps.entrySet()) {
			System.out.println(entry.getKey()+ " : "+entry.getValue());
		}
		System.out.println("sorting on basis of key");
		
		maps.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
	}
}
