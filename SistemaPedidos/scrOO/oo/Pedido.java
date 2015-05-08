package oo;
import java.util.List;


public class Pedido {
	
	private Cliente cliente;
	
	private List<ItemPedido> itensPedido;
	
	private Double valorPedido;
	
	public Double calcularPreco() {
		valorPedido = 0.0;
		for (ItemPedido itemPedido: itensPedido) {
			valorPedido += itemPedido.calcularPreco();						
		}
		return cliente.obterValorComDesconto(this);
	}

	public Double getValorPedido() {	
		return valorPedido;
	}


}
