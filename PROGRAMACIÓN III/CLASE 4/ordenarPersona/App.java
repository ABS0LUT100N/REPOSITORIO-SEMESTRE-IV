package ordenarPersona;
import java.util.Arrays;

public class App{

    public static void main(String[] args) {
        
        Persona[] listaPersona = new Persona [5];

        listaPersona[0] = new Persona(1, "Jotaro", "Kujoh", 17, "Masculino", 70.0, 1.85);
        listaPersona[1] = new Persona(3, "Joseph", "Joestar", 70, "Masculino", 75.0, 1.80);
        listaPersona[2] = new Persona(2, "Dio", "Brando", 30, "Masculino", 80.0, 1.90);
        listaPersona[3] = new Persona(5, "Jolyne", "Cujoh", 19, "Femenino", 60.0, 1.70);
        listaPersona[4] = new Persona(4, "Josuke", "Higashikata", 16, "Masculino", 65.0, 1.75);
    
     System.out.println("Lista de personas sin ordenar:");
    for(Persona persona : listaPersona) {
       persona.imprimir();
    }

        Arrays.sort(listaPersona);
        System.out.println("Lista de personas ordenadas por ID:");
        for(Persona persona : listaPersona) {
            persona.imprimir();
    }

        Arrays.sort(listaPersona, new CompararPersonaApellido(true));
        System.out.println("Lista de personas ordenadas por apellidos:");
        for(Persona persona: listaPersona){
            persona.imprimir();
        }

        Arrays.sort(listaPersona, new CompararPersonaNombre(false));
        System.out.println("Lista de personas ordenadas por nombres:");
        for(Persona persona: listaPersona){
            persona.imprimir();}

             Arrays.sort(listaPersona, new CompararPersonaPeso(false));
        System.out.println("Lista de personas ordenadas por peso:");
        for(Persona persona: listaPersona){
            persona.imprimir();
        }
   

        }



}



    
    

