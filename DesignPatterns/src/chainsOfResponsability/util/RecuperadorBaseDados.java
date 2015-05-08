package chainsOfResponsability.util;

import chainsOfResponsability.domain.Arquivo;

public class RecuperadorBaseDados extends RecuperadorArquivo {

	public RecuperadorBaseDados(RecuperadorArquivo proximo) {
		super(proximo);		
	}

	@Override
	protected Arquivo recuperaArquivo(String nome) {
		return new Arquivo("teste",true);
	}

}
