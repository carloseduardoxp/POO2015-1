package view;

import java.util.Date;

import model.domain.Cliente;
import model.domain.Fornecedor;
import model.domain.ItemPedido;
import model.domain.Pedido;
import model.domain.Produto;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1,"Carlos Eduardo",
				"Rua das couves","carloseduardodantas@iftm.edu.br",
				"3488550554",1d,"62246255732");
		Fornecedor fornecedor = new Fornecedor(1,"Alpargatas",
				"Rua yyy","alpargas@teste.com.br","3434234234","48459490000115");
		
		Produto produto = new Produto(1,"Sandália Havaiana",10d,10,fornecedor);
		
		Pedido pedido = new Pedido(1,new Date(),cliente);
		
		ItemPedido itemPedido = new ItemPedido(pedido,produto,2);
		pedido.addItemPedido(itemPedido);
		
		System.out.println(pedido.calcularPreco());
		
		
	}

}
