package exercicio3;

public class Bolo {
	private String nome;
	private String tipo_massa;
	private String tamanho;
	private float preco;
	
	public Bolo(String nome, String tipo_massa, String tamanho, float preco) {
		super();
		this.nome=nome;
		this.tipo_massa=tipo_massa;
		this.tamanho=tamanho;
		this.preco=preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo_massa() {
		return tipo_massa;
	}

	public void setTipo_massa(String tipo_massa) {
		this.tipo_massa = tipo_massa;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	// Métodos:
	
	public void exibirDados() {
		return;
	}
	
	public void calcularPreco() {
		if (tamanho=="pequeno") {
			System.out.printf("Preco: " +preco);
		}
		
		else if (tamanho=="medio") {
			preco = (float) (preco + (preco*0.2));
			System.out.printf("Preco: " +preco);
		}
		
		else if (tamanho=="grande") {
			preco = (float) (preco + (preco*0.5));
			System.out.printf("Preco: " +preco);
		}
		
	}

}
