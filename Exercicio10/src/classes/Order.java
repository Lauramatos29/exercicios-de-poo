package classes;

import java.util.ArrayList;
import java.util.List;

public class Order {
	List <Product> produtos = new ArrayList<>();
	private double totalAumont;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order(double totalAumont) {
		super();
		this.totalAumont = totalAumont;
	}

	public double getTotalAumont() {
		return totalAumont;
	}

	public void setTotalAumont(double totalAumont) {
		this.totalAumont = totalAumont;
	}
	
	public void validarQuantity(int quantity) throws IllegalArgumentException {
		if(quantity <= 0) {
			throw new IllegalArgumentException("A quantidade não pode ser negativa ou igual a zero.");
		}
		
		try {
			validarQuantity(quantity);
			
		} catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Tentativa de validar a quantidade finalizada.");
		}
	}
	
	public void addProduct(Product product) {
		produtos.add(product);
		System.out.println("O produto foi adicionado com sucesso!");
	}
	
	public void atualizarPrice(Product product, double price) {
		for(Product products : this.produtos){
			totalAumont = products.getPrice() + products.getPrice();
			System.out.println("O total é: " + totalAumont);
		}
	}
	
	public void addProduct(Product product, int quantity, double totalAumont) {
		this.quantity+=quantity;
		totalAumont += (product.getPrice() * quantity);
		System.out.println("O total é: " + totalAumont);
	}
	
	public void displayOrderSummary(Product product) {
		for (Product products : produtos) {
			System.out.print(products);
		}
	}
	
}
