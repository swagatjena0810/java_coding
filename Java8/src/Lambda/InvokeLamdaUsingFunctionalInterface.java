package Lambda;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(String s);
}

public class InvokeLamdaUsingFunctionalInterface {
    public static void main(String[] args) {
        // Using lambda to implement the abstract method of functional interface
        MyFunctionalInterface func = s -> System.out.println("Hello, " + s);

        // Calling the method using the lambda expression
        func.myMethod("World"); // Output: Hello, World
    }
}
