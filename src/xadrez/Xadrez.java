/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;



import Excepcions.UserException;
import Xogo.Xogo;




/**
 *
 * @author Carlos
 */
public class Xadrez {
    /**
     * @param args the command line arguments
     * @throws Excepcions.UserException
     */
    public static void main(String[] args) throws UserException {
        Xogo xog=new Xogo();
        xog.iniciarXogo();
        System.out.println(xog.getFicha(1,7 ).getTipo());

    }
}
