package exercicio5;

public class Luta {
    public static void lutar(Personagem personagem1, Personagem personagem2) {
    	
    	while (personagem1.getVida() > 0 && personagem2.getVida() > 0) {
            
    		if (personagem1 instanceof Mago) {
                ((Mago) personagem1).executarAcao(personagem2);
            } 
    		
    		else if (personagem1 instanceof Guerreiro) {
                ((Guerreiro) personagem1).executarAcao(personagem2);
            } 
    		
    		else if (personagem1 instanceof Arqueiro) {
                ((Arqueiro) personagem1).executarAcao(personagem2);
            }

            if (personagem2.getVida() <= 0) {
                break;
            }
            
}
        
    }
    
}