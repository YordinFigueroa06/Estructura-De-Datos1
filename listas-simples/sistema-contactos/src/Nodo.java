public class Nodo {
    private Contacto dato;
    private Nodo siguiente;

    public Contacto getDato() {
        return dato;
    }

    public void setDato(Contacto dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(Contacto dato) {
        this.dato = dato;
    }
}
