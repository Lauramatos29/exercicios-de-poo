package empregados;

public class Assalariado extends Empregado {
	private double salarioMensal;

	public Assalariado(String nome, String cpf, double salarioMensal) {
		super(nome, cpf);
		this.salarioMensal=salarioMensal;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public void calcularSalario() {
		salarioMensal = (salarioMensal*0.2)/2;
		System.out.println("Salario Mensal: " + salarioMensal);
		
	}
	
	

}
