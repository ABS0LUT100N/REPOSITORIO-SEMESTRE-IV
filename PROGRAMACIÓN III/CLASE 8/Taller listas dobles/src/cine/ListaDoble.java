package cine;

import java.util.Scanner;

public class ListaDoble {

    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    Persona datosPersona;
    int cantidadDatos;

    Scanner leer = new Scanner(System.in);

    public ListaDoble() {
        primero = null;
        ultimo = null;
        cantidadDatos = 0;
    }

    public void insertarPersona() {

        Nodo nodoNuevo = new Nodo();
        int edad = 0;
        int id = 0;
        int numero = cantidadDatos + 1;

        edad = (int) (Math.random() * 61 + 2);
        id = ((int) (Math.random() * 1000)) + 17080 + numero;

        System.out.println("");

        datosPersona = new Persona(edad, id);

        nodoNuevo.informacion = datosPersona;

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

        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("*Persona numero " + numero + " registrada con exito*");
        datosPersona.imprimir();
        System.out.println("-----------------------------");

    }

    public void addLastCustom() {

        Nodo nodoNuevo = new Nodo();

        int numero = cantidadDatos + 1;

        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Ingrese la identificacion de la persona: ");
        int id = leer.nextInt();
        System.out.println("Ingrese la edad de la persona que desee registrar: ");
        int edad = leer.nextInt();
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("");

        datosPersona = new Persona(edad, id);

        nodoNuevo.informacion = datosPersona;

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
        System.out.println("");
        System.out.println("*Persona numero " + numero + " registrada con exito*");
        datosPersona.imprimir();
        System.out.println("-----------------------------");
        cantidadDatos++;
    }

    public void atenderPersonaPU() {

        Nodo actual = new Nodo();

        boolean encontrado = false;
        actual = primero;

        if (actual != null) {

            while (actual != null && encontrado == false) {

                if (actual == primero) {

                    Persona personaAtendida = actual.informacion;
                    primero = primero.siguiente;

                    if (primero != null) {
                        primero.anterior = null;
                    } else {
                        ultimo = null;
                    }

                    encontrado = true;
                    cantidadDatos--;

                    calcularPrecio(personaAtendida);
                    System.out.println("Cantidad de personas restantes: " + cantidadDatos);
                }

                actual = actual.siguiente;
            }

            if (encontrado == false) {
                System.out.println("_______________________________________");
                System.out.println("");
                System.out.println("No se pudo atender a la persona.");
                System.out.println("");
                System.out.println("_______________________________________");
                mostrarListaPU();
            }

        } else {

            System.out.println("La lista esta vacia...");
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
            System.out.println("Ya se recorrio toda la lista.");
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

    public void cantidadDatosTotal() {
        System.out.println("Cantidad total de personas en la fila: " + cantidadDatos);
    }

    public double calcularPrecioTotal() {

        Nodo aux = new Nodo();
        double precio = 0;
        double canTotal = 0;

        aux = primero;

        if (aux != null) {

            while (aux != null) {

                if (aux.informacion.getEdad() >= 5 && aux.informacion.getEdad() <= 12) {

                    precio = 5000;

                } else if (aux.informacion.getEdad() >= 13 && aux.informacion.getEdad() <= 17) {

                    precio = 7000;

                } else if (aux.informacion.getEdad() >= 18 && aux.informacion.getEdad() <= 59) {

                    precio = 12000;

                } else if (aux.informacion.getEdad() >= 60) {

                    precio = 8000;
                }

                else {

                    System.out.println("Persona con el ID:" + aux.informacion.getId() + " no admitida, menor de 5 años.");

                    precio = 0;

                }

                canTotal += precio;
                aux = aux.siguiente;
            }

        }

        System.out.println("---------------------------------------");
        System.out.println("Cantidad total recaudada: $" + canTotal);
        System.out.println("---------------------------------------");

        return canTotal;
    }

    public double calcularPrecio(Persona personaPrueba) {

        double precio = 0;
        int edad = personaPrueba.getEdad();

        if (edad >= 5 && edad <= 12) {
            precio = 5000;

        } else if (edad >= 13 && edad <= 17) {
            precio = 7000;

        } else if (edad >= 18 && edad <= 59) {
            precio = 12000;

        } else if (edad >= 60) {
            precio = 8000;

        } else {
            System.out.println("----------------------------------------------------------");
            System.out.println("La persona es menor de 5 años, no puede ingresar al cine.");
            System.out.println("----------------------------------------------------------");
        }

        System.out.println("---------------------------------------");
        System.out.println("Persona atendida con exito!!");
        System.out.println(".............................");
        personaPrueba.imprimir();
        System.out.println("Precio: $" + precio);
        System.out.println(".............................");
        System.out.println("---------------------------------------");

        return precio;
    }

}
