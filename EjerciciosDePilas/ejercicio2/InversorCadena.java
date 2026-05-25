package ejercicio2;

/**
 * Invierte una cadena de texto utilizando una pila de caracteres.
 * Cada carácter se apila en orden y se desapila en orden inverso.
 */
public class InversorCadena {

    /**
     * Recibe una cadena y retorna su inverso.
     *
     * @param texto Cadena original.
     * @return Cadena invertida.
     */
    public String invertir(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }

        PilaCaracteres pila = new PilaCaracteres();

        // Paso 1: Apilar todos los caracteres
        for (char c : texto.toCharArray()) {
            pila.push(c);
        }

        // Paso 2: Desapilar para construir la cadena invertida
        StringBuilder resultado = new StringBuilder();
        while (!pila.estaVacia()) {
            resultado.append(pila.pop());
        }

        return resultado.toString();
    }
}