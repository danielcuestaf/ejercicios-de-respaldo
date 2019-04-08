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
public class Ejercicio72 {
    
    private int[] vec = new int[100]; //Declaracion del atributo de la clase
    private int[] VecPrimos = new int[30];
      
    /*Es un arreglo que sirve de apoyo para visualizar la dimension del arreglo pero no se usa*/
    public void Simple(){
        for (int i=0; i<100;i++){
            vec[i]=i+1;
        }
    }  
    
    public void Primo(){ //Este metodo se encarga de saber si es primo y llenar el vector 
        
        
        System.out.println("Los numeros primos son:\n"+"1");
        
        for(int i=1; i<100;i++){
                int cont=0;
            for(int j=1 ; j<=i ; j++){
                if ((i%j) == 0)
                    cont++;
            }
            if( cont == 2){
                System.out.println(i);;

                }       
    }            
     
    } 
}
