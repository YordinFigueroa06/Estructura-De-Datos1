package ejercicio2;

public class Main {
     public static void main(String[] args) {

        Impresora impresora = new Impresora();

        // Simulación
        impresora.agregarDocumento("Tarea.pdf");
        impresora.agregarDocumento("Foto.png");
        impresora.agregarDocumento("Informe.docx");

        impresora.siguienteDocumento(); // Tarea.pdf

        impresora.imprimir(); // imprime Tarea.pdf
        impresora.imprimir(); // imprime Foto.png

        impresora.siguienteDocumento(); // Informe.docx

        impresora.imprimir(); // imprime Informe.docx
        impresora.imprimir(); // cola vacía
    }
}
