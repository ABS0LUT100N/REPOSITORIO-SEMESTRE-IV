package arboles;
public class Persona {
    

    private String nombre;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir(){

        System.out.println("Nombre: " + nombre);
    }
    

    
}
