package classes;

public class Main {

	public static void main(String[] args) {
		PhysicalProduct physical1 = new PhysicalProduct("Livro", 15.00, 10, 2.5);
		DigitalProduct digital1 = new DigitalProduct("Marca-Página", 2.00, 10);
		Customer cliente1 = new Customer("Laura");
		
		physical1.validarWeight(1);
		digital1.validarQuantity(1);
		
		Order order1 = new Order(cliente1, 0);
		order1.addProduct(physical1, 2);
		order1.finalizeOrder(digital1, 2);
		physical1.displayInfo();
		
		System.out.println("------------------------");
		
		Order order2 = new Order(cliente1, 0);
		order2.addProduct(digital1, 2);
		order2.finalizeOrder(digital1, 2);
		digital1.displayInfo();

	}

}
