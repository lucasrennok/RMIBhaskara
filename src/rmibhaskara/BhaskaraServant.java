/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmibhaskara;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author User
 */
public class BhaskaraServant extends UnicastRemoteObject implements BhaskaraService{

    public BhaskaraServant() throws RemoteException{
        super();
    }
    
    @Override
    public String echo(String input) throws RemoteException {
        return "From server: " + input;
    }

    
}
