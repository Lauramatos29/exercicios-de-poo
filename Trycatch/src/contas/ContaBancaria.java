package contas;

import exeções.SaldoInsuficienteException;

public class ContaBancaria {
	public double saldo;
	
	public ContaBancaria(double saldo) {
		if (saldo < 0) {
			throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
		}
		
		this.saldo=saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	private void validarDeposito(double valor) throws IllegalArgumentException {
		if (valor < 0) {
			throw new IllegalArgumentException("O deposito não pode ser negativo");
		}
	}
	
	public void depositar(double valor) {
		try {
			validarDeposito(valor);
			this.saldo += valor;
			System.out.println("Deposito realizado com sucesso!");
			
		} catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
			
		} finally {
			System.out.println("Tentativa de deposito concluida!");
		}
	}
	
	public void sacar(double valor) throws IllegalArgumentException, SaldoInsuficienteException {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor do saque não pode ser negativo"); 
		}
		
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
	}
}

