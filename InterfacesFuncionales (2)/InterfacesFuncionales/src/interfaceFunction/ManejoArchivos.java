package interfaceFunction;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface ManejoArchivos {
    
    public String leerArchivo(BufferedReader br)throws IOException;
    
    
}
