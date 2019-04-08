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
public class Ejercicio90 {
    //Atributos
    private String Caracter;
    //Constructor
    public Ejercicio90(String _X){
        Caracter=_X;
    }
    
     /* El constructor suplanta el proceso de recoger la palabra ¡¡PERO!! si fuera necesario recogerla solo 
  es crear un metodo como el siguiente:
  */
    
    public void PedirPalabra(){
        
        System.out.println("¿Cual es el caracter que desea ingresar?");
        Scanner Sd = new Scanner(System.in);
        Caracter = Sd.nextLine();
        
    }
    
    public void Comprobante(){  //Convierte el caracter en un numero 
        
        int cCaracter = (int)Caracter.charAt(0); //Esta variable es el numero de la letra en ASCII
        
             if (cCaracter >= 65 && cCaracter <= 95){
                 System.out.println("Es letra Mayuscula");
        } else {
                 if (cCaracter >=97 && cCaracter <= 122 ){
                     System.out.println("Es una letra Minuscula");
                 } else {
                     if (cCaracter >48 && cCaracter >= 57){
                         System.out.println("Es un numero");
                     }
                 }
             }
    }
}
