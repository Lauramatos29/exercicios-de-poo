package classes;

public class Main {

	public static void main(String[] args) {
		PhysicalProduct product1 = new PhysicalProduct("Livro", 20.00);
		PhysicalProduct product2 = new PhysicalProduct("Marca-página", 15.00);
		Order product3 = new Order(0);
		
		product1.displayInfo();
		product1.applyDiscount(0.5);
		
		System.out.println("---------------------------------------");
		
		product2.displayInfo();
		product2.applyDiscount(0.5);
		
		System.out.println("---------------------------------------");
		
		product3.addProduct(product2);
		product3.addProduct(product2, 2, 15.00);
		product3.displayOrderSummary(product2);
		

	}

}
