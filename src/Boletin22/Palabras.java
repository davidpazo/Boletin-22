package Boletin22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author dpazolopez
 */
public class Palabras {
       PrintWriter pi;
    public Palabras() {
    }
    public void ordenPalab(String palabra){
    ArrayList<String> lista= new ArrayList<>();
        try{
            pi= new PrintWriter(new File(palabra));
            Scanner can= new Scanner(System.in);
            String ficha= null;
            do{
                palabra= can.nextLine();
                lista.add(palabra);
                Collections.sort(lista);
            }while(!"fin".equals(palabra));
            pi.println(lista);
        } catch (FileNotFoundException ex) {
            System.err.println("Error inesperado");
        }
        finally{
            pi.close();
        }
            
    }
}
