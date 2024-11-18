package classes;

public abstract class Product {
	protected String name;
	protected double price;
	
	public Product(String name, double price) {
		super();
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
	
	public void verificarName(String name) {
		if (name == null || !(name instanceof String)) {
			throw new IllegalArgumentException("Nome do produto não pode ser nulo. Nome do produto deve ser uma String.");
		}
	}
	
	public void verificarPrice(double price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
	}
	
	public abstract void displayInfo();
	
	public double applyDiscount(double percentual) throws IllegalArgumentException {
		if (percentual < 0 || percentual > 50) {
			throw new IllegalArgumentException("Percentual inválido");
		}
		return percentual;
	}

}
