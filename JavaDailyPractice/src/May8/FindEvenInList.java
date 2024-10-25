package May8;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find out all the even numbers 
//that exist in the list using Stream functions
public class FindEvenInList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		list.stream()
			.filter(n->n%2==0)
			.distinct()
			.forEach(System.out::println);
	}
}
