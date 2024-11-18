package classes;

public class Main {

	public static void main(String[] args) {
		 try {
			 PhysicalProduct product1 = new PhysicalProduct("Vestido", 10.00);
		     product1.applyDiscount(40);
		     product1.displayInfo();

		     Order order1 = new Order(0);
		     order1.addProduct(product1);
		     order1.displayOrderSummary(product1);
		    } catch (IllegalArgumentException e) {
		    	System.out.println("Erro: " + e.getMessage());
		    }
	}

}
