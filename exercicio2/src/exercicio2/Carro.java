package exercicio2;

public class Carro extends Veiculo {
	public String cor;
	
	public Carro(String modelo, int ano, double valorBase, String cor) {
		super(modelo, ano, valorBase);
		this.cor = cor; 

    }
	
	public double calcularValorDiaria() {
        return getValorBase() + 20 * (2024 - getAno());
    }
	
	public void exibirCarro() {
		System.out.printf(" Modelo: " + super.getModelo() + " Ano: " + super.getAno() + " Valor Base: " + super.getValorBase(), "Cor: " + cor);
	}
}

