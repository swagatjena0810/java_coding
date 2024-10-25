package june16;

import java.util.Arrays;

public class MathOperation {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);    
		int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum);    

		int sum3 = Arrays.stream(numbers).reduce(0, (a, b) -> a - b);
		int sum4 = Arrays.stream(numbers).reduce(0, (a, b) -> a * b);   
		int sum5 = Arrays.stream(numbers).reduce(0, (a, b) -> a / b); 
		
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
	}
}
