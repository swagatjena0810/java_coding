package Lambda;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<Integer> c=i->
			System.out.println("square of "+i+" is : "+i*i);
		c.accept(2);
	}
}
