public class Main {
    public static void main(String[] args) {
        ListaContactos lista = new ListaContactos();

        lista.insertarFinal(
                new Contacto("Ana", "3150000", "ana@mail.com")
        );
        lista.insertarFinal(
                new Contacto("Luis", "3160000", "luis@mail.com")
        );
        lista.insertarFinal(
                new Contacto("Carlos", "3170000", "carlos@mail.com")
        );

        System.out.println("Lista Actual");
        lista.listar();

        System.out.println("\nBuscar Ana:");
        System.out.println(lista.buscar("Ana"));

        System.out.println("\nEliminar Luis:");
        System.out.println(lista.eliminar("Luis"));

        System.out.println("\nLista final:");
        lista.listar();
    }
}