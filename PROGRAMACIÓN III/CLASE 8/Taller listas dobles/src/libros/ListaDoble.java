package libros;
import java.util.Scanner;

public class ListaDoble {

    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    Libro datosLibro;
    int cantidadDatos;

    Scanner leer = new Scanner(System.in);

    public ListaDoble() {
        primero = null;
        ultimo = null;
        cantidadDatos = 0;
    }

    public void insertarLibro(Libro informacion) {

        Nodo nodoNuevo = new Nodo();
        nodoNuevo.informacion = informacion;

        if (primero == null) {
            primero = nodoNuevo;
            primero.siguiente = null;
            primero.anterior = null;
            ultimo = nodoNuevo;
        } else {
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            nodoNuevo.anterior = ultimo;
            ultimo = nodoNuevo;
        }
        cantidadDatos++;
    }

    public void addLast() {
        Nodo nodoNuevo = new Nodo();

        System.out.println("Digite el titulo del libro: ");
        String titulo = leer.nextLine().trim();
        System.out.println("Digite el id de " + titulo + ": ");
        int id = leer.nextInt();
        leer.nextLine();
        System.out.println("Digite su autor de " + titulo + ": ");
        String autor = leer.nextLine();

        // limpiar el buffer

        datosLibro = new Libro(id, titulo, autor);

        nodoNuevo.informacion = datosLibro;

        if (ultimo == null) {
            ultimo = nodoNuevo;
            ultimo.siguiente = null;
            ultimo.anterior = null;
            ultimo = nodoNuevo;
        } else {
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            nodoNuevo.anterior = ultimo;
            ultimo = nodoNuevo;
        }
        System.out.println("-----------------------------");
        System.out.println("*Libro registrado con exito*");
        System.out.println("-----------------------------");
        mostrarListaPU();
        cantidadDatos++;
    }

    public void buscarLibroPU() {

        Nodo aux = new Nodo();

        System.out.println("Digite el id a buscar");
        int id = leer.nextInt();

        boolean encontrado = false;
        aux = primero;

        int posicion = 0;

        if (aux != null) {
            while (aux != null && encontrado == false) {

                posicion++;

                if (aux.informacion.getId() == id) {
                    encontrado = true;
                    System.out.println("libro encontrado en la posicion: " + posicion);
                    System.out.println("-----------------------------");
                    aux.informacion.imprimir();
                    System.out.println("-----------------------------");
                }

                aux = aux.siguiente;
            }

            System.out.println("");
            System.out.println("Ya se recorrio toda la lista");
            if (encontrado == false) {
                System.out.println("No se encontro el nodo solicitado");
            }
        } else {
            System.out.println("La lista esta vacia");
        }
        System.out.println("");
    }

    public void modificarLibroId() {
        Nodo aux = new Nodo();

        int id;
        System.out.println("");
        System.out.println("Digite la id del libro a modificar: ");
        id = leer.nextInt();

        leer.nextLine();

        boolean encontrado = false;

        aux = primero;

        if (aux != null) {
            while (aux != null) {
                if (aux.informacion.getId() == id) {
                    encontrado = true;
                    System.out.println("-------------------------------");
                    System.out.println("*Libro encontrado:*");
                    System.out.println();
                    aux.informacion.imprimir();
                    System.out.println("");
                    System.out.println("Digite la informacion a modificar");
                    System.out.print("Titulo: ");
                    aux.informacion.setTitulo(leer.nextLine());
                    System.out.println("-------------------------------");
                    System.out.println("*Libro actualizado con exito:*");
                    System.out.println("-------------------------------");
                    aux.informacion.imprimir();
                    System.out.println("-------------------------------");
                }
                aux = aux.siguiente;
            }
            if (encontrado == false) {
                System.out.println("No se encontro la edad");
                System.out.println("Ya se recorrio toda la lista");
                System.out.println("-------------------------------");

                mostrarListaPU();
                System.out.println("");
            }

        } else {
            System.out.println("La lista esta vacia");
            System.out.println("");
        }
    }

    public void eliminarLibroPU() {

        Nodo actual = new Nodo();
        Nodo anterior = new Nodo();
        Nodo siguiente = new Nodo();

        System.out.println("Diguite el Id del libro a borrar");
        int id = leer.nextInt();

        boolean encontrado = false;

        actual = primero;

        if (actual != null) {
            while (actual != null && encontrado == false) {

                if (actual.informacion.getId() == id) {

                    if (actual == primero) {
                        primero = primero.siguiente;
                        primero.anterior = null;
                    } else if (actual == ultimo) {
                        anterior.siguiente = null;
                        ultimo = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;
                        siguiente.anterior = actual.anterior;
                    }
                    encontrado = true;
                    System.out.println("-------------------------------");
                    System.out.println("Nodo borrado con exito");
                    System.out.println("-------------------------------");
                    cantidadDatos--;
                }
                anterior = actual;
                actual = actual.siguiente;
                siguiente = actual.siguiente;
            }

            if (encontrado == false) {
                System.out.println("No se encontro el nodo solicitado");
                mostrarListaPU();
            }
        } else {
            System.out.println("La lista esta vacia");
        }
        System.out.println("");
    }

    public void mostrarListaPU() {
        Nodo aux = new Nodo();
        aux = primero;

        if (aux != null) {
            while (aux != null) {

                aux.informacion.imprimir();
                System.out.println("------------------------------------------");
                aux = aux.siguiente;
            }
            System.out.println("");
            System.out.println("Ya se recorrio toda la lista");
        } else {
            System.out.println("La lista esta vacia");
            System.out.println("");
        }
    }

    public void mostrarListaUP() {

        Nodo aux = new Nodo();
        aux = ultimo;

        if (aux != null) {
            while (aux != null) {

                aux.informacion.imprimir();
                System.out.println("------------------------------------------");
                aux = aux.anterior;

            }
            System.out.println("");
            System.out.println("Ya se recorrio toda la lista");
        } else {
            System.out.println("La lista esta vacia");
            System.out.println("");
        }

    }

    public void cantidadDatosTotal(){
        System.out.println("Cantidad total de libros registrados: " + cantidadDatos);
    }

}
