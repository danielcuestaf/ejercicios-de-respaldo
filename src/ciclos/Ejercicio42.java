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
public class Ejercicio42 {
    //Atributos de la clase
    private float X;
    
    //Constructor
    public Ejercicio42(int _X){
        X=_X;
    }
    //Metodo de la clase que pide el numero 
    public void recoleccion(){
                
        System.out.println("Ingrese el numero que desea sumar hasta llegar a el : ");
        Scanner Sn = new Scanner(System.in);
        X=Sn.nextInt();
        
    }
    //Parte logica que suma los numeros anteriores hasta llegar a el mismo numero en base de un ciclo
    public void operacion(){
   
        int Aux=0;

        for (int i=1;i<=X;i++){
           
            Aux=Aux+i;
   
        }
        System.out.println("El resultado de la suma es: "+ Aux);
    }
}
