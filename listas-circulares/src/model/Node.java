package model;

public class Node {
    private Contact value;
    private Node next;

    public Node(Contact value) {
        this.next = next;
        this.value = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Contact getValue() {
        return value;
    }

    public void setValue(Contact value) {
        this.value = value;
    }
}
