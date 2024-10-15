package sistema_de_rpg;

public class Luta {
	private Personagem personagem1;
    private Personagem personagem2;
    
	 public Luta(Personagem personagem1, Personagem personagem2) {
	        this.personagem1 = personagem1;
	        this.personagem2 = personagem2;
	    }

	    public void iniciarLuta() {
	        if (personagem1.getCategoria() != personagem2.getCategoria()) {
	            System.out.println("Luta inválida! Lutadores de categorias diferentes.");
	            return;
	        }
	        
	        while (personagem1.getResistencia() > 0 && personagem2.getResistencia() > 0) {
	            
	            personagem1.atacar(personagem2);
	            personagem2.atacar(personagem1);
	        }

	        if (personagem1.getResistencia() <= 0) {
	            System.out.println(personagem2.getNome() + " venceu a luta!");
	        } 
	        
	        else {
	            System.out.println(personagem1.getNome() + " venceu a luta!");
	        }
	    }
	}
        