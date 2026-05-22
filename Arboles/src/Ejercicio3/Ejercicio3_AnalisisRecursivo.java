package Ejercicio3;

public class Ejercicio3_AnalisisRecursivo {
    static class NodoBinario {
        int dato;
        NodoBinario izquierda;
        NodoBinario derecha;

        public NodoBinario(int dato) {
            this.dato = dato;
            this.izquierda = null;
            this.derecha = null;
        }
    }

    static int contarNodos(NodoBinario nodo) {
        if (nodo == null) {
            return 0;               // caso base: árbol vacío
        }
        return 1 + contarNodos(nodo.izquierda) + contarNodos(nodo.derecha);
    }

    static int altura(NodoBinario nodo) {
        if (nodo == null) {
            return -1;              // caso base: árbol vacío
        }
        int altIzq = altura(nodo.izquierda);
        int altDer = altura(nodo.derecha);
        return 1 + Math.max(altIzq, altDer);
    }

    public static void main(String[] args) {
        NodoBinario raiz = new NodoBinario(192550);

        raiz.izquierda                 = new NodoBinario(191830);
        raiz.derecha                   = new NodoBinario(191070);
        raiz.izquierda.izquierda       = new NodoBinario(191820);
        raiz.izquierda.derecha         = new NodoBinario(191840);

        // Mostrar resultados
        System.out.println("=== Análisis recursivo del árbol binario ===\n");
        System.out.println("Cantidad de nodos : " + contarNodos(raiz));
        System.out.println("Altura del árbol  : " + altura(raiz));
    }
}

/*
 *  PREGUNTAS DE ANÁLISIS
 *
 *  1. ¿Qué ocurre cuando el nodo es null?
 *     Es el CASO BASE de ambas funciones. Cuando la recursión
 *     llega a un puntero nulo (hijo de una hoja), la función
 *     retorna inmediatamente sin seguir llamándose:
 *     - contarNodos devuelve 0 (nada que contar).
 *     - altura devuelve -1 (árbol vacío, sin niveles).
 *     Sin este caso base la recursión sería infinita y produciría
 *     un StackOverflowError.
 *
 *  2. ¿Por qué la recursión simplifica el procesamiento de árboles?
 *     Un árbol es, por definición, una estructura recursiva:
 *     cada subárbol tiene exactamente la misma forma que el árbol
 *     completo. La recursión aprovecha esa propiedad aplicando la
 *     misma lógica en cada nodo sin necesidad de gestionar
 *     manualmente pilas, colas ni índices. El programador solo
 *     define qué hacer en un nodo y la recursión se encarga de
 *     propagarlo a todos los demás.
 *
 *  3. ¿Qué complejidad temporal tienen estas funciones?
 *     Ambas tienen complejidad O(n), donde n es el número de nodos.
 *     Cada nodo se visita exactamente una vez en cada llamada
 *     recursiva, independientemente de la forma del árbol
 *     (balanceado o desbalanceado). No existe forma de evitar
 *     visitar todos los nodos si se quiere contar o medir el árbol
 *     completo, por lo que O(n) es también el límite inferior.
 * ============================================================
 */
