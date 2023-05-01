/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
        int x,y;
        
        do{
          try{
              Scanner sc = new Scanner(System.in);
              System.out.println("Introduce el valor de (entero) x: ");
               x = sc.nextInt();
              System.out.println("Introduce el valor de (entero) y: ");
              y= sc.nextInt();
              int resu = x/y;
              System.out.println("El resultado de la división de "+ x + "/" + y + " es igual a: " + resu);
             break;
              }catch(InputMismatchException e){
                  System.out.println("La captura es incorrecta: "+ e.getMessage());
              }catch(ArithmeticException e){
                  System.out.println("No se puede dividir entre cero: "+ e.getMessage());
              }
       }while(true);
        
        System.out.println("PROGRAMA TERMINADO CON EXITO");
        
    }
}
