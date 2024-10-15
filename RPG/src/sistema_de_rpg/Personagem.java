package sistema_de_rpg;

public class Personagem {
	private String nome;
	private int categoria;
	private double peso;
	private int mana;
	private int forca;
	private int resistencia;
	
	public Personagem(String nome, int categoria, double peso, int mana, int forca, int resistencia) {
		super();
		this.nome=nome;
		this.categoria=categoria;
		this.peso=peso;
		this.mana=mana;
		this.forca=forca;
		this.resistencia=resistencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Categoria: " + categoria);
		System.out.println("Peso: " + peso);
		System.out.println("Mana: " + mana);
		System.out.println("Força: " + forca);
		System.out.println("Resistencia: " + resistencia);
	}
	
	public void atacar(Personagem alvo) {
        if (forca >= 5) {
            System.out.println("Ataque executado.");
            alvo.receberDano(forca);
        } else {
            System.out.println("Força insuficiente para ataque.");
        }
    }

    public void usarHabilidade(String habilidade) {
        if (mana >= 3) {
            System.out.println("Habilidade especial em uso: " + habilidade);
            mana -= 3;
        } 
        
        else {
            System.out.println("Mana insuficiente.");
        }
    }

    public void receberDano(int dano) {
        System.out.println("Dano recebido: " + dano);
        
        resistencia -= dano;
        
        if (resistencia <= 0) {
            System.out.println("Personagem derrotado!");
        } 
        
        else {
            System.out.println("Sua resistência está agora: " + resistencia);
        }
    }
}