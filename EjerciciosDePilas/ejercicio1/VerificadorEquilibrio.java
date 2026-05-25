package ejercicio1;
import java.util.ArrayList;

/**
 * Verifica si una expresión tiene los símbolos de agrupación
 * (paréntesis, llaves y corchetes) correctamente equilibrados.
 */
public class VerificadorEquilibrio {

    /**
     * Analiza la expresión carácter por carácter usando una pila.
     *
     * @param expresion La cadena a verificar.
     * @return true si está equilibrada, false en caso contrario.
     */
    public boolean estaEquilibrada(String expresion) {
        Pila<Character> pila = new Pila<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (esApertura(c)) {
                pila.push(c);
            } else if (esCierre(c)) {
                if (pila.estaVacia()) {
                    return false; // Cierre sin apertura correspondiente
                }
                char tope = pila.pop();
                if (!sonPareja(tope, c)) {
                    return false; // El cierre no corresponde al último apertura
                }
            }
        }

        // Si la pila queda vacía, todos los aperturas fueron cerrados
        return pila.estaVacia();
    }

    private boolean esApertura(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean esCierre(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private boolean sonPareja(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')')
            || (apertura == '{' && cierre == '}')
            || (apertura == '[' && cierre == ']');
    }

    /**
     * Genera un mensaje descriptivo del resultado.
     */
    public String analizar(String expresion) {
        boolean ok = estaEquilibrada(expresion);
        return "Expresión : \"" + expresion + "\"\n"
             + "Resultado : " + (ok ? "✅ EQUILIBRADA" : "❌ NO EQUILIBRADA");
    }
}