package ejercicio2;

/**
 * Punto de entrada para el Ejercicio 2.
 * Demuestra la inversión de cadenas usando pila.
 */
public class MainEjercicio2 {

    public static void main(String[] args) {
        InversorCadena inversor = new InversorCadena();

        String[] palabras = { "JAVA", "Hola Mundo", "12345", "racecar", "OpenAI" };

        System.out.println("=== Inversor de Cadena con Pila ===\n");
        System.out.printf("%-20s -> %s%n", "Entrada", "Salida");
        System.out.println("-".repeat(35));

        for (String palabra : palabras) {
            System.out.printf("%-20s -> %s%n", palabra, inversor.invertir(palabra));
        }
    }
}