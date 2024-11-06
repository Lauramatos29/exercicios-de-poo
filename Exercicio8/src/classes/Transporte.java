package classes;

import excessoes.PesoInvalidoException;

public abstract class Transporte {
	protected double peso;

	public Transporte(double peso) throws PesoInvalidoException {
		super();
		
		if (peso < 0) {
			throw new PesoInvalidoException ("O peso não pode ser negativo");
		}
		
		this.peso = peso;
	}
	
	public abstract void calcularFrete(double valor);

}
