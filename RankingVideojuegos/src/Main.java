public class Main {
    public static void main(String[] args) {
        GestionRanking gestionRanking = new GestionRanking();
        
    Jugador jugador1 = new Jugador("andres", "sd", 0,7);
    Jugador jugador2 = new Jugador("mauricio", "32", 0,7);

        gestionRanking.insertarJugador(jugador1);
        gestionRanking.insertarJugador(jugador2);

    gestionRanking.registrarPuntaje("andres", 100);
    gestionRanking.registrarPuntaje("mauricio", 50);
    gestionRanking.ordenarRanking();
    gestionRanking.mostrarRanking();
        
    
    }
}