package ejercicio1;

import java.util.ArrayList;

/**
 * Pila genérica implementada con ArrayList.
 * @param <T> Tipo de elemento almacenado.
 */
public class Pila<T> {

    private final ArrayList<T> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }

    /** Agrega un elemento al tope de la pila. */
    public void push(T elemento) {
        elementos.add(elemento);
    }

    /** Elimina y retorna el elemento del tope. */
    public T pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía.");
        }
        return elementos.remove(elementos.size() - 1);
    }

    /** Retorna el elemento del tope sin eliminarlo. */
    public T peek() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía.");
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public int tamanio() {
        return elementos.size();
    }
}