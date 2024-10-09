package exercicio3;

public class BoloMorango extends Bolo {
	public String granulado;

	public BoloMorango(String nome, String tipo_massa, String tamanho, float preco, String granulado) {
		super(nome, tipo_massa, tamanho, preco);
		this.granulado=granulado;
	}
	
	public void exibirDados() {
		System.out.printf(" Nome: " +super.getNome(), " Tipo da Massa: " 
	    +super.getTipo_massa(), " Tamanho: " +super.getTamanho(), " Preco: " 
		+super.getPreco(), " Cor dos Granulados: " + granulado);
	}
	
	public void calcularPreco() {
		float preco = super.getPreco() + 15;
		System.out.printf("Preco: " +preco);
		
		
	}
	
	

}
