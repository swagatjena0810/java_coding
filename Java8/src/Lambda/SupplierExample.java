package Lambda;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<Double> s=()-> Math.random();
		double res=s.get();
		System.out.println(res);
	}
}
