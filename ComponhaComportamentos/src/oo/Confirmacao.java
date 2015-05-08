package oo;
import utilitario.Email;
import utilitario.Pagamento;


public class Confirmacao implements Processo{
	
	private Email emails;
	
	@Override
	public void lidaCom(Pagamento aPagar) {
		emails.enviarConfirmacao(aPagar);
	}

	@Override
	public boolean deveProcessar(Pagamento aPagar) {
		return aPagar.desejaReceberConfirmacao();
	}

}
