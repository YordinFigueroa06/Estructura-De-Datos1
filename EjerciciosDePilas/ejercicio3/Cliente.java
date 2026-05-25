package ejercicio3;

/**
 * Representa un cliente en la fila de atención bancaria.
 */
public class Cliente {

    private final String nombre;

    public Cliente(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}