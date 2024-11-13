package classes;

public class Produto {
	private String nome;
	private int quantidade;
	private double preco;
	
	public Produto(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void validarNome(String nome) throws IllegalArgumentException {
		if(nome == null || nome instanceof String) {
			throw new IllegalArgumentException("O nome do produto não pode ser nulo. O nome do produto deve ser uma String.");
		}
	}

	public void exetendendoValidarNome(String nome){
		try {
			validarNome(nome);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Tentativa de validar o nome finalizada");
		}
	}
	
	public void validarQuantidade(int quantidade) throws IllegalArgumentException {
		if (quantidade <= 0) {
			throw new IllegalArgumentException("A quantidade não pode ser negativa. A quantidade não pode ser zero.");
		}
	}

	public void extendendoValidarQuantidade(int quantidade){
		try {
			validarQuantidade(quantidade);
		} catch (IllegalArgumentException e){
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Tentaiva de validar a quantidade finalizada");
		}
	}
	
	public void validarPreco(double preco) throws IllegalArgumentException {
		if (preco <= 0) {
			throw new IllegalArgumentException("O preço não pode ser negativo. O preço não pode ser zero.");
		}
	}

	public void extendendoValidarPreco(double preco){
		try {
			validarPreco(preco);
		} catch(IllegalArgumentException e) {
			System.out.println("erro: " + e.getMessage());
		} finally {
			System.out.println("Tentativa de validar o preco finalizada");
		}
	}
	
}
