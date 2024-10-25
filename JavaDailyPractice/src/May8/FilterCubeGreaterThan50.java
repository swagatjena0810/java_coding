package May8;

import java.util.Arrays;
import java.util.List;

//Java 8 program to perform cube on list elements and 
//filter numbers greater than 50.
public class FilterCubeGreaterThan50 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,3,5);
		list.stream()
			.filter(i->(i*i*i)>50)
			.forEach(System.out::println);
	}
}
