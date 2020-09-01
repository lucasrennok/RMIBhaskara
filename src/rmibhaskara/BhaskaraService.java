/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmibhaskara;

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * @author User
 */
public interface BhaskaraService extends Remote{
    
    public String echo(String input) throws RemoteException;
    
}
