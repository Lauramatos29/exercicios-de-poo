package sistema_de_rpg;

public class Main {

	public static void main(String[] args) {
		Guerreiro guerreiro = new Guerreiro("Sauron", 0, 80, 20, 30, 25, "Espada");
	    Mago mago = new Mago("Gandalf", 0, 60, 50, 15, 20, "Varinha");
	    
	    guerreiro.exibirDados();
	    mago.exibirDados();

	        
	    Luta luta = new Luta(guerreiro, mago);
	    luta.iniciarLuta();
	    }

	}

