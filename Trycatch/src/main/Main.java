package main;

import contas.ContaBancaria;
import exeções.SaldoInsuficienteException;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, SaldoInsuficienteException {
		ContaBancaria conta = new ContaBancaria(1);
		
		conta.sacar(1000000);
		

	}

}
