/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import practica1.potenciaCuadrado;


/**
 *
 * @author tosh
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //potenciaCuadrado pc = new potenciaCuadrado();
        //double resultado = pc.potenciaCuadrado(5);
        
        //System.out.println("El resultado es: " + Double.toString(resultado));
        
    }
    
    public static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return (n*factorial(n-1));
    }
    
}
