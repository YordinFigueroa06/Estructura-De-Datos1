public class GestionRanking {
    private Nodo cabeza;


    //insercion
     public void  insertarJugador(Jugador jugador){     
        Nodo nuevo = new Nodo(jugador);

        if (cabeza == null) {
            cabeza = nuevo;
        }else{
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual= actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
     }

     public void registrarPuntaje(String nombre, int puntaje){
        Jugador jugadorExiste = buscarJugador(nombre);

        if (jugadorExiste!= null ) {
            jugadorExiste.setPuntaje(jugadorExiste.getPuntaje()+puntaje);
             System.out.println("Puntaje actualizado: " + jugadorExiste.getNombre() + 
                           " → " + jugadorExiste.getPuntaje());
        }else{
            System.out.println("no se encontro el jugador");
        }

     }

    //buscar jugador
     public Jugador buscarJugador(String nombre){
        Nodo actual = cabeza;

        while (actual!= null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                return actual.getDato();
            }
            actual =actual.getSiguiente();
        }
        return null;
     }

    //ordenar ranking

    public void ordenarRanking() {
        if (cabeza == null) return;

        boolean huboCambio;

        do {
            huboCambio = false;
            Nodo actual = cabeza;

            while (actual.getSiguiente() != null) {
                Jugador jugadorActual  = actual.getDato();
                Jugador jugadorSiguiente = actual.getSiguiente().getDato();

                // Si el actual tiene MENOS puntaje que el siguiente, los intercambia
                if (jugadorActual.getPuntaje() < jugadorSiguiente.getPuntaje()) {
                    actual.setDato(jugadorSiguiente);
                    actual.getSiguiente().setDato(jugadorActual);
                    huboCambio = true;
                }
                actual = actual.getSiguiente();
            }
        } while (huboCambio); 
    }

    // MOSTRAR ranking ordenado
    public void mostrarRanking() {
        Nodo actual = cabeza;
        int posicion = 1;
        while (actual != null) {
            Jugador j = actual.getDato();
            System.out.println(posicion + ". " + j.getNombre() +
                               " | Tipo: " + j.getTipo() +
                               " | Puntaje: " + j.getPuntaje());
            posicion++;
            actual = actual.getSiguiente();
        }
    }
}

