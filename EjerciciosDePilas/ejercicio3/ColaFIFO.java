package ejercicio3;

import java.util.LinkedList;

/**
 * Cola FIFO genérica implementada con LinkedList.
 * El primer elemento en entrar es el primero en ser atendido.
 *
 * @param <T> Tipo de elemento almacenado en la cola.
 */
public class ColaFIFO<T> {

    private final LinkedList<T> elementos;

    public ColaFIFO() {
        this.elementos = new LinkedList<>();
    }

    /**
     * Agrega un elemento al final de la cola (encolar).
     */
    public void encolar(T elemento) {
        elementos.addLast(elemento);
    }

    /**
     * Elimina y retorna el primer elemento de la cola (desencolar).
     */
    public T desencolar() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía. No hay clientes para atender.");
        }
        return elementos.removeFirst();
    }

    /**
     * Retorna el primer elemento sin eliminarlo.
     */
    public T frente() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía.");
        }
        return elementos.getFirst();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public int tamanio() {
        return elementos.size();
    }

    /**
     * Retorna todos los elementos en orden de llegada (sin modificar la cola).
     */
    public LinkedList<T> verTodos() {
        return new LinkedList<>(elementos);
    }
}