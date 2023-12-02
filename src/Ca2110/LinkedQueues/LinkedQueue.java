package Ca2110.LinkedQueues;

import java.util.EmptyStackException;

public class LinkedQueue<T> {
    private int count;
    private Node<T> head;
    private Node<T> tail;

    LinkedQueue(){
        head = tail = null;
        count = 0;   //Empty
    }
    //ismepty
    boolean isEmpty(){
        return count == 0;
    }
    //size
    int size(){
        return count;
    }

    //Enqueue //add insert
    void enqueue(T element){
        Node<T> temp = new Node<>(element);
        if(isEmpty())
            head = temp;
        else
            tail.setNext(temp);
        tail = temp;
        count++;
    }
    //dequeue //remove delete
    T dequeue() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T result = head.getElement();
        head = head.getNext();
        count--;
        if(isEmpty())  //count == 0 , head == null
            tail = null;
        return result;
    }
    //first element
    T first() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return head.getElement();
    }

    //print queue elements]
    void printQueue() {
        if(isEmpty())
            System.out.println("Queue is Empty!");
        else
        {
            Node<T> current = head;
            while(current != null){
                System.out.println(current.getElement());
                current = current.getNext();
            }
        }
    }
}
