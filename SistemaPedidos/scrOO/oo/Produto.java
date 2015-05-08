package oo;

public class Produto {
	
	private String nome;
	
	private Double preco;

	public Double obterDetalhesDoPreco() {
		return preco;
	}

	public Double obterPreco(Integer quantidade) {				
		return preco * quantidade;		
	}

}
