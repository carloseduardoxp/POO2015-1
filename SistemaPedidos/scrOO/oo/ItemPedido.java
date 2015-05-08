package oo;


public class ItemPedido {
	
	private Pedido pedido;
	
	private Produto produto;
	
	private Integer quantidade;

	public int obterQuantidade() {
		return quantidade;
	}

	public Produto obterProduto() {
		return produto;
	}

	public Double calcularPreco() {
		return produto.obterPreco(quantidade);		
	}

}
