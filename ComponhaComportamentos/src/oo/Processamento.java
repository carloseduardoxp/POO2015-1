package oo;
import java.util.List;

import utilitario.Pagamento;


public class Processamento {
	
	private List<Processo> processaPagamento;
	
	public void processa(Pagamento aPagar) {
		for (Processo processaPagamento:
			processaPagamento) {
			if (processaPagamento.deveProcessar(aPagar)) {
				processaPagamento.lidaCom(aPagar);	
			}			
		}
	}
	
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
