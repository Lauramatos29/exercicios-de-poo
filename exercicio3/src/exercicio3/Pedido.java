package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	 private List<Bolo> bolos;

	    public Pedido() {
	        this.bolos = new ArrayList<>();
	    }
	    
	    public void adicionarBolo(Bolo bolo) {
	        bolos.add(bolo);
	    }

	    public double calcularTotal() {
	        double total = 0.0;
	        for (Bolo bolo : bolos) {
	            total += bolo.getPreco();
	        }
	        return total;
	    }
	    
	    public static void realizarPedido(Pedido pedido) {
	        System.out.println("Detalhes do pedido:");
	        for (Bolo bolo : pedido.bolos) {
	            bolo.exibirDados();
	        }
	        System.out.println("Total a pagar: R$ " + String.format("%.2f", pedido.calcularTotal()));
	    }
	    
	    
}
