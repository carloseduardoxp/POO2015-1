package es;
import oo.Pedido;
import oo.Produto;


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

}
