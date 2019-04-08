/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import arreglos.Ejercicio54;
import arreglos.Ejercicio60;
import arreglos.Ejercicio66;
import arreglos.Ejercicio72;
import arreglos.Ejercicio78;
import arreglos.Ejercicio84;
import arreglos.Ejercicio90;
import ciclos.Ejercicio36;
import ciclos.Ejercicio42;
import ciclos.Ejercicio48;
import condicinales.Ejercicio24;
import condicinales.Ejercicio30;
import java.util.Scanner;
import simples.Ejercicio12;
import simples.Ejercicio18;
import simples.Ejercicio6;


/*
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String []args){
        
        byte Desicion;
        byte X;
        
        System.out.println("Bienvenido \n");
        System.out.println("A continuacion la lista de ejercicios:");
        
        
        do{
        System.out.println("Desea continuar? 1=Si o 2=No");
        Scanner Sd2 =new Scanner(System.in);
        Desicion= Sd2.nextByte();
      
        System.out.println("¿Que ejercicio desdea realizar DIGITE EL NUMERO DEL EJERCICIO?");
        
        System.out.println("Simples:  "+"Ejercicio 6 (6)  "+"Ejercicio 12 (12)  "+"Ejercicio 18 (18)   ");
        System.out.println("Condicionales: "+"Ejercicio 24 (24)  "+"Ejercicio 30 (30)  ");
        System.out.println("Ciclos: "+"Ejercicio36 (36)  "+"Ejercicio 42 (42)  "+ "Ejercicio 48 (48)  ");
        System.out.println("Arreglos: "+"Ejercicio (54)  "+"Ejercicio (60)  "+"Ejercicio (66)  "+"Ejercicio (72)  "+"Ejercicio (78  )"+"Ejercicio (84)  "+"Ejercicio (90)  "+"Ejercicio (96)");
        
        Scanner Sd = new Scanner(System.in);
        X=Sd.nextByte();
        
        switch (X){
        
            case 6:
            
                Ejercicio6 E6= new Ejercicio6(3,4);
                E6.operacion();
                
                break;
            case 12: 
      
                Ejercicio12 E12 = new Ejercicio12();
                E12.Recoleccion();
                E12.Valor();
                
                break;
            case 18:
                
                Ejercicio18 E18 = new Ejercicio18(3700);
                E18.Operacion();
             
                break;
            case 24: //Comentariar
                
                Ejercicio24 E24 = new Ejercicio24();
                E24.Recoleccion();
                E24.Signo();
                
                break;
            case 30:
                
                Ejercicio30 E30 = new Ejercicio30();
                E30.Recoleccion();
                E30.operacion();
                
                break;
            case 36:
                
                Ejercicio36 E36 = new Ejercicio36();
                E36.operacion();
                
                break;
            case 42: 
                
                Ejercicio42 E42 = new Ejercicio42(7);
                E42.operacion();
                
                break;
            case 48:
               
                Ejercicio48 E48 = new Ejercicio48(41);
                E48.operacion();
                
                break;
            case 54:
                
                Ejercicio54 E54 = new Ejercicio54();
                E54.operacion();
                E54.Imprimir();
                
                break;
            case 60:
                
                Ejercicio60 E60 = new Ejercicio60();  //En este punto planeaba usar constructor pero nose como entregar ese parametro al instanciar el objeto
                E60.Mostrar();
                E60.Posicion();
                
                break;
            case 66:
                
                Ejercicio66 E66 = new Ejercicio66();
                E66.Mostrar();
                
                break;
            case 72:
                
                Ejercicio72 E72=new Ejercicio72();
                E72.Primo();
                
                break;
            case 78:
                
                Ejercicio78 E78 = new Ejercicio78(); //
                E78.RecogerPalabra();
                E78.TransformacionMin();
                E78.TransformacionMayus();
                
                break;
            case 84:                             
                
                Ejercicio84 E84 = new Ejercicio84();
                E84.Caracteres();
                E84.Comparacion();
                
                break;
            case 90:
                
                Ejercicio90 E90 = new Ejercicio90("R");
                E90.Comprobante();
                
                break;
            case 96:
                                
                                
        }
    }while(Desicion != 2);
    
}
}
