import java.util.ArrayDeque;
import java.util.Deque;

public class SimuladorNavegador {

    private Deque<String> historial;

    private Deque<String> adelante;

    public SimuladorNavegador() {
        historial = new ArrayDeque<>();
        adelante  = new ArrayDeque<>();
    }

    public void visitar(String url) {
        historial.push(url);
        adelante.clear();
        System.out.println("✅ Visitando: " + url);
    }

    public void atras() {
        if (historial.size() <= 1) {
            System.out.println("⚠️  No hay páginas anteriores. Ya estás en el inicio.");
            return;
        }
        String paginaActual = historial.pop();
        adelante.push(paginaActual);
        System.out.println("⬅️  Atrás → saliendo de: " + paginaActual
                + "  |  Ahora en: " + paginaActual());
    }

    public void adelante() {
        if (adelante.isEmpty()) {
            System.out.println("⚠️  No hay páginas adelante.");
            return;
        }
        String siguiente = adelante.pop();
        historial.push(siguiente);
        System.out.println("➡️  Adelante → ahora en: " + siguiente);
    }

    public String paginaActual() {
        if (historial.isEmpty()) {
            return "(ninguna)";
        }
        return historial.peek();
    }

    public void mostrarHistorial() {
        System.out.println("\n📋 --- Estado del Historial ---");
        System.out.println("   Página actual (peek): " + paginaActual());
        System.out.print("   Historial (tope → base): ");
        if (historial.isEmpty()) {
            System.out.print("(vacío)");
        } else {
            for (String url : historial) {
                System.out.print("[" + url + "] ");
            }
        }
        System.out.println();
        System.out.print("   Pila 'Adelante': ");
        if (adelante.isEmpty()) {
            System.out.print("(vacía)");
        } else {
            for (String url : adelante) {
                System.out.print("[" + url + "] ");
            }
        }
        System.out.println("\n-------------------------------\n");
    }

    public static void main(String[] args) {
        SimuladorNavegador nav = new SimuladorNavegador();

        nav.visitar("https://google.com");
        nav.visitar("https://github.com");
        nav.visitar("https://stackoverflow.com");
        nav.visitar("https://docs.oracle.com");

        nav.mostrarHistorial();

        nav.atras();
        nav.atras();
        nav.mostrarHistorial();

        nav.adelante();
        nav.mostrarHistorial();

        nav.visitar("https://wikipedia.org");
        nav.mostrarHistorial();

        nav.adelante();

        nav.atras();
        nav.atras();
        nav.atras();
        nav.atras();
        nav.mostrarHistorial();

        System.out.println("✔️  Simulación finalizada.");
    }
}