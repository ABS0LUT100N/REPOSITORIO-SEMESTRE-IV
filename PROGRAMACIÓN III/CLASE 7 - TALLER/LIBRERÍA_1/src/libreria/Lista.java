package libreria;

import java.util.Scanner;

public class Lista {

    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    Libro datosLibro;
    int cantData;

    Scanner leer = new Scanner(System.in);

        public Lista() {
        primero = null;
        ultimo = null;
        cantData = 0;
    }

    public void insertarNodo() {

        Nodo nuevoNodo = new Nodo();

        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Digite el titulo del libro a registrar:");
        String titulo = leer.nextLine().trim();
        System.out.println("---------------------------------------");
        System.out.println("Digite el autor del libro '" + titulo + "': ");
        String autor = leer.nextLine().trim();
        System.out.println("---------------------------------------");
        System.out.println("Digite el año de publicación para el libro '" + titulo + "': ");
        int añoPublicacion = leer.nextInt();

        leer.nextLine();

        datosLibro = new Libro(titulo, autor, añoPublicacion);
        nuevoNodo.libro = datosLibro;

        if (primero == null) {

            primero = nuevoNodo;
            primero.siguiente = null;
            ultimo = nuevoNodo;
        }

        else {

            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = null;
            ultimo = nuevoNodo;

        }

        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Libro registrado con éxito!");
        System.out.println("---------------------------------------");
        System.out.println("");

        cantData++;

    }

    public void mostrarLista() {

        Nodo aux = new Nodo();

        aux = primero;

        if (aux != null) {

            while (aux != null) {

                aux.libro.imprimir();
                aux = aux.siguiente;

            }

            System.out.println("Ya se recorrió toda la lista!!");
        } else {

            System.out.println("---------------------------------------");
            System.out.println("Lista vacía!");
            System.out.println("---------------------------------------");
        }

    }

    public int tamaño() {

        System.out.println("---------------------------------------");
        System.out.println("Tamaño de la lista: ");
        return cantData;
    }

    public void modificarLibroTitulo() {

        Nodo aux = new Nodo();

        String titulo;
        System.out.println("Ingrese el nombre del libro que desea buscar: ");
        titulo = leer.nextLine();

        boolean encontrado = false;

        aux = primero;

        if (aux != null) {

            while (aux != null) {
                
                if (aux.libro.getTitulo() == titulo) {
                    encontrado = true;

                    System.out.println("Libro encontrado: ");
                    aux.libro.imprimir();
                    System.out.println("");

                    System.out.println("Digite la información a modificar: ");
                    System.out.println("Título: ");
                    aux.libro.setTitulo(leer.nextLine());
                    System.out.println("Nombre del autor: ");
                    aux.libro.setAutor(leer.nextLine());
                    System.out.println("Año de publicación:  ");
                    aux.libro.setAñoPublicacion(leer.nextInt());

                    leer.nextLine();
                    System.out.println("");
                    System.out.println("Nodo actualizado con éxito.");
                    aux.libro.imprimir();
                }

                aux = aux.siguiente;
            }
            if (encontrado == false) {
                System.out.println("No se encontró el libro.");
                System.out.println("Ya se recorrió toda la lista.");

                mostrarLista();
                System.out.println("");
            }
        } else {

            System.out.println("---------------------------------------");
            System.out.println("La lista está vacía.");
            System.out.println("");
            System.out.println("---------------------------------------");
        }
    }

    public void eliminarLibroTitulo() {

        Nodo actual = new Nodo();
        Nodo anterior = new Nodo();

        String titulo;
        System.out.println("Ingrese el nombre del libro a buscar: ");
        titulo = leer.nextLine();

        boolean encontrado = false;

        actual = primero;

        if (actual != null) {
            while (actual != null) {
                if (actual.libro.getTitulo() == titulo) {
                    encontrado = true;

                    if (actual == primero) {

                        primero = primero.siguiente;
                    } else if (actual == ultimo) {

                        anterior.siguiente = null;
                        ultimo = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("");
                    System.out.println("Nodo borrado con éxito");
                    System.out.println("");
                    mostrarLista();
                    cantData--;

                }

                actual = actual.siguiente;
            }

            if (encontrado == false){

                System.out.println("No se encontró el libro.");
                System.out.println("Lista recorrida.");

                mostrarLista();
                System.out.println("");
            }
        } else {


        }
    }

    public void buscarNodoTitulo() {

        Nodo aux = new Nodo();

        String titulo;
        System.out.println("Digite el título a buscar: ");
        titulo = leer.nextLine();

        boolean encontrado = false;

        aux = primero;

        if (aux != null) {
            while (aux != null) {
                if (aux.libro.getTitulo().equalsIgnoreCase(titulo.trim())) {
                    encontrado = true;
                    System.out.println("libro encontrado:");
                    aux.libro.imprimir();
                    System.out.println("");
                }
                aux = aux.siguiente;
            }
            if (encontrado == false) {
                System.out.println("No se encontró el libro.");
                System.out.println("Ya se recorrió toda la lista...");

                mostrarLista();
                System.out.println("");
            }

        } else {
            System.out.println("---------------------------------------");
            System.out.println("La lista está vacía.");
            System.out.println("");
            System.out.println("---------------------------------------");
        }

    }

}
