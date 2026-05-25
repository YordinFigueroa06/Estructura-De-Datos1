package ejercicio1;

/**
 * Punto de entrada para el Ejercicio 1.
 * Prueba el verificador de equilibrio con varias expresiones.
 */
public class MainEjercicio1 {

    public static void main(String[] args) {
        VerificadorEquilibrio verificador = new VerificadorEquilibrio();

        String[] expresiones = {
            "((a+b)*5) - 7",          // Equilibrada
            "2*[(a+b)/2.5 + x - 7*y", // Falta corchete de cierre
            "{[()]}",                  // Equilibrada
            "{[(])}",                  // Tipos cruzados → NO equilibrada
            "((()))",                  // Equilibrada
            "(()"                      // Falta paréntesis de cierre
        };

        System.out.println("=== Verificador de Equilibrio ===\n");
        for (String expr : expresiones) {
            System.out.println(verificador.analizar(expr));
            System.out.println();
        }
    }
}