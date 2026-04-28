package Ejercicio2;
import java.util.LinkedList;
import java.util.Queue;

public class SimuladorImpresora {

    private Queue<String> cola = new LinkedList<>();

    public void agregar(String documento) {
        cola.offer(documento);
        System.out.println("Encolado: " + documento);
    }

    public void imprimir() {
        if (cola.isEmpty()) {
            System.out.println("No hay documentos en cola.");
            return;
        }
        System.out.println("Imprimiendo: " + cola.poll());
    }

    public void siguiente() {
        System.out.println("Siguiente (peek): " + cola.peek());
    }
}

