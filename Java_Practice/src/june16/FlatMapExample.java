package june16;

import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		Stream.of(1, 2, 3)
	      .flatMap(n -> Stream.of(n, n * 2))
	      .forEach(System.out::print);
	}
}
