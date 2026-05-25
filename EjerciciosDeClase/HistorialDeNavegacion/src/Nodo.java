package historialdenavegacion;
public class Nodo {
    private Pagina dato;
    private Nodo siguiente;

    public Nodo(Pagina dato) {
        this.setDato(dato);
    }

    public Pagina getDato() {
        return dato;
    }

    public void setDato(Pagina dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

