/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicinales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio30 {        
    //Atributos
        private float Valor1;    
        private float Valor2;
    //Constructor que usamos en main, es decir por defecto
    public Ejercicio30(){
        
    }
    //Este constructor no se usa es solo en caso de querer usar datos sin pedirlos al usuario
    public Ejercicio30(float _X,float _Y){
        Valor1=_X;
        Valor2=_Y;
    }
        //Metodo para pedir los valores
    public void Recoleccion(){
        
        System.out.println("Ingrese el primer valor: ");
        Scanner X1 = new Scanner(System.in);
        Valor1= X1.nextFloat();
        
        System.out.println("Ingrese el Segundo valor: ");
        Scanner X2 = new Scanner(System.in);
        Valor2= X2.nextFloat();
        
        System.out.println("Los valores iniciales de 1 y 2 son: "+ Valor1 + " , "+ Valor2 + " respectivamente");
    }
    public void operacion(){

        if (Valor1 > Valor2){
            
            float Aux;
                    
            Aux=Valor1;
            Valor1 = Valor2;
            Valor2=Aux;
            
            System.out.println("El valor 1 es: "+ Valor1+" Valor 2 es: "+ Valor2);
            
        } else {
            if (Valor1<Valor2){
                
                float Aux2;
                
                Aux2=Valor2;
                Valor2=Valor1;
                Valor1=Aux2;
                
                System.out.println("El valor 1 es: "+ Valor1 + " Valor 2 es: "+ Valor2);
            } else {
                if (Valor1 == Valor2){
                    
                    System.out.println("El valor 1 y valor 2 son iguales");
                }
            }
        }
    }
}
