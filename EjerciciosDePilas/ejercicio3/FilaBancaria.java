package ejercicio3;

/**
 * Gestiona la fila de atención bancaria.
 * Expone operaciones de alto nivel sobre la cola FIFO de clientes.
 */
public class FilaBancaria {

    private final ColaFIFO<Cliente> cola;

    public FilaBancaria() {
        this.cola = new ColaFIFO<>();
    }

    /**
     * Agrega un cliente al final de la fila.
     *
     * @param nombre Nombre del cliente que llega.
     */
    public void agregarCliente(String nombre) {
        Cliente cliente = new Cliente(nombre);
        cola.encolar(cliente);
        System.out.println("🏦 Llega: " + cliente.getNombre()
                + "  (posición en fila: " + cola.tamanio() + ")");
    }

    /**
     * Atiende al primer cliente de la fila (lo elimina).
     */
    public void atenderCliente() {
        if (cola.estaVacia()) {
            System.out.println("⚠️  No hay clientes en la fila.");
            return;
        }
        Cliente atendido = cola.desencolar();
        System.out.println("✅ Atendiendo: " + atendido.getNombre());
    }

    /**
     * Muestra el siguiente cliente sin atenderlo.
     */
    public void mostrarSiguiente() {
        if (cola.estaVacia()) {
            System.out.println("ℹ️  La fila está vacía.");
            return;
        }
        System.out.println("👁️  Siguiente a atender: " + cola.frente().getNombre());
    }

    /**
     * Muestra el estado completo de la fila.
     */
    public void mostrarFila() {
        if (cola.estaVacia()) {
            System.out.println("📋 Fila vacía.");
            return;
        }
        System.out.println("📋 Fila actual (" + cola.tamanio() + " cliente(s)):");
        int posicion = 1;
        for (Cliente c : cola.verTodos()) {
            System.out.println("   " + posicion++ + ". " + c.getNombre());
        }
    }
}