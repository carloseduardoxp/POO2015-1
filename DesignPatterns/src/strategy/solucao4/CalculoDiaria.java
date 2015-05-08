package strategy.solucao4;

public class CalculoDiaria implements CalculoValor {
	
	private Double valorDiaria;
	
	public CalculoDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Double calcular(long periodo) {			
		return valorDiaria * Math.ceil(periodo / DIA);				
	}
}
