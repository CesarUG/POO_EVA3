
package com.mycompany.eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
       //SON TODAS DE RUNTIMEEXCEPTION
        
       //Arithmetic Exception
       //Dividir entre cero
      
        System.out.println("ININCIANDO PROGRAMA");
       int x = 5, y=0;
        System.out.println("Inicializando variables");
       int resu = x/y;
        System.out.println("Calculando división");
        System.out.println("División ="+resu);
        
       
       //InputMismatchException
       Scanner input = new Scanner(System.in);
        System.out.println("Introudce un número");
        int num = input.nextInt();
        System.out.println("Tu número es: "+ num);
       
       
       //INDEXOUTOFBOUNDS EXCEPTION
       int[] arreglo = new int [5]; // 0-(n-1)
       
      arreglo[0]= 100;
      arreglo[1]= 200;
      arreglo[2]= 300;
      arreglo[3]= 400;
      arreglo[4]= 500;
      arreglo[5]= 600;// error de lógica
      
     
       //NULLPOINTER EXCEPTION
       Prueba objPrueba = null;
        System.out.println("Valor de x = " +objPrueba.x);
    }
   
}

class Prueba{
 public int x =100;
}