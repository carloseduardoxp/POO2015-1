package strategy.solucao4;

public class CalculoHora implements CalculoValor {
	
	private Double valorHora;
	
	public CalculoHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double calcular(long periodo) {			
		return valorHora * Math.ceil(periodo / HORA);				
	}

}
