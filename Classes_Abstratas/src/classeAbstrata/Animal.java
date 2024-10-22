package classeAbstrata;

abstract class Animal {
	protected String nome;
	
	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public abstract void emitirSom();
	
	public void exibirNome() {
		System.out.println("Nome: " + nome);
	}
}
