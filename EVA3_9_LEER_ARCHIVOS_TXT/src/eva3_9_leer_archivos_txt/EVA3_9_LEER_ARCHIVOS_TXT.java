
package eva3_9_leer_archivos_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {

    final static  String RUTA ="C:\\archivos\\Prueba.txt";
    public static void main(String[] args) {
        try{
           readUsingFiles(RUTA);//lee un archivo completo, ineficiente para archivos grandes
           readingUsignBufferedReader(RUTA);// Mejor opción para leer un texto
           readingUsingFileReader(RUTA);//Hibrido de buffered, pero ineficiente
           readUsingScanner(RUTA);//Herramienta para procesar inputs(com el teclado)
        }catch(IOException ex){
        }
        
    }
    
    /*
      Files se lee todo el contenido del archvo y 
    se transfiere a memoria principal (RAM)
    */
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("LEER ARCHIVO CON FILES");
        //CONTRUIMOS LA RUTA EN LA BASE A LA CADENA DE TEXTO
        Path path = Paths.get(ruta);
        /*List<String> todasLineas = Files.readAllLines(path);
        System.out.println("Resultado: ");
        
        for (int i = 0; i < todasLineas.size(); i++) {
            sout
        }*/
        byte [] bytes = Files.readAllBytes(path);
        System.out.println(new String (bytes));
    }
    /*
    Permite procesar archvos más grandes, ya que  lee por partes  
    En el caso de texto, nos permite procesarlo línea por línea
    
    */
    public static void readingUsignBufferedReader(String ruta)  throws  IOException{
            System.out.println("");
            System.out.println("LEER ARCHVIOS CON BUFFEREDREADER");
        File file = new File(ruta);
        FileInputStream fileInputStream = new FileInputStream(file);
        //Abre el archivo
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        //Lee el archivo
        BufferedReader bufReader = new BufferedReader(inputStreamReader);
        String linea;
        while((linea= bufReader.readLine())!= null){
            System.out.println(linea );
        }
        bufReader.close();//Cerrar el buffered
        }
    
    // No es la mejor opción para leer archivoc
    public static void readingUsingFileReader(String ruta) throws IOException{
        System.out.println("");
        System.out.println("LEER ARCHIVOS CON FILEREADER");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(fileReader);
        String linea;
        while((linea= bufReader.readLine())!= null){
            System.out.println(linea );
        }
        bufReader.close();//Cerrar el buffered
        fileReader.close();//
    }
    
    public static void readUsingScanner (String ruta) throws IOException{
        System.out.println("");
        System.out.println("LEER ARCHIVOS CON SCANNER");
      Path path = Paths.get(ruta);
      Scanner scanner = new Scanner(path);
      while(scanner.hasNextLine()){
          String linea = scanner.nextLine();
          System.out.println(linea);
      }
      scanner.close();
    }
}
