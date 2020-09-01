/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmibhaskara;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


/**
 *
 * @author lucas
 */

//Interface of the Servant 
public interface BhaskaraService extends Remote{
    
    //Print function
    public String echo(String input) throws RemoteException;
    
    //Bhaskara function
    public ArrayList bhaskara(float a, float b, float c) throws RemoteException;

}
