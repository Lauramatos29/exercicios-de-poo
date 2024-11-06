package classes;

import excessoes.PesoInvalidoException;

public class Main {
	
	public static void main(String[] args) throws PesoInvalidoException {
		Transporte transporte1 = new FreteExpresso(100);
		Endereco endereco1 = new Endereco("25 de Março", "São Paulo", "453000-000");
		Clientes cliente1 = new Clientes("Alex Alckman", endereco1, transporte1, "Expresso");
		
		cliente1.exibirCliente();
		cliente1.calcularFrete(1);
		

	}
}
