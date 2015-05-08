package factoryMethod.dao;

import java.util.List;

import factoryMethod.domain.Produto;

public class ProdutoDao implements DaoPersistivel<Produto> {

	@Override
	public Produto recuperarPorId(Object id) {
		return new Produto("Bombom",2.50);
	}

	@Override
	public void salvar(Produto entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Produto id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
