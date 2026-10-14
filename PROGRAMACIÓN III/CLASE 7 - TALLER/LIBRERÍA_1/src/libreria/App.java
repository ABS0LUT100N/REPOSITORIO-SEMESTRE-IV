package libreria;

public class App {
    public static void main(String[] args) {
        
        Lista listaLibros = new Lista();

        for (int i = 0; i < 1; i++) {

            listaLibros.insertarNodo();
            
        }

        System.out.println("------------- MODIFICACIÓN DE LIBRO -------------");
        listaLibros.modificarLibroTitulo();
        System.out.println("------------- ELIMINACIÓN DEL LIBRO -------------");
        listaLibros.eliminarLibroTitulo();
        System.out.println("------------- MOSTRAR LISTADO LIBRO -------------");
        listaLibros.mostrarLista();
        System.out.println("------------- MOSTRAR TAMAÑO LISTADO -------------");
        System.out.println(listaLibros.tamaño());
    }
}
