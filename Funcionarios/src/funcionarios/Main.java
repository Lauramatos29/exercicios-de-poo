package funcionarios;

public class Main {

	public static void main(String[] args) {
		FuncionarioTempoIntegral funcionarioTempoIntegral = new FuncionarioTempoIntegral("José", (float) 200.00);
		FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Carlos", (float) 150.00);
		
		funcionarioTempoIntegral.exibirNome();
		funcionarioTempoIntegral.calcularSalario();
		
		funcionarioHorista.exibirNome();
		funcionarioHorista.calcularSalario();

	}

}
