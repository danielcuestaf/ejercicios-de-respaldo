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
public class Ejercicio24 {
    //Atributos
    private float Numero;
    
    //Metodo para pedir datos al usuario
    public void Recoleccion(){
        
        System.out.println("Ingrese el numero de que desea calcular su signo");
        Scanner X = new Scanner(System.in);
        Numero = X.nextFloat();  
        
    }
//Metodo con instrucciones condicionales
    public void Signo(){

        if (Numero<0){
            
            System.out.println("El numero ingresado es negativo");
        } else {
            if (Numero>0){
                
                System.out.println("El numero ingreado es positivo");
            } else {
                if(Numero <= 0){
                    System.out.println("El numero que ingreso no puede poseer signo");
                }
            }
        }
    }
}
