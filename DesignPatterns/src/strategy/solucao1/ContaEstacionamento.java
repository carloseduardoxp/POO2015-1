package strategy.solucao1;

public class ContaEstacionamento {
	
	private static final long HORA = 60;
	private static final long DIA = 60;
	private static final long MES = 60;

	private Veiculo veiculo;
	private long inicio;
	private long fim;
	
	public double valorConta() {
		long atual = (fim == 0)?System.currentTimeMillis(): fim;
		long periodo = inicio - atual;
		if (veiculo instanceof Passeio) {
			if (periodo < 12 * HORA) {
				return 2.0 * Math.ceil(periodo/HORA);
			} else if (periodo > 12 * HORA && periodo < 15 * DIA) {
				return 26.0*Math.ceil(periodo/DIA);				
			} else {
				return 300.0*Math.ceil(periodo/MES);
			}
		}
		else if (veiculo instanceof Carga) {
			
		}
		return 0.0;
	}
}
