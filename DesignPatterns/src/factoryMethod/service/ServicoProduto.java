package factoryMethod.service;

import factoryMethod.dao.DaoPersistivel;
import factoryMethod.dao.ProdutoDao;
import factoryMethod.domain.Produto;
import factoryMethod.util.GeradorArquivo;

public class ServicoProduto extends ServicoAbstrato<Produto> {
	
	public ServicoProduto(GeradorArquivo gerador) {
		super(gerador);
	}

	private DaoPersistivel<Produto> dao;

	@Override
	public DaoPersistivel<Produto> getDao() {
		if (dao == null) {
			dao = new ProdutoDao();
		}
		return dao;
	}
	
	public Double getPrecoProduto(Object produtoId) {
		Produto p = getDao().recuperarPorId(produtoId);
		return p.getPreco();
	}
	
}
