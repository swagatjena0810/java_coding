package Workset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product{
	private Integer productId;
	private String productName;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Product(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
}
public class Main {
	public static void main(String[] args) {
		Product p1=new Product(1,"mobile");
		Product p2=new Product(2,"laptop");
		Product p3=new Product(3,"box");
		List<Product> products=Arrays.asList(p1,p2,p3);
		products.stream().sorted(Comparator.comparing(Product::getProductName))
			.forEach(System.out::println);
		
	}
}
