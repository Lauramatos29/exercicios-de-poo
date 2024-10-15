package sistema_de_rpg;

public class Arqueiro extends Personagem{
	private int flechas;
	
	public Arqueiro(String nome, int categoria, double peso, int mana, int forca, int resistencia, int flechas) {
	super(nome, categoria, peso, mana, forca, resistencia);
	this.flechas=flechas;
	}

	public int getFlechas() {
		return flechas;
	}

	public void setFlechas(int flechas) {
		this.flechas = flechas;
	}
	
	public void calcularCategoria() {
        setCategoria((int) (getPeso() * 0.2));
        
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
