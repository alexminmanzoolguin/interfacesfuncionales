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
    
    
    public static void main(String arg[]) throws IOException{
        
       // try{
        String linea = procesarArchivo((BufferedReader br)-> br.readLine());
         FileReader fr=new FileReader("texto.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
       // }catch(IOException ex){
          //  ex.printStackTrace();
        }
    
    }
    
}
