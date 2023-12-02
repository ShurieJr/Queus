package ca214.LinkedQueueus;

import java.util.EmptyStackException;

public class LinkedQueue<T> {
    private Node<T> head , tail;
    private int counter;

    LinkedQueue(){
        head = null;
        tail = null;
        counter = 0;
    }
    //operations
    //1. enqueue
    void enqueue(T element){
        Node<T> temp = new Node<>(element);
        if(isEmpty())
            head = temp;
        else
            tail.setNext(temp);
        tail = temp;
        counter++;
    }

    //2. isempty
    boolean isEmpty(){
        return counter == 0;
    }

    //3.dequeue
    T dequeue() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T result = head.getElement();
        head    = head.getNext();
        counter--;
        if(isEmpty())
            tail = null;
        return result;
    }
    //4. size
    int size(){
        return counter;
    }
    //5. first
    T first() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return head.getElement();
    }

    //6. print
    void printQueue() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        Node<T> current = head;
        while (current != null){
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }
}
