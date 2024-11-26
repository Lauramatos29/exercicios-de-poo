package classes;

import interfaces.AtaqueEspecial;

public class PokemonFogo extends Pokemon implements AtaqueEspecial{

	public PokemonFogo(String nome, String tipo, int hp, int ataque, int defesa) {
		super(nome, tipo, hp, ataque, defesa);
	}
	
	public void validarAtaque(int ataque) throws IllegalArgumentException {
		if(ataque < 0) {
			throw new IllegalArgumentException("Valor de ataque inválido");
		}
	}

	@Override
	public void ataqueEspecial(Pokemon oponente, int ataque) {
		try {
			validarAtaque(ataque);
			if(ataque >= 10) {
				System.out.println("Ataque especial em execução...");
				int dano = (40 + ataque) - oponente.getDefesa(); // ataque especial causa dano maior
				if(oponente.getTipo() == "Planta") { // fogo possui vantagem sobre Planta
					dano *=2;
				} else if(oponente.getTipo() == "Agua") { // Agua possui vantagem sobre fogo
					dano /=2;
				}
				
				oponente.setHp(oponente.getHp() - dano);
				System.out.println(nome + " atacou " + oponente.getNome() + " causando " + dano + " de dano.");
			} else {
				System.out.println("Valor de ataque insuficiente");
			}
		} catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Tentativa de executar ataque especial finalizada.");
		}
		
	}

	@Override
	public void atacarOponente(Pokemon oponente, int ataque) {
		try {
			validarAtaque(ataque);
			if(ataque > 5) {
				System.out.println("Ataque simples em execução...");
				int dano = (10 + ataque) - oponente.getDefesa(); // Ataque simples causa dano menor
				if(oponente.getTipo() == "Planta") {
					dano *=2;
			} else if(oponente.getTipo() == "Agua") {
				dano /=2;
			}

			oponente.setHp(oponente.getHp() - dano);
			System.out.println(nome + " atacou " + oponente.getNome() + " causando " + dano + " de dano.");
		
		} else {
			System.out.println("Valor de ataque insuficiente");
		}
		
	} catch(IllegalArgumentException e) {
		System.out.println("Erro: " + e.getMessage());
	} finally {
		System.out.println("Tentativa de executar ataque simples finalizada.");
	}
	}
}
