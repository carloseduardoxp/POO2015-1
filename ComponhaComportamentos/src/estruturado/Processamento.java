package estruturado;

import utilitario.Conta;
import utilitario.Email;
import utilitario.Estoque;
import utilitario.Imposto;
import utilitario.Pagamento;

public class Processamento {
	
	private Imposto impostos;
	
	private Estoque estoque;
	
	private Conta conta;
	
	private Email email;
	
	public static final Double TAXA_A_RETER = 0.10;
	
	public void processa(Pagamento aPagar) {
		if (aPagar.isServico() && aPagar.getValor() > 300) {
			impostos.retem(aPagar.getValor() * TAXA_A_RETER);
		} else	if (aPagar.isProduto()) {
			estoque.diminui(aPagar.getItem());
		}
		
		conta.executa(aPagar);
		
		if (aPagar.desejaReceberConfirmacao()) {
			email.enviarConfirmacao(aPagar);
		}
	}

}
