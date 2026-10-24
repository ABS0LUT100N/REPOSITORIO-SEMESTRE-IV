package libros;
public class App {
    public static void main(String[] args) throws Exception {

        ListaDoble listaDoble = new ListaDoble();
        
           listaDoble.insertarLibro(new Libro(1, "El principito", "Antoine de Saint-Exupéry"));
           listaDoble.insertarLibro(new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes"));
           listaDoble.insertarLibro(new Libro(3, "Harry Potter y la piedra filosofal", "J. K. Rowling"));
           listaDoble.insertarLibro(new Libro(4, "El principito", "Antoine de Saint-Exupéry"));
           listaDoble.insertarLibro(new Libro(5, "1984", "George Orwell")); 
        
       

        listaDoble.addLast();
        listaDoble.buscarLibroPU();
        listaDoble.modificarLibroId();
        listaDoble.eliminarLibroPU();
        System.out.println("---------Lista Primero a ultimo-----------");
        listaDoble.mostrarListaPU();
        System.out.println("---------Lista Ultimo a Primero-----------");
        listaDoble.mostrarListaUP();
        System.out.println("------------------------------------------");
        listaDoble.cantidadDatosTotal();
        System.out.println("------------------------------------------");

    }
}
