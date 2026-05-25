package historialdenavegacion;
import java.time.LocalDateTime;
import java.net.URL;
import java.net.MalformedURLException;

public class Pagina {
    private String nombre;
    private String url;
    private LocalDateTime fechaHora;

    public Pagina(String nombre, String urlTexto){
        this.setNombre(nombre);
        this.url = urlTexto;
        this.fechaHora = LocalDateTime.now();
    }

    public String getUrl() { return url;}

    public void setUrl(String url) { this.url = url;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                ", fechaHora=" + fechaHora +
                '}';
    }
}