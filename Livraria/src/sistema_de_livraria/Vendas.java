package sistema_de_livraria;

import java.util.ArrayList;
import java.util.List;

public class Vendas {
	private List<Livro> livros;
	
	public Vendas() {
		this.livros = new ArrayList<>();
	}
	
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public double calcularTotal() {
		double total = 0.0;
		for (Livro livro : livros) {
			total += livro.getPreco();
			
		}
		
		return total;
	}
	
	public void realizarVenda() {
		 System.out.println("Detalhes da venda: ");
		 for(Livro livro : livros) {
			 livro.exibirDados();
		 }
		 
		 System.out.println("Total a pagar: R$  " + calcularTotal());
	}

}
