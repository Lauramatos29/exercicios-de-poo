package exercicio2;

public class Main {

	public static void main(String[] args) {
		Carro fiatuno= new Carro("Fiat", 2007, 200, "Vermelho");
		Moto titan= new Moto("Honda", 2008, 400, "Sim");
		Caminhao scania= new Caminhao("Scania", 2004, 500, "Zezinho");
		
		fiatuno.calcularValorDiaria();
		fiatuno.exibirCarro();
		
		titan.calcularValorDiaria();
		titan.exibirMoto();
		
		scania.calcularValorDiaria();
		scania.exibirCaminhao();

	}



	}


