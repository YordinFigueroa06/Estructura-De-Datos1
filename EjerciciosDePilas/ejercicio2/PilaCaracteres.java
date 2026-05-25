package ejercicio2;

import java.util.ArrayList;

/**
 * Pila de caracteres utilizada para invertir cadenas.
 */
public class PilaCaracteres {

    private final ArrayList<Character> elementos;

    public PilaCaracteres() {
        this.elementos = new ArrayList<>();
    }

    public void push(char c) {
        elementos.add(c);
    }

    public char pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía.");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
