package arboles;

public class Arbol {

    Nodo raiz;

    public Arbol() {

        this.raiz = null;

    }

    
public void insertarNodo(int id, Persona informacion) {

    Nodo nodo = new Nodo(id);
    nodo.persona = informacion;

    if (raiz == null) {
        raiz = nodo;
    } else {

        Nodo aux = raiz;

        while (aux != null) {

            nodo.padre = aux;

            if (nodo.id >= aux.id) {
                aux = aux.hijoder;
            } else {
                aux = aux.hijoizq;
            }
        }

        if (nodo.id >= nodo.padre.id) {
            nodo.padre.hijoder = nodo;
        } else {
            nodo.padre.hijoizq = nodo;
        }
    }
}


    public void mostrarArbolInOrder(Nodo nodo) {

        if (nodo != null) {

            mostrarArbolInOrder(nodo.hijoizq);
            System.out.print(nodo.id + " ");
            nodo.persona.imprimir();
            mostrarArbolInOrder(nodo.hijoder);

        }
    }

    public void mostrarArbolPreOrder(Nodo nodo){

        if(nodo != null){

            System.out.print(nodo.id + " ");
            nodo.persona.imprimir();
            mostrarArbolPreOrder(nodo.hijoizq);
            mostrarArbolPreOrder(nodo.hijoder);
        }
    }

    public void mostrarArbolPostOrder(Nodo nodo){

        if (nodo != null){

            mostrarArbolPostOrder(nodo.hijoizq);
            mostrarArbolPostOrder(nodo.hijoder);
            System.out.print(nodo.id + " ");
            nodo.persona.imprimir();

        }

    }
    
}
