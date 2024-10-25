package june16;

import java.util.stream.IntStream;

public class Product {
	public static void main(String[] args) {

		// calculate the product of elements that comes in given range excluding the
		// rightmost element
		int productOfElements = IntStream.range(5, 12).reduce((firstNumber, secondNumber) -> firstNumber * secondNumber)
				.orElse(-1);
		// show the result returned by the reduce method
		System.out.println("The product of all the elements come in given range is: " + productOfElements);
	}

}
