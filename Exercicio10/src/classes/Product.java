import interfaces.Discountable;

public abstract class Product implements Discountable{
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

	public abstract void displayInfo();
	
	public void validarName(String name) throws IllegalArgumentException {
		if(name == null || !(name instanceof String)) {
			throw new IllegalArgumentException("O nome do produto não pode ser nulo. O nome do produto tem que ser uma String");
		}
	}
	
	public void extendendoValidarName() {
		try {
			validarName(name);
			
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Tentativa de validar o nome finalizada.");
		}
	}
	
	public void validarPrice(double price) throws IllegalArgumentException {
		if(price == 0) {
			throw new IllegalArgumentException("O preço não pode ser zero");
		}
	}
	
	public void extendendoValidarPrice() {
		try {
			validarPrice(price);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Tentativa de validar o preço finalizada.");
		}
	}
	
	public void validarPercentual (double percentual) {
		if (percentual == 0 || percentual > 0.5) {
			throw new IllegalArgumentException("Prcentual de desconto inválido.");
		}
	}
	
	public void extendendoValidarPercentual(double percentual) throws IllegalArgumentException {
		
		try {
			validarPercentual(percentual);
			
		} catch (IllegalArgumentException e){
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Tentativa de validar o percentual finalizada.");
		}
	}
	
	
	public abstract double applyDiscount(double percentual);
}
