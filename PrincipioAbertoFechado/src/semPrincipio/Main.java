package semPrincipio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		Cliente cliente1 = new Cliente(1,"Supermercado Ki Joia");
		Cliente cliente2 = new Cliente(2,"Mercearia do Tião");
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(new Pedido(new Date(),cliente1,1000d));
		pedidos.add(new Pedido(new Date(),cliente1,2000d));
		pedidos.add(new Pedido(new Date(),cliente2,100d));
		pedidos.add(new Pedido(new Date(),cliente2,200d));
		
		CurvaAbc.calcularCurvaAbc(pedidos, TipoCurvaAbc.GERAL);
		System.out.println("clientes A "+CurvaAbc.getClientesA());
		System.out.println("clientes B "+CurvaAbc.getClientesB());
		System.out.println("clientes C "+CurvaAbc.getClientesC());
		
		
		
	}
 
}
