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
public class Ejercicio18 {
    
    //Instanciar los metodos
    private int Ingresado;
    private int Horas;
    private int ResiduoMinutos;
    private int Minutos;
    private int Segundos;
    
    //Constructor
    public Ejercicio18(int X){
        
        Ingresado=X;
        
    }
    
    //Metodo para separar minutos horas y segundos
    public void Operacion(){
            
        Horas = Ingresado/3600;
        ResiduoMinutos = Ingresado-(Horas*3600);
        Minutos = ResiduoMinutos/60;
        Segundos = ResiduoMinutos-(Minutos*60);
        
        System.out.println("Horas: "+ Horas + " Minutos: "+ Minutos+ " Segundos: " + Segundos);
        
}
}
