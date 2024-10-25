package May8;
// Given a list of integers, 
//sort all the values present in it using Stream functions?


import java.util.Arrays;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,2,3,6,1);
		list.stream()
			.sorted()
			.forEach(System.out::println);
	}
}
