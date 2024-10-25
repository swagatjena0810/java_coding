package Lambda;

import java.util.function.Function;

public class StoringFunctionInReferenceVariable {
	public static void main(String[] args) {
		// Using lambda expression to define a function
		Function<Integer, Integer> square = x -> x * x;

		// Storing the function reference in a variable
		Function<Integer, Integer> funcRef = square;

		// Using the function reference
		System.out.println(funcRef.apply(5));
	}
}
