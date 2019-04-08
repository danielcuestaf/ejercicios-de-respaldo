/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio78 {
    
    private String Palabra;
    
    public void RecogerPalabra(){
   
       System.out.println("Escriba una cadena de caracteres");
       Scanner Sn = new Scanner(System.in);
       Palabra = Sn.nextLine();
       
        System.out.println("Su palabra frase o palabra es: "+Palabra);
        
    }
    public void TransformacionMayus(){
        
        System.out.println("Todo mayusculas: "+Palabra.toUpperCase());
        
    }
    public void TransformacionMin(){
        
        System.out.println("Todo minusculas: "+Palabra.toLowerCase());
    }
}
