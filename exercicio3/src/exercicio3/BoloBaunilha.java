package exercicio3;

public class BoloBaunilha extends Bolo {
	public int camadas;

	public BoloBaunilha(String nome, String tipo_massa, String tamanho, float preco, int camadas) {
		super(nome, tipo_massa, tamanho, preco);
		this.camadas=camadas;
	}
	
	public void exibirDados() {
		System.out.printf(" Nome: " +super.getNome(), " Tipo da Massa: " 
	    +super.getTipo_massa(), " Tamanho: " +super.getTamanho(), " Preco: " 
		+super.getPreco(), " Camadas: " + camadas);
	}
	
	public void calcularPreco() {
		System.out.printf("Preco: " +super.getPreco());
	}
	
	

}
