package exercicio3;

public class Main {

	public static void main(String[] args) {
		BoloChocolate choc= new BoloChocolate("Choc", "Normal", "pequeno", (float) 2.00, "Chocolate");
		BoloMorango mog = new BoloMorango("Mog", "Normal", "medio", (float) 3.00, "Verdes");
		BoloBaunilha bauni= new BoloBaunilha ("Bauni", "Normal", "grande", (float) 4.00, 2);
		
		 Bolo bolo1 = new BoloChocolate("Trufado", "Normal", "pequeno", (float) 2.00, "Chocolate");
		 Bolo bolo2 = new BoloChocolate("Trufado", "Normal", "pequeno", (float) 2.00, "Chocolate");
		 

		 Pedido pedido = new Pedido();
		 pedido.adicionarBolo(bolo1);
		 pedido.adicionarBolo(bolo2);

		 pedido.realizarPedido(pedido);
		
		 choc.exibirDados();
		 choc.calcularPreco();
		 
		 mog.exibirDados();
		 mog.calcularPreco();
		
		 bauni.exibirDados();
		 bauni.calcularPreco();

	}

}
