/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo5;

/**
 *
 * @author Denilson Argueta
 */
public class Practica1_grupo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String creado="";
        Metodos met = new Metodos();
        System.out.println(">>"+met.MetodoFactorial(6));
        System.out.println(">>" + met.CuadradoDeUnNumero(7));
        System.out.println(">>" + met.RaizCuadrada(4));
        System.out.println(">>" + met.RaizCubica(64));
    }
    
}
