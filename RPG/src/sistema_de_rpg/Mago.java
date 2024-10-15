package sistema_de_rpg;

public class Mago extends Personagem {
	private String acessorio;
	
	public Mago(String nome, int categoria, double peso, int mana, int forca, int resistencia, String acessorio) {
	super(nome, categoria, peso, mana, forca, resistencia);
	this.acessorio=acessorio;
	
	}

	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}
	
	 public void calcularCategoria() {
		 setCategoria((int) (getPeso() * 0.3));
	     
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