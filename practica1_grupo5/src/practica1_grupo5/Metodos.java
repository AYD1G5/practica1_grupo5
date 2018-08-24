/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo5;

/**
 *
 * @author Elmer Real
 */
public class Metodos {
    
        public int MetodoFactorial(int numero){
        if(numero==1){
            return 1;
        }else if(numero>1){
            return numero*MetodoFactorial(numero-1);
        }else{
            return 0;
        }
    }
}
