package classes;

public class Endereco {
	private String rua;
	private String cidade;
	private String cep;
	
	public Endereco(String rua, String cidade, String cep) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Rua: " + rua + ", Cidade: " + cidade + ", CEP: " + cep;
	}
	

}
