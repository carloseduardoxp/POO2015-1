package oo;
import utilitario.Estoque;
import utilitario.Pagamento;


public class ProcessaEstoque implements Processo{
	
	private Estoque estoque;
	
	@Override
	public void lidaCom(Pagamento aPagar) {
		estoque.diminui(aPagar.getItem());
	}

	@Override
	public boolean deveProcessar(Pagamento aPagar) {
		return aPagar.isProduto();
	}

}
