package libreria;

public class App {
    public static void main(String[] args) {
        
        Lista listaLibros = new Lista();

        for (int i = 0; i < 5; i++) {

            listaLibros.insertarNodo();
            
        }

        System.out.println("");
        System.out.println("------------- MODIFICACIÓN DE LIBRO -------------");
        System.out.println("");
        listaLibros.modificarLibroTitulo();
        System.out.println("");
        System.out.println("------------- ELIMINACIÓN DEL LIBRO -------------");
        System.out.println("");
        listaLibros.eliminarLibroTitulo();
        System.out.println("");
        System.out.println("------------- MOSTRAR LISTADO LIBRO -------------");
        System.out.println("");
        listaLibros.mostrarLista();
        System.out.println("");
        System.out.println("------------- MOSTRAR TAMAÑO LISTADO -------------");
        System.out.println("");
        System.out.println(listaLibros.tamaño());
    }
}
