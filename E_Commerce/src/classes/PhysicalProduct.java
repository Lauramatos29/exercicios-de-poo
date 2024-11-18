package classes;

import interfaces.Discontable;

public class PhysicalProduct extends Product implements Discontable{

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
		price *= (1- percentual / 100);
		System.out.println("O preço do produto com desconto é: " +  price);
		return percentual;
	}

}
