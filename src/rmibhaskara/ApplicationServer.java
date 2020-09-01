/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmibhaskara;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author lucas
 */

//Server will wait someone request and will send a response for that
//There are implemented functions at BhaskaraServant that it uses
public class ApplicationServer {
    public static void main(String [] args) throws RemoteException{
        //The server will host at localhost:5099
        Registry registry = LocateRegistry.createRegistry(5099);
        
        //It will bind 'bhaskara' route to send responses of BhaskaraServant functions
        // so: localhost:5099/bhaskara
        registry.rebind("bhaskara", new BhaskaraServant());
    }
}
