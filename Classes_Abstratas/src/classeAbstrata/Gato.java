package classeAbstrata;

public class Gato extends Animal {
	private int idade;
	
	public Gato(String nome, int idade) {
		super(nome);
		this.idade=idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void emitirSom() {
		System.out.println("MIAU-MIAU");
	}
	
	public void exibirNome() {
		super.exibirNome();
	}

}
