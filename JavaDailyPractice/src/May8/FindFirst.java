package May8;
//Given the list of integers, 
//find the first element of the list using Stream functions?
import java.util.Arrays;
import java.util.List;

public class FindFirst {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,2,3,1,21);
		list.stream().findFirst().ifPresent(System.out::println);
		
	}
}
