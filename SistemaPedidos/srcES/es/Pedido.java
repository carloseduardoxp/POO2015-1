package es;
import java.util.List;

import oo.Cliente;
import oo.ItemPedido;
import oo.Produto;


public class Pedido {
	
	private Cliente cliente;
	
	private List<ItemPedido> itensPedido;
	
	public Double calcularPreco() {
		Double valorPedido = 0.0;
		for (ItemPedido itemPedido: itensPedido) {
			int quantidade = itemPedido.obterQuantidade();
			Produto produto = itemPedido.obterProduto();
			Double preco = produto.obterDetalhesDoPreco();
			valorPedido += calcularPrecoBase(quantidade,preco);
		}
		return calcularDescontos(valorPedido);
	}

	private Double calcularDescontos(Double valorPedido) {
		Double desconto = cliente.obterInformacaoDeDesconto();
		return valorPedido - (valorPedido* desconto / 100);
	}

	private Double calcularPrecoBase(int quantidade, Double preco) {
		return quantidade * preco;
		
	}

}
