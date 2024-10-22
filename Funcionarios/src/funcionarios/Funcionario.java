package funcionarios;

public abstract class Funcionario {
	protected String nome;
	
	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}

	public abstract void calcularSalario();
	
	public void exibirNome() {
		System.out.println("Nome: " + nome);
	}

}
