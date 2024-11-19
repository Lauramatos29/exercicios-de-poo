package classes;

import interfaces.Sellable;

public class PhysicalProduct extends Product implements Sellable {
	private double weight;

	public PhysicalProduct(String name, double price, int quantityInStoke, double weight) {
		super(name, price, quantityInStoke);
		this.weight=weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void displayInfo() {
		System.out.println("Produto: " + name);
		System.out.println("Preço: " + price);
		System.out.println("Quantidade em estoque: " + quantityInStoke);
		System.out.println("Peso: " + weight);
	}
	
	public void validarWeight(double weight) throws IllegalArgumentException {
		if(weight < 0 || weight == 0) {
			throw new IllegalArgumentException("Peso inválido");
		}
	}

	@Override
	public double calculateTotalPrice(int quantity) {
		try {
			validarWeight(weight);
			price += weight * 2;
			System.out.println("O preço total do produto é: " + price);
			
		} catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
			
		} finally {
			System.out.println("Tentativa de validar o peso finalizada");
		}
		return 0;
	}

}
