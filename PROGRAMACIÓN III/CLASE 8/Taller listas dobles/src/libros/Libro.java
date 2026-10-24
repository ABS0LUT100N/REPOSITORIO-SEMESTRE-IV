package libros;
public class Libro {

    private int id;
    private String titulo;
    private String autor;

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void imprimir() {

        System.out.println("Id: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);

    }

}
