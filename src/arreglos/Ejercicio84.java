/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio84 {
     
    private char[] Cadena= new char[10];
    private char[] Cadena2= new char[10];
    private int Tamaño;

  public void Caracteres(){ //Recolecta las cadenas de caracteres

      System.out.println("Escriba el tamaño de ambas cadenas de caracteres");
      Scanner Sd0= new Scanner(System.in);
      Tamaño=Sd0.nextInt();
      
      System.out.println("La primera cadena");
      for (int i=0; i< Tamaño;i++){
          System.out.println(i+" Caracter");
          Scanner Palabra1 = new Scanner(System.in);
          Cadena[i] = Palabra1.next().charAt(0);
      }
      
      System.out.println("La segunda cadena");
      for (int i=0; i< Tamaño;i++){
          System.out.println(i+" Caracter");
          Scanner Palabra2 = new Scanner(System.in);
          Cadena2[i] = Palabra2.next().charAt(0);
          
      }
  }

    public void Comparacion(){//Metodo para mirar si una cadena es parecida a la otra
        
        int aux=0;
        
        for (int i=0; i< Tamaño; i++){
        if (Cadena[i] == Cadena2[i]){
         
        aux++;

        }
    }
        if (Tamaño == aux){
            System.out.println("La cadena de caracteres es igual");
        }else {
            if(Tamaño != aux){
                System.out.println("La cadena de caracteres NO es igual");
            }
        }
    }
}
