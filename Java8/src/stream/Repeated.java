package stream;

import java.util.HashSet;
import java.util.Set;

public class Repeated {
	public static void main(String[] args) {
		String s="fgghillk";
		Set<Character> set=new HashSet<>();
		s.chars()
		.mapToObj( ch->(char) ch)
		.filter(ch->!set.add(ch)).findFirst()
		.ifPresent(System.out::println);
		
	}
}
