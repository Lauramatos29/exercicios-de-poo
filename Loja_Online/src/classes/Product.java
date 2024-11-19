package classes;

public abstract class Product {
	protected String name;
	protected double price;
	protected int quantityInStoke;
	
	public Product(String name, double price, int quantityInStoke) {
		super();
		this.name = name;
		this.price = price;
		this.quantityInStoke = quantityInStoke;
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

	public int getQuantityInStoke() {
		return quantityInStoke;
	}

	public void setQuantityInStoke(int quantityInStoke) {
		this.quantityInStoke = quantityInStoke;
	}
	
	public abstract void displayInfo();

}
