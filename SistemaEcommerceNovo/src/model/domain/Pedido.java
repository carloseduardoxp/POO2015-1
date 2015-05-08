package model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private Integer numero;
	
	private Date dataHora;
	
	private Cliente cliente;
	
	private List<ItemPedido> itensPedido;

	public Pedido(Integer numero, Date dataHora, Cliente cliente) {
		super();
		this.numero = numero;
		this.dataHora = dataHora;
		this.cliente = cliente;
	}
	
	public Double calcularPreco() {
		Double valorPedido = 0.0d;
		for (ItemPedido item: itensPedido) {
			valorPedido += item.calcularPreco();
		}
		return cliente.obterValorComDesconto(valorPedido);
	}
	
	public void addItemPedido(ItemPedido itemPedido) {
		if (itensPedido == null) {
			itensPedido = new ArrayList<ItemPedido>();
		}
		itensPedido.add(itemPedido);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", dataHora=" + dataHora
				+ ", cliente=" + cliente + "]";
	}
	
	
	
	

}
