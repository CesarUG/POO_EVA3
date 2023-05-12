/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exceptions;


/**
 *
 * @author Cesar
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
                
        Persona perso2 = new Persona();
        try{
        perso2.setAge(-10);
        }catch(DatoEntradaCheckedEx e){
            System.out.println(e.getMessage());
        }
        
    }
    
}


class Persona{
 private String name;
 private String LastName;
 private int Age;

    public Persona() {
        this.name = "----";
        this.LastName = "----";
        this.Age = 0;
    }

    public Persona(String name, String LastName, int Age)throws DatoEntradaCheckedEx {
        this.name = name;
        this.LastName = LastName;
        setAge(Age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) throws DatoEntradaCheckedEx  {
        if (Age< 0) 
            throw new DatoEntradaCheckedEx();
        this.Age = Age;
    }
    
}

class DatoEntradaException extends RuntimeException{

    public DatoEntradaException(){
         super("Dato de entrada incorrecto!! El valor debe de ser positivo");
         
    }
}    


class DatoEntradaCheckedEx extends Exception{
    
    public DatoEntradaCheckedEx(){
         super("Dato de entrada incorrecto!! El valor debe de ser positivo");
         }
}
    
    

