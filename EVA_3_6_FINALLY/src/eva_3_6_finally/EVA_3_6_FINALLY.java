/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_6_finally;

/**
 *
 * @author Cesar
 */
public class EVA_3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 9, y = 1;
        try{
        int resu = x/y;
        System.out.println("Resultado: "+resu);
    }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
    } finally{ //obliga a la ejecucion de esta sección de código
            // es opcional
            System.out.println("Siempre me voy a ejecutar!!");
            
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
