package ordenarPersona;
import java.util.Comparator;

public class CompararPersonaPeso implements Comparator<Persona> {

    double multiplicador = 1;
    double result;

    public CompararPersonaPeso(boolean ascendente){

        if (ascendente){
            multiplicador = 1;
        } else { 
            multiplicador = -1;
        }
    }

    @Override 
    public int compare(Persona persona1, Persona persona2){

        result = multiplicador*(persona1.getPeso()-(persona2.getPeso()));

        int resultint = (int)result;
        return resultint;
    }
    
}
