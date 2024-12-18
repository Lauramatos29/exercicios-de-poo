package classes;

public class Main {

	public static void main(String[] args) {
		PokemonFogo fogo = new PokemonFogo("Chamander", "Fogo", 100, 70, 70, 70);
		PokemonAgua agua = new PokemonAgua("Aquaman", "Agua", 100, 60, 60, 60);
		
		agua.atacar(fogo);
		
		System.out.println("--------------------------"); 
		
		fogo.exibirPokemon();
		
		System.out.println("--------------------------"); 
		
		
		

	}

}
