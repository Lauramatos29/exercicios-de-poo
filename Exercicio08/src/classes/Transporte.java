package classes;

public abstract class Transporte {
	protected double peso;

	public Transporte(double peso) {
		super();
		this.peso = peso;
	}
	
	public abstract void calcularFrete(double valor);

}
