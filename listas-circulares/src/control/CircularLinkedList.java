package control;

import model.Contact;
import model.Node;

public class CircularLinkedList {
    private Node tail;
    private int size;

    public CircularLinkedList(){
        this.tail = null;
        this.size = 0;
    }
    // Insertar al final de la lista
    public void add(Contact contact){
        Node newNode = new Node(contact);

        if (tail == null){
            //lista vacia
            tail = newNode;
            tail.setNext(tail);
        }else  {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
        size ++;
    }

    //Buscar por nombre
    public Contact findByName(String name){
        if (tail == null) return null;

        Node current = tail.getNext();

        do {
            if (current.getValue().getFullName().equalsIgnoreCase(name)){
                return current.getValue();
            }
            current = current.getNext();
        } while (current != tail.getNext());
        return null;
    }

    public boolean deleteByName(String name){
        if (tail == null) return false;

        Node current = tail.getNext();
        Node previous = tail;

        do {
            if (current.getValue().getFullName().equalsIgnoreCase(name)){
                //Caso 1: Unico nodo
                if (current == tail && current.getNext() == tail){
                    tail = null;
                }

                // Caso 2: Eliminar el primer nodo
                else if (current == tail.getNext()) {
                    tail.setNext(current.getNext());
                }

                // Caso 3: Eliminar el ultimo nodo
                else if (current == tail) {
                    previous.setNext(current.getNext());
                    tail = previous;

                }

                // Caso 4: Eliminar nodo intermedio
                else {
                    previous.setNext(current.getNext());
                }
                size --;
                return true;
            }
            current = current.getNext();
        } while (current != tail.getNext());
        return false;
    }
}
