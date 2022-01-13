package by.jonline.modul05.exercise02;

public class Product {

	private String name;
	private double price;
	
	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("\nProduct [name=%s, price=%s]", name, price);
	}
	
	
}
