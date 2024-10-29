package classes;

import interfaces.Pagamento;

public class PayPal implements Pagamento {

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("O pagamento foi realizado no valor de: " + valor);
		
	}

	@Override
	public void emitirRecibo(double valor) {
		System.out.println("Valor: " + valor);
		System.out.println("Valor pago no PayPal.");
	}

}
