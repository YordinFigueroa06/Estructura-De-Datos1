package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        SimuladorImpresora impresora = new SimuladorImpresora();

        impresora.agregar("Informe.pdf");
        impresora.agregar("Contrato.docx");
        impresora.agregar("Factura.pdf");

        impresora.siguiente();
        impresora.imprimir();
        impresora.imprimir();
        impresora.siguiente();
    }
}