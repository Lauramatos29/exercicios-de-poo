package classes;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	List<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("O produto foi adicionado com sucesso!");
	}
	
	public void consultarEstoque(Produto produto) {
		for (Produto produtos : produtos) {
			System.out.println(produtos);
		}
	}
	
	public void validarQuantidade(int quantidade) throws IllegalArgumentException {
		if (quantidade < 0) {
			throw new IllegalArgumentException("A quantidade não pode ser negativa");
		}
	}
	
	public void validarNomeProduto(String nomeProduto) throws IllegalArgumentException {
		if (nomeProduto == null || !(nomeProduto instanceof String)) {
			throw new IllegalArgumentException("O nome do produto não pode estar vazio. O nome do produto deve ser uma String");
		}
		
	}
	
	public void venderProduto(String nomeProduto, int quantidade) {
		try {
			for (Produto produto : produtos) {
				validarNomeProduto(nomeProduto);
				validarQuantidade(quantidade);
				produto.setQuantidade(produto.getQuantidade() - quantidade);
                System.out.println("Venda realizada com sucesso! Restante em estoque: " + produto.getQuantidade());
			}
		} 
		
		catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		 }
		
		finally {
			System.out.println("Tentativa de venda foi finalizada.");
		}
	}
	
	
}
