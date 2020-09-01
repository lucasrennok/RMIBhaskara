/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmibhaskara;

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


/**
 *
 * @author User
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException{
        BhaskaraService service = (BhaskaraService) Naming.lookup("rmi://localhost:5099/bhaskara");
        System.out.println("--- " + service.echo("hey server") + " " + service.getClass().getName());
    }
    
}
