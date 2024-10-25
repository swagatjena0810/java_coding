package May8;


//Given a list of integers,
//find the total number of elements present in the list using Stream functions?
import java.util.Arrays;
import java.util.List;

public class FindSizeOfList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(11,22,33);
		Long cnt=list.stream().count();
		System.out.println(cnt);
	}
}
