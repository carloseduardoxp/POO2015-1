package factoryMethod.domain;

import java.util.Map;

public class Produto extends Entidade {
	
	private String nome;
	
	private Double preco;	

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public Map<String, Object> getMapa() {
		mapa.put("nome",this.nome);
		mapa.put("preco", this.preco);
		return mapa;
	}	
	
}
