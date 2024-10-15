package exercicio5;

public class Arqueiro  extends Personagem{

	public Arqueiro (String nome, String tipo, int vida, int ataque, int defesa) {
		 super(nome, tipo, vida, ataque, defesa);
	}
	
	public void executarAcao(Personagem personagem) {
	    if (super.getTipo().equals("Arqueiro")) {
	    	
	    	switch (personagem.getTipo()) {
	        
	        case "Mago":
	        	System.out.println("Atacou com flechas encantadas");
	            int dano = 20;
	            System.out.println("Causou um dano de: " + dano);
	            
	        break;
	                
	        case "Guerreiro":
	            System.out.println("Atacou com flechas normais");
	            int dan = 10;
	            System.out.println("Causou um dano de: " + dan);
	                
	        break;
	                
	        default:
	        	atacar(personagem);
	        }
	    }
	}
}