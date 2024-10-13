package sistema_de_livraria;

public class Main {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Orgulho e Preconceito", "Jane Austen", "Romance", 10, (float) 29.99);
		Autor autor1 = new Autor("Jane Austen", "Inglesa");
		
		Vendas vendas = new Vendas();
		vendas.adicionarLivro(livro1);
		
		vendas.realizarVenda();
		
		System.out.println("Livros em estoque: ");
		livro1.exibirDados();
		
		System.out.println("Nossos Autores: ");
		autor1.exibirAutor();

	}

}
