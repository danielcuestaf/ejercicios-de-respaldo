/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio48 {
    //Atributos
    private int Numero,cont=0;
    
    //Constructor
    public Ejercicio48(int _Numero){
        Numero=_Numero; 
    }
    
    //En caso de necesitar que el usuario ingrese numero pues esta este metodo 
    public void Recolectar(){
        
        System.out.println("Ingrese el numero que desea saber si es primo o no");
        Scanner Sn = new Scanner(System.in);
        Numero=Sn.nextInt();
        
    }

    //Parte logica que comprueba las caracteristicas del numero
    public void operacion(){

        for (int i = 1 ; i <= Numero; i++ ){
            
            if( Numero%i == 0 ){ 
                
                cont=cont+1;
           
        }
    }
        if ( cont == 2 ){
            
            System.out.println("El numero "+ Numero +" es primo");
            
        } else {
            if (cont != 2){
                
                System.out.println("El numero "+Numero+" NO es primo");
                
            }
        }
        
}
}
