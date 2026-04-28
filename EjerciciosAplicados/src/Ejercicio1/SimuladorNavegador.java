package Ejercicio1;
import java.util.ArrayDeque;
import java.util.Deque;

public class SimuladorNavegador {

    private Deque<String> historial = new ArrayDeque<>();
    private Deque<String> adelante  = new ArrayDeque<>();

    public void visitar(String url) {
        historial.push(url);
        adelante.clear();
        System.out.println("Visitando: " + url);
    }

    public void atras() {
        if (historial.size() <= 1) {
            System.out.println("No hay páginas anteriores.");
            return;
        }
        adelante.push(historial.pop());
        System.out.println("Atrás → ahora en: " + historial.peek());
    }

    public void adelante() {
        if (adelante.isEmpty()) {
            System.out.println("No hay páginas adelante.");
            return;
        }
        historial.push(adelante.pop());
        System.out.println("Adelante → ahora en: " + historial.peek());
    }

    public void paginaActual() {
        System.out.println("Página actual (peek): " + historial.peek());
    }
}