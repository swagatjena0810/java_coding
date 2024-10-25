package MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Bicycle{
	int id;
	String brand;
	public Bicycle(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Bicycle [id=" + id + ", brand=" + brand + "]";
	}
	
	
}
class BicycleComparator implements Comparator<Bicycle>{

	@Override
	public int compare(Bicycle o1, Bicycle o2) {
		return o1.id-o2.id;
	}
	
}
public class ReferInstanceMethod {
	public static void main(String[] args) {
		Bicycle b1=new Bicycle(1,"hero");
		Bicycle b2=new Bicycle(3,"atlas");
		Bicycle b3=new Bicycle(2,"rolexo");
		List<Bicycle> list=Arrays.asList(b1,b2,b3);
		BicycleComparator bc=new BicycleComparator();
		list.stream().sorted(bc::compare)
				.forEach(System.out::println);
	}
}
