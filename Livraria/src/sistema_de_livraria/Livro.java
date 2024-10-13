package sistema_de_livraria;

public class Livro {
	private String titulo;
	private String autor;
	private String genero;
	private int quantidadeEmEstoque;
	private float preco;
	
	public Livro(String titulo, String autor, String genero, int quantidadeEmEstoque, float preco) {
		this.titulo=titulo;
		this.autor=autor;
		this.genero=genero;
		this.quantidadeEmEstoque=quantidadeEmEstoque;
		this.preco=preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void exibirDados() {
		System.out.println(" Título: "  + titulo);
		System.out.println(" Autor: "  + autor);
		System.out.println(" Gênero: "  + genero);
		System.out.println(" Quantidade em Estoque: "  + quantidadeEmEstoque);
		System.out.println(" Preço: "  + preco);
	}
	
	public void verificarDisponibilidade() {
		if (quantidadeEmEstoque >= 1) {
			System.out.println("O livro está disponível.");
		}
		
		else {
			System.out.println("O livro não está disponível.");
		}
			
	}

}
