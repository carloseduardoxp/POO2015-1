package strategy.solucao3;

public class ContaVeiculoHoraDiaMes extends ContaEstacionamento {

	public Double valorConta() {
		long atual = (fim == 0) ? System.currentTimeMillis() : fim;
		long periodo = inicio - atual;
		if (periodo < 12 * HORA) {
			return 2.0 * Math.ceil(periodo / HORA);
		} else if (periodo > 12 * HORA && periodo < 15 * DIA) {
			return 26.0 * Math.ceil(periodo / DIA);
		} else {
			return 300.0 * Math.ceil(periodo / MES);
		}
	}
}
