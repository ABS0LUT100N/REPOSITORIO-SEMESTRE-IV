package listas;

public class app {

    public static void main(String[] args) {
        
        Lista listaPersonas = new Lista();

        for (int i = 0 ; i < 2 ; i++) {

            listaPersonas.insertarNodo();
            
        }

         listaPersonas.mostrarLista();
         System.out.println(listaPersonas.tamaño());

         listaPersonas.buscarNodoEdad();

    }
}