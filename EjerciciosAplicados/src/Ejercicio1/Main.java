package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        SimuladorNavegador nav = new SimuladorNavegador();

        nav.visitar("google.com");
        nav.visitar("github.com");
        nav.visitar("stackoverflow.com");

        nav.paginaActual();
        nav.atras();
        nav.atras();
        nav.adelante();
    }
}
