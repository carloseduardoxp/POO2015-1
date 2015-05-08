package semPrincipio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurvaAbc {
	
	private static final int CURVA_A = 70;
	private static final int CURVA_B = 20;
	
	private static Map<Cliente, Double> clientesA;
	
	private static Map<Cliente, Double> clientesB;
	
	private static Map<Cliente, Double> clientesC;
	
	public static void calcularCurvaAbc(List<Pedido> pedidos,TipoCurvaAbc tipo) {
		clientesA = new HashMap<Cliente, Double>();
		clientesB = new HashMap<Cliente, Double>();
		clientesC = new HashMap<Cliente, Double>();
		
		if (tipo ==  TipoCurvaAbc.GERAL) {
			calcularCurva(pedidos);
		} else if (tipo == TipoCurvaAbc.MES_ATUAL) {
			calcularCurva(getPedidosMes(pedidos));
		}
		
	}

	private static List<Pedido> getPedidosMes(List<Pedido> pedidos) {
		List<Pedido> pedidosMes = new ArrayList<Pedido>();
		
		for (Pedido pedido: pedidos) {
			if (pedido.getDataPedido().getTime() >= getInicioMes().getTime()) {
				pedidosMes.add(pedido);	
			}
		}
		return pedidosMes;
	}
	
	private static Date getInicioMes() {
		Calendar cal=Calendar.getInstance();  
        cal.setTime(new Date());  
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));  
        cal.set(Calendar.HOUR_OF_DAY, 0);  
        cal.set(Calendar.MINUTE, 0);  
        cal.set(Calendar.SECOND, 0);  
        cal.set(Calendar.MILLISECOND, 0);  
        return cal.getTime();              
	}

	private static void calcularCurva(List<Pedido> pedidos) {
		Map<Cliente, Double> valorTotal = populaHashCliente(pedidos);
		Double valorTotalPedidos = getValorTotalPedidos(pedidos);
		Double valorCurvaA = valorTotalPedidos * CURVA_A / 100;
		Double valorCurvaB =  (valorTotalPedidos * CURVA_B / 100);
		while (!valorTotal.isEmpty()) {
			Cliente cliente = removeMaior(valorTotal);
			Double valor = valorTotal.get(cliente);
			valorTotal.remove(cliente);
			if (valorCurvaA < valorTotalPedidos) {
				clientesA.put(cliente, valor);
			} else if (valorCurvaB < valorTotalPedidos) {
				clientesB.put(cliente, valor);
			} else {
				clientesC.put(cliente, valor);
			}
			valorTotalPedidos -= valor;
		}
		
	}
	
	private static Double getValorTotalPedidos(List<Pedido> pedidos) {
		Double valorTotal = 0d;
		for (Pedido pedido: pedidos) {
			valorTotal += pedido.getValorPedido();
		}
		return valorTotal;
		
	}

	private static Cliente removeMaior(Map<Cliente, Double> pedidos) {
		Cliente maiorCliente = null;
		Double maiorValor = 0d;
		for (Map.Entry<Cliente,Double> key: pedidos.entrySet() ) {
			Double valor = pedidos.get(key.getKey());
			if (valor > maiorValor) {
				maiorCliente = key.getKey();
				maiorValor = key.getValue();
			}
		}
		return maiorCliente;
		
	}

	private static Map<Cliente, Double> populaHashCliente(List<Pedido> pedidos) {
		Map<Cliente, Double> valorTotal = new HashMap<Cliente, Double>();
		for (Pedido pedido: pedidos) {
			if (valorTotal.get(pedido.getCliente()) == null) {
				valorTotal.put(pedido.getCliente(),pedido.getValorPedido());
			} else {
				Double valor = valorTotal.get(pedido.getCliente());
				valor += pedido.getValorPedido();
				valorTotal.put(pedido.getCliente(), valor);
			}
		}
		
		return valorTotal;
		
	}

	public static Map<Cliente, Double> getClientesA() {
		return clientesA;
	}

	public static Map<Cliente, Double> getClientesB() {
		return clientesB;
	}

	public static Map<Cliente, Double> getClientesC() {
		return clientesC;
	}
	
	
	
	

}
