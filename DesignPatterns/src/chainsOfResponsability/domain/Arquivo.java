package chainsOfResponsability.domain;

public class Arquivo {
	
	private String nome;
	
	private Boolean valido;

	public Boolean isValido() {
		return valido;
	}	

	
	public Arquivo(String nome, Boolean valido) {
		super();
		this.nome = nome;
		this.valido = valido;
	}

	public void setValido(Boolean valido) {
		this.valido = valido;
	}


	@Override
	public String toString() {
		return "Arquivo [nome=" + nome + ", valido=" + valido + "]";
	}
	
	
	
	

}
