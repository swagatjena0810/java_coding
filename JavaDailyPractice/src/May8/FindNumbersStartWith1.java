package May8;
import java.util.List;
import java.util.Arrays;
// Given a list of integers, 
//find out all the numbers starting with 1 using Stream functions?
public class FindNumbersStartWith1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(121,132,213,412,192);
		list.stream()
			.map(n->n+"")
			.filter(s->s.startsWith("1"))
			.distinct()
			.forEach(System.out::println);
	}
}
