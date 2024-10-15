package exercicio5;

public class Guerreiro extends Personagem {
	
	 public Guerreiro(String nome, String tipo, int vida, int ataque, int defesa) {
	 super(nome, tipo, vida, ataque, defesa);
	 }
	 
	 public void executarAcao(Personagem personagem) {
		 if(super.getTipo().equals("Guerreiro")) {
			 
			 switch (personagem.getTipo()) {
			 
			 case "Mago":
				 System.out.println("Atacou com uma espada");
				 int dano = 10;
				 System.out.println("Casou um dano de: " + dano);
				 
			 break;
			 
			 case "Arqueiro" : 
				 System.out.println("Atacou com um escudo");
				 int dan = 10;
				 System.out.println("Casou um dano de: " + dan);
				 
			 default:
	                atacar(personagem);
				 
			 }
		 }
	 }
}
