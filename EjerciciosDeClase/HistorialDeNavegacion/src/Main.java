package historialdenavegacion;
public class Main {
    public static void main(String[] args) {
        SistemaNavegacion lista = new SistemaNavegacion();

        lista.insertarfinal(new Pagina("Google", "https://www.google.com"));
        lista.insertarfinal(new Pagina("YouTube", "https://www.youtube.com"));
        lista.insertarfinal(new Pagina("Wikipedia", "https://www.wikipedia.org"));


        System.out.println("lista navegacion actual \n");


        System.out.println("\n buscar google : ");
        System.out.println(lista.buscar("Google"));

        System.out.println("\n eliminar a wikipedia : ");
        System.out.println(lista.eliminar("Wikipedia"));


        System.out.println("\n Lista navegacion actual : ");

        lista.listar();
    }
}