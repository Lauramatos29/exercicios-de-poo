package classes;

import java.util.Scanner;

public class PokemonPlanta extends Pokemon {
	
	public PokemonPlanta(String nome, String tipo, int hp, int ataque, int defesa, int velocidade) {
		super(nome, tipo, hp, ataque, defesa, velocidade);
	}
	
	public void validarAtaque(int ataque) throws IllegalArgumentException{
		if(ataque < 0) {
			throw new IllegalArgumentException("Ataque inválido!!");
		}
	}

	@Override
	void atacar(Pokemon oponente) {
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Escolha um ataque:");
			 System.out.println("1 - Ataque 1");
			 System.out.println("2 - Ataque 2");
			 System.out.println("3 - Ataque 3");
			 System.out.println("4 - Ataque 4");
			    
			    
			 int escolha = scanner.nextInt();
			 
			    switch (escolha) {
			        case 1:
			        	try {
			        		validarAtaque(ataque);
			        		System.out.println("Você usou o Ataque 1!");
			                if ("Agua".equals(oponente.getTipo())) {
			                	int dano = (10 + ataque - oponente.getDefesa())*2;
			                	oponente.setHp(oponente.getHp() - dano);
			                	System.out.println("O oponente tomou " + dano + " de dano");
			                }
			                
			                else if("Fogo".equals(oponente.getTipo())) {
			                	int dano = (10 + ataque - oponente.getDefesa())/2;
			                	oponente.setHp(oponente.getHp() - dano); 
			                	System.out.println("O oponente tomou " + dano + " de dano");
			                }
			        	} catch (IllegalArgumentException e) {
			        		System.out.println("Erro: " + e.getMessage());
			        	} finally {
			        		System.out.println("Tentativa de executar Ataque 1 finalizada.");	            	}
			            
			            
			            break;
			            
			        case 2:
			        	try {
			        		validarAtaque(ataque);
			        		System.out.println("Você usou o Ataque 2!");
			                if ("Agua".equals(oponente.getTipo())) {
			                	int dano = (20 + ataque - oponente.getDefesa())*2;
			                	oponente.setHp(oponente.getHp() - dano);
			                	System.out.println("O oponente tomou " + dano + " de dano");
			                }
			                
			                else if("Fogo".equals(oponente.getTipo())) {
			                	int dano = (20 + ataque - oponente.getDefesa())/2;
			                	oponente.setHp(oponente.getHp() - dano); 
			                	System.out.println("O oponente tomou " + dano + " de dano");
			                }
			        	} catch (IllegalArgumentException e) {
			        		System.out.println("Erro: " + e.getMessage());
			        	} finally {
			        		System.out.println("Tentativa de executar Ataque 2 finalizada.");
			        	}
			            
			            
			            break;
			            
			        case 3:
			        	try {
			        		validarAtaque(ataque);
			        		System.out.println("Você usou o Ataque 3!");
			                if ("Agua".equals(oponente.getTipo())) {
			                	int dano = (30 + ataque - oponente.getDefesa())*2;
			                	oponente.setHp(oponente.getHp() - dano);
			                	System.out.println("O oponente tomou " + dano + " de dano");
			                }
			                
			                else if("Fogo".equals(oponente.getTipo())) {
			                	int dano = (30 + ataque - oponente.getDefesa())/2;
			                	oponente.setHp(oponente.getHp() - dano); 
			                	System.out.println("O oponente tomou " + dano + " de dano");
			                }
			        	} catch (IllegalArgumentException e) {
			        		System.out.println("Erro: " + e.getMessage());
			        	} finally {
			        		System.out.println("Tentativa de executar Ataque 3 finalizada.");
			        	}
			            
			            
			            break;
			            
			        case 4:
			        	try {
			        		validarAtaque(ataque);
			        		System.out.println("Você usou o Ataque 4!");
			                if ("Agua".equals(oponente.getTipo())) {
			                	int dano = (40 + ataque - oponente.getDefesa())*2;
			                	oponente.setHp(oponente.getHp() - dano);
			                	System.out.println("O oponente tomou " + dano + " de dano");
			                }
			                
			                else if("Fogo".equals(oponente.getTipo())) {
			                	int dano = (40 + ataque - oponente.getDefesa())/2;
			                	oponente.setHp(oponente.getHp() - dano); 
			                	System.out.println("O oponente tomou " + dano + " de dano");
			                }
			                
			        	} catch (IllegalArgumentException e) {
			        		System.out.println("Erro: " + e.getMessage());
			        	} finally {
			        		System.out.println("Tentativa de executar Ataque 4 finalizada.");
			        	}
			            
			            break;
			            
			        default:
			            System.out.println("Ataque Inválido! Tente novamente.");
			            break;
			    }
		}

	    }
}
