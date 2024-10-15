package sistema_de_rpg;

public class Guerreiro extends Personagem {
	private String arma;
	
	public Guerreiro(String nome, int categoria, double peso, int mana, int forca, int resistencia, String arma) {
		super(nome, categoria, peso, mana, forca, resistencia);
		this.arma=arma;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public void calcularCategoria() {
        setCategoria((int) (getPeso() * 0.25));
        
        if (getCategoria() <= 5) {
            System.out.println("Categoria Baixa");
        } 
        
        else if (getCategoria() <= 6) {
            System.out.println("Categoria Média");
        } 
        
        else {
            System.out.println("Categoria Alta");
        }
    }
}