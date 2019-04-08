/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simples;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {      
    
    //Atributos
    private int lado1;
    private int lado2;
    
    //Constructor que usa de parametros a dos enteros
    public Ejercicio6(int _X, int _y){
        lado1=_X;
        lado2=_y;
        
    }
    
    
    //Metodo de operacion matematica entre los valores dados
    public void operacion(){
        
        int Area;
        
        Area=lado1*lado2;
        
        System.out.println("El area del rectangulo es: "+ Area);
                
    }
}
