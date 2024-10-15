package exercicio5;

public class Mago extends Personagem {

	 public Mago(String nome, String tipo, int vida, int ataque, int defesa) {
		 super(nome, tipo, vida, ataque, defesa);
	  }

	 public void executarAcao(Personagem personagem) {
		 switch (personagem.getTipo()) {
		 
		 case "Guerreiro":
         System.out.println("Lançou uma bola de fogo");
         int dano = 20;
         System.out.println("Casou um dano de: " + dano);
                
         break;
                
         case "Arqueiro":
         System.out.println("Lançou uma rajada de vento");
         int dor = 10; // mudou o nome da variável "dano" porque não aceita
         System.out.println("Causou um dano de: " + dor);
                
         break;
                
         default:
        	 atacar(personagem);
            }
		}
	 }


