package strategy.solucao3;

public class ContaVeiculo15MinHora extends ContaEstacionamento {
	
	protected static final long QUINZE_MIN = 15;

	public Double valorConta() {
		long atual = (fim == 0) ? System.currentTimeMillis() : fim;
		long periodo = inicio - atual;
		if (periodo < HORA) {
			return 0.5 * Math.ceil(periodo / QUINZE_MIN);		
		} else {
			return 300.0 * Math.ceil(periodo / HORA);
		}
	}
}
