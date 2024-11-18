package classes;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private double totalAumont;
	List <Product> produto = new ArrayList<>();
	
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
	
	public void addProduct(Product product) {
		produto.add(product);
        totalAumont += product.getPrice();
	}
	
	public void addProduto(Product product, int quantity) {
		 if (quantity <= 0) {
	            throw new IllegalArgumentException("Quantidade inválida");
	        }
	        totalAumont += product.getPrice() * quantity;
	        produto.add(product);
	}
	
	public void displayOrderSummary(Product product) {
		for (Product product1 : produto) {
			product1.displayInfo();
		}
	}

}
