/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_7_throw_exception;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class EVA_3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     
     */
    public static void main(String[] args){
        // TODO code application logic here
        Prueba obj = new Prueba();
        
        try {
            //checked
            //unchecked: errores de lógica, no es forzoso
            obj.capturaMayorCero(1);
            System.out.println("Introduce un valor");
            Scanner input = new Scanner (System.in);
            int valor = input.nextInt();
        } catch (Exception ex) {
            //NO ES BUENO USAR EXCEPCION YA QUE ES LA SUPER CLASE DE LAS EXCEPCIONES, VA A CAPTURAR CUALQUIER EXCEPCION
            System.out.println(ex.getMessage());
        }
        //ARITHMETIC EXCEPTION ES UNCHECKED, NO ESTAMOS OBLIGADOS A ATENDER
    try{
        
    
        obj.division(40, 0);
    }catch (ArithmeticException e){
        System.out.println(e.getMessage());
    }
    }
}

class Prueba{
    public void capturaMayorCero(int valor) throws Exception{
        if (valor<=0) //generar una excepcion
            throw new Exception(valor+" es negativo, solo se aceptan valores positivos");
        System.out.println("El valor es: "+valor);
    }
    public int division(int x, int y)throws ArithmeticException{
       if (y==0)
           throw new ArithmeticException("El valor del divisor es 0 y es invalido");
        return x/y;
    
}
}