package cine;

public class Persona {
    
    private int id;
    private int edad;
    
    public Persona(int edad, int id) {
        this.id = id;
        this.edad = edad;
    }

    public Persona() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimir(){

        System.out.println("");
        System.out.println("ID: " + id);
        System.out.println("Edad: " + edad);
        System.out.println("");

    }

    
}
