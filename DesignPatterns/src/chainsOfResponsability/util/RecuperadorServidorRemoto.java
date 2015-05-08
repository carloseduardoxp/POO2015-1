package chainsOfResponsability.util;

import chainsOfResponsability.domain.Arquivo;

public class RecuperadorServidorRemoto extends RecuperadorArquivo {

	public RecuperadorServidorRemoto(RecuperadorArquivo proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Arquivo recuperaArquivo(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
