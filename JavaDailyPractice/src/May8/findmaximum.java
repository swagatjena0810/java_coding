package May8;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the 
//maximum value element present in it using Stream functions?
public class findmaximum {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,7,4,5);
		 int max = list.stream()
				 		.mapToInt(Integer::valueOf)
				 		.max()
				 		.getAsInt();
	}
}
