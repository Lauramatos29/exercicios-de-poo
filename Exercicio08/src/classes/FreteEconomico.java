package classes;

import interfaces.Desconto;

public class FreteEconomico extends Transporte implements Desconto{

	public FreteEconomico(double peso) {
		super(peso);
	}

	@Override
	public void calcularFrete(double valor) {
		valor = peso*5;
		System.out.println("O valor do frete é: " + valor);
	}

	@Override
	public void aplicarDesconto(double valor) {
		valor = valor - 7;
		System.out.println("O valor com desconto fixo é de: " + valor);
	}

	@Override
	public void aplicarDesconto(double valor, double porcentagem) {
		valor = valor - porcentagem;
		System.out.println("O valor com desconto de porcentagem é: " + valor);
		
	}
	

}
