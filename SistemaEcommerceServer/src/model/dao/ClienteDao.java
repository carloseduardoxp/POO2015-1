/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.domain.Cliente;

/**
 *
 * @author CarlosEduardo
 */
public interface ClienteDao extends Remote {
	
	static final String NOME_SERVICO = "ServicoCliente";
	
	static final String URL_SERVICO = "rmi://127.0.0.1/"+NOME_SERVICO;

    void excluir(Cliente cliente) throws RemoteException;

    List<Cliente> pesquisar(Cliente cliente) throws RemoteException;

    void salvarAtualizar(Cliente cliente) throws RemoteException;
    
}
