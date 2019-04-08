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
public class Ejercicio60 {
    
    private int[] vec= {23,45,68,99,10,15,4};
    
    public void Mostrar(){
    
    for (int i=0; i < 7 ; i++){ //Imprime el arreglo 
        
        System.out.println("El valor del arreglo en la posicion "+(i+1)+" es: "+vec[i]);
        
    }
  }
    
public void Posicion(){
    
    int aux=0; //Auxiliar para que mantenga la posicion mayor
    int mayor = 0; //Funciona como otro auxiliar que va a almacenar el mayor valor 
    
    for (int i=0; i < 7 ; i++){ //Abrimos el arreglo para recorrerlo
        if (mayor < vec[i] ){
            
            mayor = vec[i];
            aux = i;
            }
       }
    
    System.out.println("Posicion donde esta el valor mayor del arreglo ");
    System.out.println("Posicion "+aux+" valor: "+ mayor);
        
    }
}
