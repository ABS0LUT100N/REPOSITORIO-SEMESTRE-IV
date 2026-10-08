package ordenarPersona;

import java.util.Comparator;

public class CompararPersonaNombre implements Comparator<Persona>{

    int multiplicador=1;

    public CompararPersonaNombre(boolean ascendente){
        if(ascendente){
            multiplicador=1;
        }else{
            multiplicador=-1;
        }
    }
    @Override 
    public int compare(Persona persona1, Persona persona2){
        return multiplicador*persona1.getNombre().compareToIgnoreCase(persona2.getNombre());
    }
    
}