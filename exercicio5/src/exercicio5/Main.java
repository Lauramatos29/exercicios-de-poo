package exercicio5;

public class Main {
	    public static void main(String[] args) {
	    	
	        Personagem mago = new Mago("Cedrico", "Mago", 100, 20, 10);
	        Personagem guerreiro = new Guerreiro("Sauron", "Guerreiro", 120, 25, 15);

	        Luta.lutar(mago, guerreiro);
	    }
	}


