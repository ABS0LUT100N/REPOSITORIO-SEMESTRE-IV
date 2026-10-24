package cine;

public class App {

    public static void main(String[] args) {
        

    ListaDoble listaCine = new ListaDoble();
    
        int random = (int) (Math.random() * 11);

        for (int i = 0; i < random; i++) {

            listaCine.insertarPersona();

        }

        System.out.println("");
        System.out.println(" * * * * * * * * * añadir persona al final * * * * * * * * * ");
        System.out.println("");
        listaCine.addLastCustom();
        System.out.println("");
        System.out.println(" * * * * * * * * * atender primera persona * * * * * * * * * ");
        System.out.println("");
        listaCine.atenderPersonaPU();
        System.out.println("");
        System.out.println(" * * * * * * * * * mostrar lista inicio - final * * * * * * * * * ");
        System.out.println("");
        listaCine.mostrarListaPU();
        System.out.println("");
        System.out.println(" * * * * * * * * * mostrar lista final - inicio * * * * * * * * * ");
        System.out.println("");
        listaCine.mostrarListaUP();
        System.out.println("");
        System.out.println(" * * * * * * * * * cantidad de personas en la fila * * * * * * * * * ");
        System.out.println("");
        listaCine.cantidadDatosTotal();
        System.out.println("");
        System.out.println(" * * * * * * * * * cantidad de dinero recaudado * * * * * * * * * ");
        System.out.println("");
        listaCine.calcularPrecioTotal();


    }
    
}
