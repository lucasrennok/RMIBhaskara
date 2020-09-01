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
        String rmiBaseRoute = "rmi://localhost:5099/";
        
        //Change here to set a,b,c
        float a = 2;
        float b = -16;
        float c = -18;
        
        //Uses the interface to receive responses from that functions
        //The client is looking up to localhost:5099/bhaskara
        BhaskaraService service = (BhaskaraService) Naming.lookup(rmiBaseRoute+"bhaskara");
        
        //Results of method bhaskara
        ArrayList bhaskaraResults = service.bhaskara(a, b, c);
        
        //It calls some functions and print them
        System.out.println("--- " + service.echo(" Bhaskara results: ") + " " + bhaskaraResults.toString());
        System.out.println("X1 = "+ bhaskaraResults.get(0) + " | X2 = " + bhaskaraResults.get(1));
        
        System.out.println("Closing Client...");
    }
    
}
