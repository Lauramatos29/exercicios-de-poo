package heranca;

public class Moto extends Veiculo {
	private String nome;

	public Moto(String marca, String modelo, int ano, String nome) {
		super(marca, modelo, ano);
		this.nome = nome;
	}
	
	public void exibirMoto(){
		System.out.printf("Marca: " + super.getMarca() + " Modelo: " + super.getModelo() + " Ano: " + super.getAno() + " Nome: " + nome);
	}
	
	public void acelerarMoto() {
		System.out.println("Ra ta ta ta ta");
	}

}
