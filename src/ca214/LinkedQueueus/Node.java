package ca214.LinkedQueueus;

public class Node<T> {
    private Node<T> next;
    private T element;

    Node(T element){
        this.element = element;
        next  = null;
    }
    Node(){
        this(null);
    }

    public Node<T> getNext() {
        return next;
    }
    public T getElement() {
        return element;
    }
    public void setElement(T element) {
        this.element = element;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
