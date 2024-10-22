package classeAbstrata;

public class Main {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Chuchu", "Marrom");
		Gato cat = new Gato("Fluflu", 1);
		
		dog.exibirNome();
		dog.emitirSom();
		
		cat.exibirNome();
		cat.emitirSom();

	}

}
