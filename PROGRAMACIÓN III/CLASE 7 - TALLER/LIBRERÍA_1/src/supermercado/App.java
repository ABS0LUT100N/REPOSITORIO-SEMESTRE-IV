package supermercado;

public class App {

    public static void main(String[] args) {

        Lista listaProducto = new Lista();

        int random = (int) (Math.random() * 8 + 1);

        for (int i = 0; i < random; i++) {

            listaProducto.insertarNodo();

        }

        listaProducto.mostrarLista();
        listaProducto.calcularPrecio();

    }
}