package arboles;
public class Nodo {
    
    Nodo padre;
    Nodo hijoizq;
    Nodo hijoder;
    int id;
    Persona persona;

    public Nodo(int id) {
        this.padre = null;
        this.hijoizq = null;
        this.hijoder = null;
        this.id = id;
        this.persona = null;
    }
    
}
