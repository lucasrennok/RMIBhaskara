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
import java.util.ArrayList;


/**
 *
 * @author lucas
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException{
        //Uses the interface to receive responses from that functions
        //The client is looking up to localhost:5099/bhaskara
        BhaskaraService service = (BhaskaraService) Naming.lookup("rmi://localhost:5099/bhaskara");
        
        //It calls some functions and print them
        System.out.println("--- " + service.echo(" Bhaskara results[x,x2]: ") + " " + service.bhaskara(1, 8, 3).toString());
    }
    
}
