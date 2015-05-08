package strategy.solucao4;

public class ContaEstacionamento {
			
	private CalculoValor calculo;

	protected Veiculo veiculo;
	protected long inicio;
	protected long fim;
	
	public ContaEstacionamento(CalculoValor calculo) {
		this.calculo = calculo;
	}
	
	public Double valorConta() {
		long atual = (fim == 0)?System.currentTimeMillis(): fim;
		long periodo = inicio - atual;
		return calculo.calcular(periodo);
	}
		
}
