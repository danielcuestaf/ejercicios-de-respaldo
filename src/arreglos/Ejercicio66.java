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
public class Ejercicio66 {

    /**
     *
     */
    //Atributos de la clase
    private int [][] matriz = {{5,6,13},{14,2,4},{21,7,6}};
    
    //Recorre todo el arreglo con un for para mostrarlo
    public void Mostrar(){
       
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              
                System.out.println("La posicion ["+(i+1)+"]"+"["+(j+1)+"] hay : "+matriz[i][j]);
            }
        }
    }
    /*Por ser una producto de escalar por un vector se multiplica posicion 
    a posicion y lo guarda en otra matriz*/
    
    public void Producto(){
        
    int[][] matrizProducto= new int[3][3];
        
    for (int i=0; i < 3; i++){
        for (int j=0; j < 3; j++){
        
         matrizProducto[i][j]= 2*matriz[i][j];
        
     }
   }
   
   for (int i=0; i < 3; i++){
   for (int j=0; j < 3; j++){
        
       System.out.println("El valor en la posicion ["+(i+1)+"]"+"["+(j+1)+"] es :"+ matrizProducto[i][j]); 
       
    }
}
   
}
}
