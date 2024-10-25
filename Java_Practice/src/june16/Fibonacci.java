package june16;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        int limit = 10; // Change this value to generate more Fibonacci numbers

        Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]})
              .limit(limit)
              .map(fib -> fib[0])
              .forEach(System.out::println);
    }
}