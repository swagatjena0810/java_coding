package May8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How to find duplicate elements in a given integers 
//list in java using Stream functions?
public class FindDuplicate {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(22,33,22,44,55,44,66);
		list.stream()
			.filter(n->list.stream().filter(n2->n2==n).count()>1)
			.collect(Collectors.toSet())
			.forEach(System.out::println);
	}
}
