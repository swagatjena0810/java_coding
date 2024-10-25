package FactoryPattern;

public class ProductMain {
    public static void main(String[] args) {
        // Create Product A using the factory
        Product productA = ProductFactory.createProduct("A");
        productA.use(); // Output: Using Product A

        // Create Product B using the factory
        Product productB = ProductFactory.createProduct("B");
        productB.use(); // Output: Using Product B
    }
}