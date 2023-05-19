/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar
 */
public class EVA3_11_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Persona perso = new Persona(18,"José","González");
           
            try {
                guardarObjetos(perso);
                Persona resu = leerObjetos();
                System.out.println("Objeto leído"+resu.toString());
               
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EVA3_11_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EVA3_11_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(EVA3_11_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public static void guardarObjetos(Persona perso) throws IOException {
        
       FileOutputStream abriArchi = new FileOutputStream("C:\\archivos\\personas.per");
       ObjectOutputStream ouStream = new ObjectOutputStream(abriArchi);
     
       ouStream.writeObject(perso);
       ouStream.close();
    }
    public static Persona leerObjetos() throws  IOException, ClassNotFoundException{
       Persona perso = null;
       FileInputStream abrirArchi = new FileInputStream("C:\\archivos\\personas.per");
       ObjectInputStream oiStream = new ObjectInputStream(abrirArchi);
       //casting
       perso = (Persona)oiStream.readObject();
       oiStream.close();
       return perso;
    }
}
    

class Persona implements Serializable{

    private int Age;
    private String name;
    private String LastName;
    
    public Persona(){
    this.Age = 0;
    this.name = "name";
    this.LastName = "LastName";
    }
    public Persona(int Age, String name, String LastName) {
            this.Age = Age;
            this.name = name;
            this.LastName = LastName;
        }
    
    }