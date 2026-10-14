package cine;

public class App {
    public static void main(String[] args) {

        Lista listaCine = new Lista();

        int random = (int) (Math.random() * 51);

        for (int i = 0; i < random; i++) {

            listaCine.addLast();

        }

        listaCine.mostrarLista();
        listaCine.calcularPrecio();
        System.out.println(listaCine.tamaño());

    }

}
