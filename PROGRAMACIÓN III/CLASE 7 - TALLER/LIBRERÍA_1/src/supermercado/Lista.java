package supermercado;

import java.util.Scanner;

public class Lista {

    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    Producto datosProducto;
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
        System.out.println("-----------------------------------");
        System.out.println("Creando un nuevo producto...");
        System.out.println("-----------------------------------");
        System.out.println("");

        int numprod = cantidadDatos + 1;
        String nombre = "Producto " + numprod;
        int cantidad = (int) (Math.random() * 21);
        double precio = (double) (Math.random() * 1001);
        double preciored = Math.round(precio * 100.0);

        datosProducto = new Producto(nombre, cantidad, preciored);
        nuevoNodo.producto = datosProducto;

        datosProducto.imprimir();

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
        System.out.println("Producto registrado con éxito!");
        System.out.println("---------------------------------------");
        System.out.println("");

        cantidadDatos++;

    }

    public double calcularPrecio() {

        double canTotal = 0;

        Nodo aux = new Nodo();

        aux = primero;

        if (aux != null) {

            while (aux != null) {

                canTotal += aux.producto.getPrecio();
                aux = aux.siguiente;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Total: $" + canTotal);
        System.out.println("---------------------------------------");

        System.out.println("");
        System.out.println(" ************* GRACIAS POR SU COMPRA ************* ");
        System.out.println("");
        return canTotal;
    }

    public void mostrarLista() {

        Nodo aux = new Nodo();

        aux = primero;

        System.out.println("");
        System.out.println(" **************** RECIBO **************** ");
        System.out.println("");
        if (aux != null) {

            while (aux != null) {

                aux.producto.imprimir();
                aux = aux.siguiente;

            }

        } else {

            System.out.println("---------------------------------------");
            System.out.println("Lista vacía!");
            System.out.println("---------------------------------------");
        }

    }

}
