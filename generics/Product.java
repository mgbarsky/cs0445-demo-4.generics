package generics;

public class Product implements Comparable<Product> {

	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}	
	
	@Override
	public String toString() {
		return this.name +": " + this.price;
	}
	
	@Override
	public int compareTo(Product o) {
		return this.name.compareTo(o.name);		
	}	
}
