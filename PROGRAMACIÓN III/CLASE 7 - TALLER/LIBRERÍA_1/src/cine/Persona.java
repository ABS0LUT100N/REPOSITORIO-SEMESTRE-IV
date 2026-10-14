package cine;

public class Persona {

    private int edad;
    private int id;

    public Persona(int edad, int id) {
        this.edad = edad;
        this.id = id;
    }

    public Persona() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void imprimir() {

        System.out.println("-----------------------------------");
        System.out.println("Edad de la persona: " + edad);
        System.out.println("ID de la persona: " + id);
        System.out.println("-----------------------------------");
    }

}
