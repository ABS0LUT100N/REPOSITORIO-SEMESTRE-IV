public class App {
    public static void main(String[] args) throws Exception {
        ListaDoble lista = new ListaDoble();

        int num = (int)(Math.random()*4+1);

        for (int i = 0; i < num; i++) {

            System.out.println("");
            lista.insertarNodo();
            System.out.println("");
            
        }

        
        lista.mostrarListaPU();
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        lista.mostrarListaUP();
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        lista.buscarNodoPU();
        System.out.println("");
        System.out.println("-----------------------------");
        lista.modificarNodo();


    }
}
