package classes;

import interfaces.Sellable;

public class DigitalProduct extends Product implements Sellable{

	public DigitalProduct(String name, double price, int quantityInStoke) {
		super(name, price, quantityInStoke);
	}

	@Override
	public void displayInfo() {
		System.out.println("Produto: " + name);
		System.out.println("Preço: " + price);
		System.out.println("Quantidade em estoque: " + quantityInStoke);
		
	}
	
	public void validarQuantity(int quantity) throws IllegalArgumentException{
		if (quantity < 0 || quantity == 0) {
			throw new IllegalArgumentException("Quantidade inválida");
		}
	}

	@Override
	public double calculateTotalPrice(int quantity) {
		try {
			validarQuantity(quantity);
			price += quantity * 2;
			System.out.println("O preço total do produto é: " + price);
			
		} catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
			
		} finally {
			System.out.println("Tentativa de validar a quantidade finalizada.");
		}
		return 0;
	}

}
