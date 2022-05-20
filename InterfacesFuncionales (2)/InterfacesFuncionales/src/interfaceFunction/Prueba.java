package interfaceFunction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prueba {
    
    public static String procesarArchivo(ManejoArchivos ma)throws IOException{
        try(BufferedReader br=new BufferedReader(new FileReader("texto.txt"))){
            return ma.leerArchivo(br);
        }
    }
    
    
    public static void main(String arg[]){
        
        try{
        String linea1 = procesarArchivo((BufferedReader br)-> br.readLine());
        System.out.println(linea1);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    
    }
    
}
