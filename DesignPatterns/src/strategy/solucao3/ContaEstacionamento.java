package strategy.solucao3;

public abstract class ContaEstacionamento {
	
	protected static final long HORA = 60;
	protected static final long DIA = 60;
	protected static final long MES = 60;

	protected Veiculo veiculo;
	protected long inicio;
	protected long fim;
	
	public abstract Double valorConta();
		
}
