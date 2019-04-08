/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Usuario
 */
public class Ejercicio54 {
    
    private int[] Vector= new int[100];  //Declaracion del arreglo junto con la dimension maxima de este

    
    public void operacion (){

        System.out.println("Numeros pares de 1-100");
        
        for (int i=1; i <= 50 ; i++){ //Abrimos el arreglo para llenarlo
            
            Vector[i]=2*i;
            
        }
    }     
       

public void Imprimir(){
for (int i=1; i <= 50; i++){ //Abrimos solo para imprimir los valores de cada posicion 

     System.out.println ("Posicion "+i+" es:"+ Vector[i]);

    }

}
}
