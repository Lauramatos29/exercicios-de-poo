package exercicio5;

public class Personagem {
	private String nome;
	private String tipo;
	private int vida;
	private int ataque; // pontos de ataque
	private int defesa;
	
	public Personagem(String nome, String tipo, int vida, int ataque, int defesa) {
		super();
		this.nome=nome;
		this.tipo=tipo;
		this.vida=vida;
		this.ataque=ataque;
		this.defesa=defesa;
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

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
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
	
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Vidas: " + vida);
		System.out.println("Pontos de Ataque: " + ataque);
		System.out.println("Pontos de Defesa: " + defesa);
	}
	
	public void atacar(Personagem oponente) {
		if (ataque >= 4) { // verificando se os pontos de ataque são o suficiente
			System.out.println("Ataque executado");
			int dano = ataque - oponente.getDefesa();
			oponente.setVida(oponente.getVida() - dano);
			System.out.println("O dano causado foi de: "+ dano);
			System.out.println("O oponente perdeu "+ dano + "de vida");
		}
		
		else {
			System.out.println("Pontos de ataque insuficiente para executar ataque");
		}
	}

	
	}
	
