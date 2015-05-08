/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import model.dao.ClienteDao;

/**
 *
 * @author CarlosEduardo
 */
public class ServiceLocator {

    public static ClienteDao getClienteDao() throws RemoteException{
        try {
            return (ClienteDao)Naming.lookup(ClienteDao.URL_SERVICO);
        } catch(Exception e ){
            throw new RemoteException(e.getMessage());
        }
        
    }
    
}
