package listas;

public class Persona{

    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimir(){

        System.out.println("---------------------------------------");
        System.out.println("Id:"+ id);
        System.out.println("Nombre:"+ nombre);
        System.out.println("Edad" + edad);
        System.out.println("---------------------------------------");

    }

}