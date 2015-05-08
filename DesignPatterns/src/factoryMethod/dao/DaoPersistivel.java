package factoryMethod.dao;

import java.util.List;

public interface DaoPersistivel<E> {
	public E recuperarPorId(Object id);
	public void salvar(E entidade);
	public void excluir(E id);
	public List<E> listarTodos();
}
