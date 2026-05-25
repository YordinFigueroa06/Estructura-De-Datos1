package ejercicio2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Impresora {

    private Queue<String> cola;

    public Impresora() {
        cola = new ArrayDeque<>();
    }

    // Agregar documento (enqueue)
    public void agregarDocumento(String documento) {
        cola.offer(documento);
        System.out.println("Documento agregado: " + documento);
    }

    // Procesar documento (dequeue)
    public void imprimir() {
        if (!cola.isEmpty()) {
            String doc = cola.poll();
            System.out.println("Imprimiendo: " + doc);
        } else {
            System.out.println("No hay documentos en la cola.");
        }
    }

    // Ver siguiente documento (peek)
    public void siguienteDocumento() {
        if (!cola.isEmpty()) {
            System.out.println("Siguiente documento: " + cola.peek());
        } else {
            System.out.println("No hay documentos en la cola.");
        }
    }

   
}