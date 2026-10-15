package cine;


public class Lista {

    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    Persona datosPersona;
    int cantidadDatos;
    double precio;
    double canTotal;

    public Lista() {
        primero = null;
        ultimo = null;
        cantidadDatos = 0;
    }

    // pilas queue
    public void addLast() {

        Nodo nuevo = new Nodo();

        int numero = cantidadDatos + 1;
        int edad = (int) (Math.random() * 56 + 5);
        int id = ((int) (Math.random() * 1000)) + 10000;
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Generando persona número: " + numero);
        System.out.println("");
        System.out.println("---------------------------------------");

        System.out.println("");

        datosPersona = new Persona(edad, id);

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

        cantidadDatos++;
    }

    public double calcularPrecio() {

        Nodo aux = new Nodo();

        aux = primero;

        if (aux != null) {

            while (aux != null) {

                if (aux.persona.getEdad() >= 5 && aux.persona.getEdad() <= 10) {

                    precio = 1;

                } else if (aux.persona.getEdad() >= 11 && datosPersona.getEdad() <= 18) {

                    precio = 2.5;

                } else if (aux.persona.getEdad() >= 18) {

                    precio = 3.5;

                } else {
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

}
