package classes;

import interfaces.Discountable;

public class PhysicalProduct extends Product implements Discountable {

	public PhysicalProduct(String name, double price) {
		super(name, price);
	}

	@Override
	public void displayInfo() {
		System.out.println("Produto: " + name);
		System.out.println("Preço: " + price);
		
	}

	@Override
	public double applyDiscount(double percentual) {
		validarPercentual(percentual);
		price = price - percentual;
		System.out.println("O preço do produto com desconto é: " + price);
		return 0;
	}

}
