package exercicio3;

public class BoloChocolate extends Bolo {
	public String recheio;
	
	public BoloChocolate(String nome, String tipo_massa, String tamanho, float preco, String recheio) {
		super(nome, tipo_massa, tamanho, preco);
		this.recheio=recheio;
	}
	
	public void exibirDados() {
		System.out.printf(" Nome: " +super.getNome(), " Tipo da Massa: " 
	    +super.getTipo_massa(), " Tamanho: " +super.getTamanho(), " Preco: " 
		+super.getPreco(), " Recheio: " + recheio);
	}
	
	public void calcularPreco() {
		float preco = super.getPreco() + 10;
		System.out.printf("Preco: " + preco);
	  
	}

	

}
