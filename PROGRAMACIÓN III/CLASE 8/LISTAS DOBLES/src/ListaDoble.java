import java.util.Scanner;

public class ListaDoble {

    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    int cantidadDatos;

    Scanner leer = new Scanner(System.in);

    public ListaDoble() {
        primero = null;
        ultimo = null;
        cantidadDatos = 0;
    }

    public void insertarNodo() {

        Nodo nodoNuevo = new Nodo();

        System.out.println("Digite un numero a guardar: ");
        int numero = leer.nextInt();

        nodoNuevo.informacion = numero;

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

        System.out.println("");
        System.out.println("Informacion registrada con exito.");
        System.out.println("");
        System.out.println("-------------------------------------------");

        cantidadDatos++;

    }

    public void mostrarListaPU() {

        Nodo aux = new Nodo();

        aux = primero;

        if (aux != null) {

            while (aux != null) {
                System.out.print(aux.informacion + " ");
                aux = aux.siguiente;
            }

            System.out.println("");
            System.out.println("Ya se recorrió toda la lista.");
            System.out.println("");

        } else {
            System.out.println("La lista está vacía.");
        }
    }

    public void mostrarListaUP() {

        Nodo aux = new Nodo();

        aux = ultimo;

        if (aux != null) {

            while (aux != null) {
                System.out.print(aux.informacion + " ");
                aux = aux.anterior;
            }

            System.out.println("Ya se recorrió toda la lista.");

        } else {
            System.out.println("La lista está vacía.");
        }
    }

    public void buscarNodoPU() {

        Nodo aux = new Nodo();

        System.out.println("Digite el numero a buscar:");
        int numero = leer.nextInt();

        boolean encontrado = false;

        aux = primero;
        int posicion = 0;

        if (aux != null) {

            while (aux != null && encontrado == false) {

                posicion++;

                if (aux.informacion == numero) {

                    encontrado = true;
                    System.out.println("Nodo encontrado en la posición:" + posicion);
                    System.out.println(aux.informacion);

                }
                aux = aux.siguiente;
            }

            if (encontrado == false) {

                System.out.println("-----------------------------------");
                System.out.println("");
                System.out.println("No se encontró la información.");
                System.out.println("");
                System.out.println("-----------------------------------");

                mostrarListaPU();
            }

        } else {
            System.out.println("La lista está vacía.");
        }

    }

    public void modificarNodo() {

        Nodo aux = new Nodo();

        System.out.println("Digite el numero a modificar:");
        int numero = leer.nextInt();

        boolean encontrado = false;

        aux = primero;

        if (aux != null) {

            while (aux != null && encontrado == false) {

                if (aux.informacion == numero) {

                    encontrado = true;
                    System.out.println("");
                    System.out.println("Nodo encontrado!");
                    System.out.println("");
                    System.out.print("Informacion actual: ");
                    System.out.println(aux.informacion);

                    System.out.println("");
                    System.out.println("***********************");

                    System.out.println("");
                    System.out.println("Ingrese la nueva informacion: ");
                    aux.informacion = leer.nextInt();
                    System.out.println("");

                    System.out.println("Nodo actualizado con exito!");
                    System.out.println(aux.informacion);

                }
                aux = aux.siguiente;
            }

            if (encontrado == false) {

                System.out.println("-----------------------------------");
                System.out.println("");
                System.out.println("No se encontró la información.");
                System.out.println("");
                System.out.println("-----------------------------------");

                mostrarListaPU();
            }

        } else {
            System.out.println("La lista está vacía.");
        }

    }

    public void eliminarNodoPU() {

        Nodo actual = new Nodo();
        Nodo anterior = new Nodo();
        Nodo siguiente = new Nodo();

        System.out.println("Digite el numero a borrar: ");
        int numero = leer.nextInt();

        boolean encontrado = false;

        actual = primero;

        if (actual != null) {

            while (actual != null && encontrado == false) {

                if (actual.informacion == numero) {

                    encontrado = true;

                    if (actual == primero) {

                        primero = primero.siguiente;
                        primero.anterior = null;

                    } else if (actual == primero) {

                        anterior.siguiente = null;
                        ultimo = anterior;

                    } else {
                        anterior.siguiente = actual.siguiente;
                        siguiente.anterior = actual.anterior;
                    }

                    encontrado = true;
                    System.out.println("Nodo borrado con exito.");
                    mostrarListaPU();
                    cantidadDatos--;

                }
                anterior = actual;
                actual = actual.siguiente;
                siguiente = actual.siguiente;
            }

            if (encontrado == false) {

                System.out.println("-----------------------------------");
                System.out.println("");
                System.out.println("No se encontró la información.");
                System.out.println("");
                System.out.println("-----------------------------------");

                mostrarListaPU();
            }

        } else {
            System.out.println("La lista está vacía.");
        }

    }

    public int size() {
        return cantidadDatos;
    }

}
