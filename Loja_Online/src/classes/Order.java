package classes;

import java.util.List;
import java.util.ArrayList;

public class Order {
	Customer customer;
	List<Product> item = new ArrayList<>();
	private double totalAumont;
	
	public Order(Customer customer, double totalAumont) {
		super();
		this.customer = customer;
		this.totalAumont = totalAumont;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTotalAumont() {
		return totalAumont;
	}

	public void setTotalAumont(double totalAumont) {
		this.totalAumont = totalAumont;
	}
	
	public void addProduct(Product product, int quantity) {
		item.add(product);
		totalAumont += product.getPrice() * quantity;
		System.out.println("Total do pedido: " + totalAumont);
	}
	
	public void finalizeOrder(Product product, int quantity) {
		product.quantityInStoke = product.quantityInStoke - quantity;
		System.out.println("Pedido finalizado.");
	}

}
