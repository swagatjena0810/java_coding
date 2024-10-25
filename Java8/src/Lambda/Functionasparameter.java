package Lambda;

import java.util.function.Function;

public class Functionasparameter {

	// Method that takes a function as a parameter
	public static void process(Function<Integer, Integer> func, int value) {
		int result = func.apply(value);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		// Defining a function to be passed as a parameter
		Function<Integer, Integer> square = x -> x * x;

		// Passing the function as a parameter to another method
		process(square, 5); // Output: Result: 25
	}

}
