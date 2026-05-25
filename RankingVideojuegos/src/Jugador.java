public class Jugador {
    private String nombre;
    private String tipo;
    private int posicion;
    private int puntaje;

    public Jugador(){
        
    }

    public Jugador(String nombre, String tipo, int posicion,int puntaje) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.posicion = posicion;
        this.puntaje=puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
