package oo;

public class Cliente {
	
	private Double percentualDesconto;

	public Double obterInformacaoDeDesconto() {
		return percentualDesconto;
	}

	public Double obterValorComDesconto(Pedido pedido) {		
		return pedido.getValorPedido() - ( pedido.getValorPedido() * percentualDesconto / 100);
	}

}
