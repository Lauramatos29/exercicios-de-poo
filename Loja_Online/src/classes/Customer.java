package classes;

import java.util.List;
import java.util.ArrayList;

public class Customer {
	private String nomeCliente;
	
	List<Product> cart = new ArrayList<>();

	public Customer(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void addToCar(Product product, int quantity) {
		cart.add(product);
		System.out.println("Produto adicionado ao carrinho com sucesso!");
	}
	
	public void removeFromCart(Product product) {
		cart.remove(product);
		System.out.println("Produto removido do carrinho com sucesso!");
	}
	
	public void calculateTotal(Product product, double total) {
		for (Product product1 : cart) {
			total = product1.getPrice()+ product1.getPrice();
			System.out.println("O total é de " + total + " reais.");
		}
		
	}

}
