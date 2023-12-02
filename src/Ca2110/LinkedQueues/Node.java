package Ca2110.LinkedQueues;

public class Node<T> {
    private T element;
    private Node<T> next;
    Node(T element){
        this.element = element;
        next= null;
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
