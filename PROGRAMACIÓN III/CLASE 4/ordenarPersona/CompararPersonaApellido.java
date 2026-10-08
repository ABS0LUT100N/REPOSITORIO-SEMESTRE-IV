package ordenarPersona;
import java.util.Comparator;

public class CompararPersonaApellido implements Comparator<Persona> {

    int multiplicador = 1;

    public CompararPersonaApellido(boolean ascendente){

        if (ascendente){
            multiplicador = 1;
        } else { 
            multiplicador = -1;
        }
    }

    @Override 
    public int compare(Persona persona1, Persona persona2){
        return multiplicador*persona1.getApellido().compareToIgnoreCase(persona2.getApellido());
    }
    
}
