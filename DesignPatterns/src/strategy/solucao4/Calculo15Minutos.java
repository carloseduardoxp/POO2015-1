package strategy.solucao4;

public class Calculo15Minutos implements CalculoValor {
	
	private Double valor15Minutos;
	
	public Calculo15Minutos(Double valor15Minutos) {
		this.valor15Minutos = valor15Minutos;
	}

	public Double calcular(long periodo) {			
		return valor15Minutos * Math.ceil(periodo / QUINZE_MIN);				
	}

}
