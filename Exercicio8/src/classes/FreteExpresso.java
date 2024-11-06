package classes;

import excessoes.PesoInvalidoException;
import interfaces.Desconto;

public class FreteExpresso extends Transporte implements Desconto{

	public FreteExpresso(double peso) throws PesoInvalidoException {
		super(peso);
	}

	@Override
	public void calcularFrete(double valor) {
		valor = peso*15;
		System.out.println("O valor do frete é: " + valor);
	}

	@Override
	public void aplicarDesconto(double valor) {
		valor = valor - 5;
		System.out.println("O valor com desconto fixo é de: " + valor);
		
	}

	@Override
	public void aplicarDesconto(double valor, double porcentagem) {
		valor = valor - porcentagem;
		System.out.println("O valor com desconto de porcentagem é: " + valor);
		
	}

}
