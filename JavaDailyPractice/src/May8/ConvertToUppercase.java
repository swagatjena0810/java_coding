package May8;

import java.util.Arrays;
import java.util.List;

//How to use map to convert object into Uppercase in Java 8?
public class ConvertToUppercase {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("for","each","to","and");
		list.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
	}
}
