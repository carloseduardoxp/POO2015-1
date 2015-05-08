package strategy.solucao4;

public interface CalculoValor {
	
	static final long HORA = 60;
	static final long DIA = 60;
	static final long MES = 60;
	static final long QUINZE_MIN = 15;
	
	public Double calcular(long periodo);

}
