package funcionarios;

public class FuncionarioHorista extends Funcionario {
	private float salarioHoras;

	public FuncionarioHorista(String nome, float salarioHoras) {
		super(nome);
		this.salarioHoras=salarioHoras;
	}
	
	public float getSalarioHoras() {
		return salarioHoras;
	}
	
	public void setSalarioHoras(float salarioHoras) {
		this.salarioHoras = salarioHoras;
	}
	
	public void calcularSalario() {
		salarioHoras = (salarioHoras + 8)/2;
		System.out.println("Salario Horas: " + salarioHoras);
		
	}

}
