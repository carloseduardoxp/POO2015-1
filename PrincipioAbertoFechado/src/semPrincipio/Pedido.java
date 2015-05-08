package semPrincipio;

import java.util.Date;

public class Pedido {
	
	private Date dataPedido;
	
	private Cliente cliente;
	
	private Double valorPedido;

	public Pedido(Date dataPedido, Cliente cliente, Double valorPedido) {
		this.dataPedido = dataPedido;
		this.cliente = cliente;
		this.valorPedido = valorPedido;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(Double valorPedido) {
		this.valorPedido = valorPedido;
	}

	@Override
	public String toString() {
		return "Pedido [dataPedido=" + dataPedido + ", cliente=" + cliente
				+ ", valorPedido=" + valorPedido + "]";
	}
	
	

}
