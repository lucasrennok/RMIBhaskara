/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmibhaskara;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */

//Implemented functions from BhaskaraService | The server can use them
public class BhaskaraServant extends UnicastRemoteObject implements BhaskaraService{

    //Constructor
    public BhaskaraServant() throws RemoteException{
        super();
    }
    
    //Print function
    @Override
    public String echo(String input) throws RemoteException {
        System.out.println("Received message: "+ input);
        return "From server: " + input;
    }
    
    //Bhaskara function
    @Override
    public ArrayList bhaskara(float a, float b, float c) throws RemoteException{
        ArrayList resultValues = new ArrayList();
        resultValues.add((-b-Math.sqrt(b*b-4*a*c))/(2*a));
        resultValues.add((-b+Math.sqrt(b*b-4*a*c))/(2*a));
        
        System.out.println("Bhaskara with a="+a+" b="+b+" c="+c);
        System.out.println("X1: "+resultValues.get(0));
        System.out.println("X2: "+resultValues.get(1));

        return resultValues;
    }
}
