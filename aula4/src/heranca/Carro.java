package heranca;

public class Carro extends Veiculo {
	private int numeroPortas;

	public Carro(String marca, String modelo, int ano, int numeroPortas) {
		super(marca, modelo, ano);
		this.numeroPortas = numeroPortas; 
		
	}
	
	public void exibirInfo() {
		System.out.println("Marca: " + super.getMarca() + " Modelo: " + super.getModelo() + " Ano: " + super.getAno() + " Número de Portas: " + numeroPortas);
	}
	

}
