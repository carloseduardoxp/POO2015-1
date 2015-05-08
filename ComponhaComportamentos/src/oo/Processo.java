package oo;
import utilitario.Pagamento;


public interface Processo {
	
	public void lidaCom(Pagamento aPagar);
	
	public boolean deveProcessar(Pagamento aPagar);

}
