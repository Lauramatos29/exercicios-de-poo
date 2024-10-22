package classeAbstrata;

public class Cachorro extends Animal {
	private String corPelo;

	public Cachorro(String nome, String corPelo) {
		super(nome);
		this.corPelo=corPelo;
	}
	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	public void emitirSom() {
		System.out.println("AU-AU");
	}
	
	public void exibirNome() {
		super.exibirNome();
	}

}
