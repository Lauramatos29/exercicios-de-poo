package empregados;

public class Horista extends Empregado {
	private double salarioPorHora;
	private int horasTrabalhadas;
	
	public Horista(String nome, String cpf, double salarioPorHora, int horasTrabalhadas) {
		super(nome, cpf);
		this.salarioPorHora = salarioPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void calcularSalario() {
		salarioPorHora = (salarioPorHora*horasTrabalhadas)/2;
		System.out.println("Salario por Hora: " + salarioPorHora);
		
	}
	

}
