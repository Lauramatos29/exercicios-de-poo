package exercicio2;

public class Caminhao extends Veiculo {
private String nome;
	
	public Caminhao(String modelo, int ano, double valorBase, String nome) {
		super(modelo, ano, valorBase);
		this.nome=nome;
	}
	
	public double calcularValorDiaria() {
        return getValorBase() *1.5;
    }
	
	public void exibirCaminhao() {
		System.out.printf(" Modelo: " + super.getModelo() + " Ano: " + super.getAno() + " Valor Base: " + super.getValorBase(), " Nome: " + nome);
	}
}

