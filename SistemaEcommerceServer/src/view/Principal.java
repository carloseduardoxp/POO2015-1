package view;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import model.dao.ClienteDao;
import model.dao.ClienteDaoImpl;

public class Principal {

	public static void main(String[] args) {
		try {
			System.out.println("Tentando subir o serviço");
			LocateRegistry.createRegistry(1099);
			Naming.rebind(ClienteDao.NOME_SERVICO, new ClienteDaoImpl());
			System.out.println("Serviço de pé");
		} catch (Exception e) {
			System.out.println("Erro ao iniciar o serviço " + e);
		}
	}
}
