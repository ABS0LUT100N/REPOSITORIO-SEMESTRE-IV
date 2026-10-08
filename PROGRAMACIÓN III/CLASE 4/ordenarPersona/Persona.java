package ordenarPersona;
public class Persona implements Comparable<Persona> {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private double peso;
    private double altura;
    
    public Persona(int id, String nombre, String apellido, int edad, String genero, double peso, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apelllido) {
        this.apellido = apelllido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimir() {
        System.out.println("--------------------------------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("--------------------------------------------------------");
    }

    @Override
    public int compareTo(Persona persona) {
        if(id-(persona.getId())<0){return -1;}
        else if(id-(persona.getId())>0){return 1;}
        else{return 0;}

}}