package heranca;

public class Main {

	public static void main(String[] args) {
		Carro fiatUno = new Carro("Fiat,", "Uno,", 2007, 2);
		Moto titan = new Moto("Honda,", "Titan,", 2008, "Jeremias");
		
		fiatUno.acelerar();
		fiatUno.exibirInfo();
		
		titan.acelerarMoto();
		titan.exibirMoto();
		
	}

}
