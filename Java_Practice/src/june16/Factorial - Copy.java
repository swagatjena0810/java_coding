package june16;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change this value to compute the factorial of another number
        long factorial = factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static long factorial(int number) {
        return IntStream.rangeClosed(1, number)
                        .reduce(1, (a, b) -> a * b);
    }
}
