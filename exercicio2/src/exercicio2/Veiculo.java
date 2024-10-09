package exercicio2;

public class Veiculo {
	private String modelo;
	private int ano;
	private double valorBase;
	
	public Veiculo(String modelo, int ano, double valorBase) {
		super();
		this.modelo=modelo;
		this.ano=ano;
		this.valorBase=valorBase;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}
	
	public double calcularValorDiaria() {
		return 0;
	}
}
