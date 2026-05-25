package ejercicio1;
import java.util.ArrayDeque;

public class Navegador {

    private ArrayDeque<String> historial;

    public Navegador() {
        historial = new ArrayDeque<>();
    }

    public void visitar(String pagina) {
        historial.push(pagina);
        System.out.println("Visitando: " + pagina);
    }

    public void atras() {
        if (historial.size() > 1) {
            historial.pop();
            System.out.println("Regresando a: " + historial.peek());
        } else {
            System.out.println("No hay más páginas.");
        }
    }

    public void paginaActual() {
        if (!historial.isEmpty()) {
            System.out.println("Página actual: " + historial.peek());
        }
    }
    

 
}