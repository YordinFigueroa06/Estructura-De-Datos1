package historialdenavegacion;
public class SistemaNavegacion {
    private Nodo cabeza;

    public SistemaNavegacion(){this.cabeza = null;}

    public void insertarfinal(Pagina pagina){
        Nodo nuevo = new Nodo(pagina);

        if (this.cabeza == null){
            cabeza = nuevo;
        }else{
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Pagina buscar (String nombre){
        Nodo actual = this.cabeza;

        while ( actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)){
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public boolean eliminar ( String nombre){
        if(this.cabeza == null){
            return false;
        }

        if (this.cabeza.getDato().getNombre().equalsIgnoreCase(nombre)){
            this.cabeza = this.cabeza.getSiguiente();
            return true;
        }

        Nodo actual = this.cabeza;

        while (actual.getSiguiente() != null){
            if (actual.getSiguiente().getDato().getNombre().equalsIgnoreCase(nombre)){
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public void listar() {
        Nodo actual = cabeza;

        while(actual != null){
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
