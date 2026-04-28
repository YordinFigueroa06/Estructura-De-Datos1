import java.util.LinkedList;
import java.util.Queue;

public class SimuladorImpresora {

    static class Documento {
        private static int contadorId = 1;

        private int    id;
        private String nombre;
        private int    paginas;
        private String remitente;

        public Documento(String nombre, int paginas, String remitente) {
            this.id        = contadorId++;
            this.nombre    = nombre;
            this.paginas   = paginas;
            this.remitente = remitente;
        }

        @Override
        public String toString() {
            return String.format("Doc#%02d [%s] (%d págs.) — de: %s", id, nombre, paginas, remitente);
        }
    }

    private Queue<Documento> colaImpresion;
    private int totalImpresosHoy;

    public SimuladorImpresora() {
        colaImpresion    = new LinkedList<>();
        totalImpresosHoy = 0;
    }

    public void agregarDocumento(String nombre, int paginas, String remitente) {
        Documento doc = new Documento(nombre, paginas, remitente);
        colaImpresion.offer(doc);
        System.out.println("📄 Encolado: " + doc);
    }

    public void imprimirSiguiente() {
        if (colaImpresion.isEmpty()) {
            System.out.println("⚠️  La cola de impresión está vacía. No hay documentos pendientes.");
            return;
        }
        Documento doc = colaImpresion.poll();
        totalImpresosHoy++;
        System.out.println("🖨️  Imprimiendo: " + doc + "  ← [procesado]");
    }

    public void consultarSiguiente() {
        Documento siguiente = colaImpresion.peek();
        if (siguiente == null) {
            System.out.println("🔍 Siguiente a imprimir: (ninguno — cola vacía)");
        } else {
            System.out.println("🔍 Siguiente a imprimir: " + siguiente);
        }
    }

    public void mostrarCola() {
        System.out.println("\n📋 --- Cola de Impresión ---");
        System.out.println("   Documentos en espera: " + colaImpresion.size());
        System.out.println("   Impresos hoy:         " + totalImpresosHoy);
        if (colaImpresion.isEmpty()) {
            System.out.println("   Cola: (vacía)");
        } else {
            System.out.println("   Orden de impresión (frente → atrás):");
            int pos = 1;
            for (Documento doc : colaImpresion) {
                System.out.println("     " + pos++ + ". " + doc);
            }
        }
        System.out.println("----------------------------\n");
    }

    public static void main(String[] args) {
        SimuladorImpresora impresora = new SimuladorImpresora();

        // 1. Agregar documentos a la cola
        impresora.agregarDocumento("Informe_Trimestral.pdf", 15, "Carlos");
        impresora.agregarDocumento("Contrato_Proveedor.docx", 8, "Maria");
        impresora.agregarDocumento("Presentacion_Q3.pptx", 22, "Juan");
        impresora.agregarDocumento("Factura_0042.pdf", 2, "Laura");

        impresora.mostrarCola();

        impresora.consultarSiguiente();
        System.out.println();

        impresora.imprimirSiguiente();
        impresora.imprimirSiguiente();

        impresora.mostrarCola();

        impresora.agregarDocumento("Actas_Reunion.pdf", 5, "Pedro");

        impresora.consultarSiguiente();
        System.out.println();

        System.out.println("--- Procesando cola completa ---");
        while (!impresora.colaImpresion.isEmpty()) {
            impresora.imprimirSiguiente();
        }

        impresora.mostrarCola();

        impresora.imprimirSiguiente();

        System.out.println("\n✔️  Simulación finalizada.");
    }
}