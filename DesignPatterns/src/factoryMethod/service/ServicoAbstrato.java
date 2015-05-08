package factoryMethod.service;

import java.io.IOException;

import factoryMethod.dao.DaoPersistivel;
import factoryMethod.domain.Entidade;
import factoryMethod.util.GeradorArquivo;

public abstract class ServicoAbstrato<E> {
	
	public GeradorArquivo gerador;

	public ServicoAbstrato(GeradorArquivo gerador) {
		super();
		this.gerador = gerador;
	}
	
    public abstract DaoPersistivel<E> getDao();
    
    public void gravarEntidadeEmArquivo(Object id,String nomeArquivo) throws IOException {
    	E entidade = getDao().recuperarPorId(id);
    	gerador.gerarArquivo(nomeArquivo, ((Entidade)entidade).getMapa());
    }

}
