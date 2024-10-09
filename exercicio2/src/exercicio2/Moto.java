package exercicio2;

public class Moto extends Veiculo{
private String espelhos;
	
	public Moto(String modelo, int ano, double valorBase, String espelhos) {
		super(modelo, ano, valorBase);
		this.espelhos=espelhos;
	}
	
	public double calcularValorDiaria() {
        return getValorBase() - 10 * (2024 - getAno());
    }
	
	public void exibirMoto() {
		System.out.printf(" Modelo: " + super.getModelo() + " Ano: " + super.getAno() + " Valor Base: " + super.getValorBase(), " Espelhos: " + espelhos);
	}
}

