package MethodReference;

import java.util.function.Supplier;

class Bicycle2{
	int id;
	String brand;
}
public class ReferConstructor {
	public static void main(String[] args) {
		Supplier<Bicycle2> bicycleSupplier = Bicycle2::new;
        Bicycle2 bicycle = bicycleSupplier.get();

        // Outputting the default values (0 and null) for id and brand
        System.out.println("Bicycle ID: " + bicycle.id); // Output: Bicycle ID: 0
        System.out.println("Bicycle Brand: " + bicycle.brand);
	}
}
