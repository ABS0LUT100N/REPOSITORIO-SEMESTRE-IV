package arboles;
public class App {
    public static void main(String[] args) {

        Arbol arbol = new Arbol();

        arbol.insertarNodo(6, new Persona("Sonic"));
        arbol.insertarNodo(4, new Persona("Tails"));
        arbol.insertarNodo(8, new Persona("Knuckles"));
        arbol.insertarNodo(1, new Persona("Amy"));
        arbol.insertarNodo(5, new Persona("Cream"));
        arbol.insertarNodo(9, new Persona("Cheese"));

        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("IN ORDER:");
        arbol.mostrarArbolInOrder(arbol.raiz);
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("PRE ORDER:");
        arbol.mostrarArbolPreOrder(arbol.raiz);
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("POST ORDER:");
        arbol.mostrarArbolPostOrder(arbol.raiz);
        System.out.println("");
    }
}
