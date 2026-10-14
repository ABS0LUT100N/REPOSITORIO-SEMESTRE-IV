package listas;

import java.util.Scanner;

public class Lista {

    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    Persona datosPersona;
    int cantidadDatos;

    Scanner leer = new Scanner(System.in);

    public Lista() {
        primero = null;
        ultimo = null;
        cantidadDatos = 0;
    }

    public void insertarNodo() {

        Nodo nuevoNodo = new Nodo();

        System.out.println("");
        System.out.println("Recorriendo lista...");
        System.out.println("");

        System.out.println("");
        System.out.println("---------------------------------------");

        System.out.println("Digite el nombre de la persona: ");
        String nombre = leer.nextLine().trim();

        System.out.println("---------------------------------------");
        System.out.println("Digite el ID de " + nombre + ":");
        int id = leer.nextInt();

        System.out.println("---------------------------------------");
        System.out.println("Digite la edad de " + nombre + ":");
        int edad = leer.nextInt();

        leer.nextLine();

        datosPersona = new Persona(id, nombre, edad);

        nuevoNodo.persona = datosPersona;

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
        System.out.println("persona registrada con éxito!");
        System.out.println("---------------------------------------");
        System.out.println("");

        cantidadDatos++;

    }

    public void mostrarLista() {

        Nodo aux = new Nodo();

        aux = primero;

        if (aux != null) {

            while (aux != null) {

                aux.persona.imprimir();
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
        return cantidadDatos;
    }


    public void buscarNodoNombre() {

        Nodo aux = new Nodo();

        String nombre;
        System.out.println("Digite el nombre a buscar: ");
        nombre = leer.nextLine();

        boolean encontrado = false;

        aux = primero;

        if (aux != null) {
            while (aux != null) {
                if (aux.persona.getNombre().equalsIgnoreCase(nombre.trim())) {
                    encontrado = true;
                    System.out.println("Persona encontrada:");
                    aux.persona.imprimir();
                    System.out.println("");
                }
                aux = aux.siguiente;
            }
            if (encontrado == false) {
                System.out.println("No se encontro el nombre");
                System.out.println("Ya se recorrio toda la lista");

                mostrarLista();
                System.out.println("");
            }

        } else {
            System.out.println("La lista esta vacia");
            System.out.println("");
        }
    }

    public void buscarNodoEdad() {

        Nodo aux = new Nodo();

        int edad;
        System.out.println("Digite la edad a buscar: ");
        edad = leer.nextInt();

        boolean encontrado = false;

        aux = primero;

        if (aux != null) {
            while (aux != null) {
                if (aux.persona.getEdad() == edad) {
                    encontrado = true;
                    System.out.println("Edad encontrada:");
                    aux.persona.imprimir();
                    System.out.println("");
                }
                aux = aux.siguiente;
            }
            if (encontrado == false) {
                System.out.println("No se encontro la edad");
                System.out.println("Lista recorrida");

                mostrarLista();
                System.out.println("");
            }

        } else {
            System.out.println("La lista esta vacia");
            System.out.println("");
        }
    }

    public void modificarNodoID() {

        Nodo aux = new Nodo();

        int id;
        System.out.println("Digite el ID a modificar: ");
        id = leer.nextInt();

        boolean encontrado = false;

        aux = primero;

        if (aux != null) {
            while (aux != null) {
                if (aux.persona.getId() == id) {
                    encontrado = true;
                    System.out.println("Persona encontrada:");
                    aux.persona.imprimir();
                    System.out.println("");

                    System.out.println("Digite la información a modificar:");
                    System.out.println("Nombre:");
                    aux.persona.setNombre(leer.nextLine());
                    System.out.println("Edad:");
                    aux.persona.setEdad(leer.nextInt());
                    leer.nextLine();
                    System.out.println("");
                    System.out.println("Nodo actualizado con éxito.");
                    aux.persona.imprimir();

                }
                aux = aux.siguiente;
            }
            if (encontrado == false) {
                System.out.println("No se encontro el nombre");
                System.out.println("Ya se recorrio toda la lista");

                mostrarLista();
                System.out.println("");
            }

        } else {
            System.out.println("La lista esta vacia");
            System.out.println("");
        }
    }

    public void eliminarNodoID() {

        Nodo actual = new Nodo();
        Nodo anterior = new Nodo();

        int edad;
        System.out.println("Digite el ID a buscar: ");
        edad = leer.nextInt();

        boolean encontrado = false;

        actual = primero;

        if (actual != null) {
            while (actual != null) {
                if (actual.persona.getEdad() == edad) {
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
                    cantidadDatos--;

                }
                actual = actual.siguiente;
            }
            if (encontrado == false) {
                System.out.println("No se encontro la edad");
                System.out.println("Lista recorrida");

                mostrarLista();
                System.out.println("");
            }

        } else {
            System.out.println("La lista esta vacia");
            System.out.println("");
        }
    }

    // filas
    public void addFirst() {

        Nodo nodonuevo = new Nodo();

        System.out.println("Digite el nombre de la persona: ");
        String nombre = leer.nextLine().trim();

        System.out.println("---------------------------------------");
        System.out.println("Digite el ID de " + nombre + ":");
        int id = leer.nextInt();

        System.out.println("---------------------------------------");
        System.out.println("Digite la edad de " + nombre + ":");
        int edad = leer.nextInt();

        leer.nextLine();

        datosPersona = new Persona(id, nombre, edad);

        nodonuevo.persona = datosPersona;

        if (primero == null) {
            primero = nodonuevo;
            primero.siguiente = null;
            ultimo = nodonuevo;
        }

        else {

            primero.siguiente = primero;
            primero = nodonuevo;

        }

        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("persona registrada con éxito!");
        System.out.println("---------------------------------------");
        System.out.println("");

        cantidadDatos++;

    }

    // pilas queue
    public void addLast() {

        Nodo nuevo = new Nodo();

        System.out.println("Digite el nombre de la persona: ");
        String nombre = leer.nextLine().trim();

        System.out.println("---------------------------------------");
        System.out.println("Digite el ID de " + nombre + ":");
        int id = leer.nextInt();

        System.out.println("---------------------------------------");
        System.out.println("Digite la edad de " + nombre + ":");
        int edad = leer.nextInt();

        leer.nextLine(); // limpiar buffer

        datosPersona = new Persona(id, nombre, edad);

        nuevo.persona = datosPersona;

        if (primero == null) {
            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;
        }

        else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }

        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("persona registrada con éxito!");
        System.out.println("---------------------------------------");
        System.out.println("");

        cantidadDatos++;
    }
}
