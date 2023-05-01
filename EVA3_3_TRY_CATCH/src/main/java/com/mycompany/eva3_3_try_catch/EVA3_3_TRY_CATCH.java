/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_try_catch;


/**
 *
 * @author Cesar
 */
public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
     int x = 5,  y =0;
     try{//BLOQUE DE CÓDIGO QUE PUEDE GENERAR UNA EXCEPCIÓN 
        int resu = x/y;
        System.out.println("El resultado es = "+resu );
     }catch(ArithmeticException e){
         //BLOQUE DE CÓDIGO QUE CAPTURA Y ATIENDE LA EXCEPCIÓN
         System.out.println("Excepción:"+e.getMessage());
     }
        System.out.println("Fin del programa");
    }
}
