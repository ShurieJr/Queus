package ca218.LinkedQueues;

import java.util.EmptyStackException;

public class LinkedQueue<T> {
    private int count;
    private Node<T> head , tail;

    LinkedQueue(){
        head = null;
        tail = null;
        count = 0;
    }
    //enqueue (add , insert)
    void enqueue(T element){
        Node<T> temp = new Node<>(element);
        if(isEmpty())
            head = temp ;
        else
            tail.setNext(temp);
        tail = temp;
        count++;
    }
    //isempty
    boolean isEmpty(){
        return count == 0;
    }
    //dequeue
    T dequeue() throws EmptyStackException {
    if(isEmpty())
        throw new EmptyStackException();
    T result = head.getElement();
    head = head.getNext();
    count--;
    if(isEmpty())
        tail = null;
    return result;
    }

    //first (front element)
    T first() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return head.getElement();
    }

    //size
    int size(){
        return count;
    }
    //print


    @Override
    public String toString() throws EmptyStackException{
        StringBuffer data = new StringBuffer();
        if(isEmpty())
            throw new EmptyStackException();
        Node<T> current = head;
        while( current != null){
            data.append(current.getElement() + " , ");
            current = current.getNext();
        }
        return data.toString();
    }

    //print
    void print() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        Node<T> current = head;
        while (current != null){
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }
}
