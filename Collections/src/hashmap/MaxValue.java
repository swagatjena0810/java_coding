package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxValue {
	public static void main(String[] args) {
		Map<Integer, String> maps=new LinkedHashMap<>();
		maps.put(1, "one");
		maps.put(3, "two");
		maps.put(4, "four");
		maps.put(2, "two");
		for(Map.Entry<Integer, String> entry:maps.entrySet()) {
			System.out.println(entry.getKey()+ " : "+entry.getValue());
		}
		
		String max=maps.entrySet().stream().max(Map.Entry.comparingByValue())
				.get().getValue();
		
		maps.entrySet().stream().filter(m->m.getValue()==max)
								.forEach(System.out::println);
			
	}
}
