package classes;

public class Clientes {
	private String nome;
	private Endereco endereco;
	private Transporte transporte;
	private String tipoTransporte;
	
	public Clientes(String nome, Endereco endereco, Transporte transporte, String tipoTransporte) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.transporte = transporte;
		this.setTipoTransporte(tipoTransporte);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public String getTipoTransporte() {
		return tipoTransporte;
	}

	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	
	public void escolherTransporte(int tipo) {
		if (tipo == 1) {
			this.setTipoTransporte("Expresso");
			System.out.println("O tipo de transporte é Expresso.");
		}
		
		else if (tipo == 2) {
			this.setTipoTransporte("Economico");
			System.out.println("O tipo de transporte é Economico");
		}
	}
	
	public void calcularFrete(int tipo) {
		if (tipo == 1) {
			FreteExpresso freteexpresso = new FreteExpresso(6);
			freteexpresso.calcularFrete(35.00);
			freteexpresso.aplicarDesconto(35.00);
			freteexpresso.aplicarDesconto(35.00, 0.5);
		}
		
		else if (tipo == 2) {
			FreteEconomico freteeconomico = new FreteEconomico(6);
			freteeconomico.calcularFrete(35.00);
			freteeconomico.aplicarDesconto(35.00);
			freteeconomico.aplicarDesconto(35.00, 0.7);
		}
	}
	
	public void exibirCliente() {
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Tipo de Transporte: " + tipoTransporte);
	}

}
