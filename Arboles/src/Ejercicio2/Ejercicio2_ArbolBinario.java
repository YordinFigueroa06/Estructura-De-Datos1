package Ejercicio2;
public class Ejercicio2_ArbolBinario {
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
    static void preorden(NodoBinario nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preorden(nodo.izquierda);
            preorden(nodo.derecha);
        }
    }
    static void inorden(NodoBinario nodo) {
        if (nodo != null) {
            inorden(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            inorden(nodo.derecha);
        }
    }

    static void postorden(NodoBinario nodo) {
        if (nodo != null) {
            postorden(nodo.izquierda);
            postorden(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }

    public static void main(String[] args) {
        NodoBinario raiz = new NodoBinario(192550);

        raiz.izquierda                 = new NodoBinario(191830);
        raiz.derecha                   = new NodoBinario(191070);
        raiz.izquierda.izquierda       = new NodoBinario(191820);
        raiz.izquierda.derecha         = new NodoBinario(191840);

        System.out.println("=== Recorridos del árbol binario ===\n");

        System.out.print("Preorden  → ");
        preorden(raiz);
        System.out.println();

        System.out.print("Inorden   → ");
        inorden(raiz);
        System.out.println();

        System.out.print("Postorden → ");
        postorden(raiz);
        System.out.println();
    }
}

/*
 *  PREGUNTAS DE ANÁLISIS
 *
 *  1. ¿Qué recorrido visita primero la raíz?
 *     El recorrido PREORDEN. Visita la raíz antes que cualquier
 *     subárbol (raíz → izquierda → derecha), por eso la raíz
 *     192550 aparece de primero en la salida.
 *
 *  2. ¿Qué recorrido genera los datos ordenados en un BST?
 *     El recorrido INORDEN (izquierda → raíz → derecha).
 *     En un árbol binario de búsqueda, el hijo izquierdo siempre
 *     es menor que la raíz y el derecho siempre es mayor, por lo
 *     que el inorden produce los valores en orden ascendente.
 *
 *  3. ¿Por qué los recorridos se implementan naturalmente con recursión?
 *     Porque un árbol es una estructura recursiva: cada subárbol
 *     es, en sí mismo, un árbol con la misma forma que el árbol
 *     original. La recursión aprovecha esto llamándose a sí misma
 *     con el hijo izquierdo y luego con el hijo derecho, sin
 *     necesidad de bucles ni estructuras auxiliares complejas.
 *     El caso base (nodo == null) detiene la recursión cuando se
 *     alcanza un nodo hoja.
 */
