package classes;

public abstract class Pokemon {
	protected String nome;
	protected String tipo;
	protected int hp;
	protected int ataque;
	protected int defesa;
	protected int velocidade;
	
	public Pokemon(String nome, String tipo, int hp, int ataque, int defesa, int velocidade) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	abstract void atacar(Pokemon oponente);
	
	public void exibirPokemon() {
		System.out.println("Seu Pokemon:");
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("HP: " + hp);
		System.out.println("Ataque: " + ataque);
		System.out.println("Defesa: " + defesa);
		System.out.println("Velocidade: " + velocidade);
		
	}

}
