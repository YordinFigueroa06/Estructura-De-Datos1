package ejercicio1;
public class Main {
       public static void main(String[] args) {
        Navegador nav = new Navegador();

        nav.visitar("facebook.com");
        nav.visitar("instagram.com");
        nav.visitar("twitter.com");

        nav.paginaActual();
        nav.atras();
        nav.paginaActual();
    }
}
