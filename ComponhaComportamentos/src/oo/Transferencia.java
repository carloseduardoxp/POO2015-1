package oo;
import utilitario.Conta;
import utilitario.Pagamento;



public class Transferencia implements Processo{
	
	private Conta conta;
	
	@Override
	public void lidaCom(Pagamento aPagar) {
		conta.executa(aPagar);
	}

	@Override
	public boolean deveProcessar(Pagamento aPagar) {
		return true;
	}

}
