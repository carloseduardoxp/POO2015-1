package oo;
import utilitario.Imposto;
import utilitario.Pagamento;


public class RetemImposto implements Processo{
	
	private Imposto impostos;
	
	private static Double TAXA_A_RETER = 0.10;
	
	@Override
	public void lidaCom(Pagamento aPagar) {
		impostos.retem(aPagar.getValor() * TAXA_A_RETER);
	}

	@Override
	public boolean deveProcessar(Pagamento aPagar) {
		return aPagar.isServico() && aPagar.getValor() > 300;
	}

}





