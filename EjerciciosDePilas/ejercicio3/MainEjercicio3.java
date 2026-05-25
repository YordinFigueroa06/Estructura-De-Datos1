package ejercicio3;

/**
 * Punto de entrada para el Ejercicio 3.
 * Simula una fila de atención bancaria con cola FIFO.
 */
public class MainEjercicio3 {

    public static void main(String[] args) {
        FilaBancaria banco = new FilaBancaria();

        System.out.println("=== Simulación de Fila Bancaria (FIFO) ===\n");

        // --- Escenario del enunciado ---
        banco.agregarCliente("Ana");
        banco.agregarCliente("Carlos");
        System.out.println();

        banco.mostrarSiguiente();
        System.out.println();

        banco.atenderCliente();   // Debe atender a Ana (llegó primero)
        System.out.println();

        banco.mostrarSiguiente(); // Ahora Carlos es el siguiente
        System.out.println();

        // --- Escenario extendido ---
        System.out.println("--- Llegan más clientes ---");
        banco.agregarCliente("Luis");
        banco.agregarCliente("María");
        System.out.println();

        banco.mostrarFila();
        System.out.println();

        banco.atenderCliente();   // Carlos
        banco.atenderCliente();   // Luis
        banco.atenderCliente();   // María
        System.out.println();

        banco.atenderCliente();   // Cola vacía → mensaje de advertencia
    }
}