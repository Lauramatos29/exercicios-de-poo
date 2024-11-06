package classes;

import excessoes.PesoInvalidoException;
import interfaces.Desconto;

public class FreteEconomico extends Transporte implements Desconto{

	public FreteEconomico(double peso) throws PesoInvalidoException {
		super(peso);
	}
	
	public void validarValor(double valor) throws IllegalArgumentException {
		if(valor < 0) {
			throw new IllegalArgumentException("O valor não pode ser negativo.");
		}
	}

	@Override
	public void calcularFrete(double valor) {
		try {
			validarValor(valor);
			valor = peso*5;
			System.out.println("O valor do frete é: " + valor);
		}
		
		 catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		 }
		
		finally {
			System.out.println("Tentativa de calcular o frete foi finalizada.");
		}
	}
	
	@Override
	public void aplicarDesconto(double valor) {
		try {
			validarValor(valor);
			valor = valor - 7;
			System.out.println("O valor com desconto fixo é de: " + valor);
		}
		
		 catch(IllegalArgumentException e) {
				System.out.println("Erro: " + e.getMessage());
			 }
		
		finally {
			System.out.println("Tentaiva de aplicar desconto com valor fixo foi finalizada");
		}
	}
	
	public void validarPorcentagem(double porcentagem) throws IllegalArgumentException {
		if(porcentagem < 0) {
			throw new IllegalArgumentException("A porcentagem não pode ser negativa");
		}
	}

	@Override
	public void aplicarDesconto(double valor, double porcentagem) {
		try {
			validarPorcentagem(porcentagem);
			valor = valor - porcentagem;
			System.out.println("O valor com desconto de porcentagem é: " + valor);
			
		}
		
		 catch(IllegalArgumentException e) {
				System.out.println("Erro: " + e.getMessage());
			 }
		
		finally {
			System.out.println("Tentativa de aplicar desconto de porcentagem finalizada.");
		}
		
	}
}