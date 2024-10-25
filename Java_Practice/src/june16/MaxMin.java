package june16;

import java.util.Arrays;

public class MaxMin {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);  
		int max1 = Arrays.stream(numbers).reduce(0, Integer::max);   
		System.out.println("max: "+max );
		System.out.println("max1 : "+max1);

		int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);  
		int min1 = Arrays.stream(numbers).reduce(0, Integer::min);
		
		System.out.println("min: "+min);
		System.out.println("min1: "+min);
	}
}
