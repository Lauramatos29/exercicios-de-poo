package funcionarios;

public class FuncionarioTempoIntegral extends Funcionario {
	private float salarioFixo;

	public FuncionarioTempoIntegral(String nome, float salarioFixo) {
		super(nome);
		this.salarioFixo=salarioFixo;
	}
	

	public float getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(float salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public void calcularSalario() {
		System.out.println("Salario Fixo: " + salarioFixo);
		
	}
	

}
