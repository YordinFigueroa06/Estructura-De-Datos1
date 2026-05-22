package Ejercicio4;

public class Ejercicio4_BST_vs_Lista {

    static class NodoLista {
        int codigo;
        NodoLista siguiente;

        public NodoLista(int codigo) {
            this.codigo = codigo;
            this.siguiente = null;
        }
    }

    static class ListaEnlazada {
        NodoLista cabeza;

        /** Inserta al final de la lista */
        public void insertar(int codigo) {
            NodoLista nuevo = new NodoLista(codigo);
            if (cabeza == null) {
                cabeza = nuevo;
                return;
            }
            NodoLista actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }

        public boolean buscar(int codigo) {
            NodoLista actual = cabeza;
            while (actual != null) {
                if (actual.codigo == codigo) return true;
                actual = actual.siguiente;
            }
            return false;
        }

        /** Imprime todos los elementos */
        public void mostrar() {
            NodoLista actual = cabeza;
            while (actual != null) {
                System.out.print(actual.codigo);
                if (actual.siguiente != null) System.out.print(" → ");
                actual = actual.siguiente;
            }
            System.out.println();
        }
    }

    static class NodoBST {
        int codigo;
        NodoBST izquierda;
        NodoBST derecha;

        public NodoBST(int codigo) {
            this.codigo = codigo;
        }
    }

    static class ArbolBST {
        NodoBST raiz;

        public void insertar(int codigo) {
            raiz = insertarRec(raiz, codigo);
        }

        private NodoBST insertarRec(NodoBST nodo, int codigo) {
            if (nodo == null) return new NodoBST(codigo);
            if (codigo < nodo.codigo)
                nodo.izquierda = insertarRec(nodo.izquierda, codigo);
            else if (codigo > nodo.codigo)
                nodo.derecha = insertarRec(nodo.derecha, codigo);
            return nodo;
        }

        public boolean buscar(int codigo) {
            return buscarRec(raiz, codigo);
        }

        private boolean buscarRec(NodoBST nodo, int codigo) {
            if (nodo == null)         return false;        // no existe
            if (codigo == nodo.codigo) return true;        // encontrado
            if (codigo < nodo.codigo)
                return buscarRec(nodo.izquierda, codigo);  // ir a la izquierda
            return buscarRec(nodo.derecha, codigo);         // ir a la derecha
        }

        public void mostrarInorden(NodoBST nodo) {
            if (nodo != null) {
                mostrarInorden(nodo.izquierda);
                System.out.print(nodo.codigo + " ");
                mostrarInorden(nodo.derecha);
            }
        }
    }

    public static void main(String[] args) {

        int[] codigos = {192550, 191830, 191070, 191820, 191840, 190010, 193500};

        ListaEnlazada lista = new ListaEnlazada();
        for (int c : codigos) lista.insertar(c);

        System.out.println("=== LISTA ENLAZADA ===");
        System.out.print("Elementos: ");
        lista.mostrar();
        System.out.println("Buscar 191820: " + lista.buscar(191820));  // true
        System.out.println("Buscar 999999: " + lista.buscar(999999));  // false

        ArbolBST bst = new ArbolBST();
        for (int c : codigos) bst.insertar(c);

        System.out.println("\n=== ÁRBOL BINARIO DE BÚSQUEDA (BST) ===");
        System.out.print("Inorden (ordenado): ");
        bst.mostrarInorden(bst.raiz);
        System.out.println();
        System.out.println("Buscar 191820: " + bst.buscar(191820));  // true
        System.out.println("Buscar 999999: " + bst.buscar(999999));  // false
    }
}