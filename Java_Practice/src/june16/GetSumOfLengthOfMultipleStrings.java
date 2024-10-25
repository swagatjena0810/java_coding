package june16;

import java.util.stream.Stream;

public class GetSumOfLengthOfMultipleStrings {
	public static void main(String[] args) {
		int length=Stream.of("Cognizant", "Infosys", "Amdocs")
	      .map(s -> s.length())
	      .reduce(0, Integer::sum);
		System.out.println(length);
		
	}
}
