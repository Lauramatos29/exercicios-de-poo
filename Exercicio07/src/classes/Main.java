package classes;

public class Main {

	public static void main(String[] args) {
		CartaoCredito cartao = new CartaoCredito();
		PayPal paypal = new PayPal();
		
		cartao.realizarPagamento(20.00);
		cartao.emitirRecibo(20.00);
		
		System.out.println("---------------------");
		
		paypal.realizarPagamento(15.00);
		paypal.emitirRecibo(15.00);

	}

}
