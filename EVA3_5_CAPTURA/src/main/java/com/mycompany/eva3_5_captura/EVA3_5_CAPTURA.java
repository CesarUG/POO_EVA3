/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class EVA3_5_CAPTURA {

    public static void main(String[] args) {
        int x;
        
        do{
           try{ 
              Scanner sc = new Scanner(System.in);
              System.out.println("Introduce el valor de (entero) x: ");
              x = sc.nextInt();
              break;
             }catch(InputMismatchException e){
               System.out.println("No se introdujo un número válido, vuelve a capturar");
             }
         }while(true);
        System.out.println("Valor de x = "+ x);
        
    }
}
