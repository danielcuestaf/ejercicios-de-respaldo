/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simples;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio12 {  
    //Atributos de la clase
        private int a;
        private int b;
        private int c;
        
    //Constructor por defecto
    public Ejercicio12(){
        
    }
    
    //Constructor en caso de necesitarlo, es decir dentro del main no lo uso 
    public Ejercicio12(int _a,int _b,int _c){
        a=_a;
        b=_b;
        c=_c;
    }
        
    public void Recoleccion(){   //Recolecta los valores de a,b,c
     
        System.out.println("La expresion que vamos a calcular es: ");
        System.out.println("(a+7*c)/(b+2-a)+2*b");
        
        System.out.println("Ingrese el valor de ´a´");
        Scanner X= new Scanner(System.in);
        a =X.nextInt();
        
        System.out.println("Ingrese el valor de ´b´");
        Scanner X1= new Scanner(System.in);
        b =X1.nextInt();
        
        System.out.println("Ingrese el valor de ´c´");
        Scanner X2= new Scanner(System.in);
        c =X2.nextInt();
    }
    
    public void Valor(){ //Imprime el resultado de la operacion matematica
        
        float Expresion = (a+7*c)/(b+2-a)+2*b;
        System.out.println("El valor de la expresion es: "+ Expresion);
    }
}
