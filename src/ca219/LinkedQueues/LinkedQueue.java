package ca219.LinkedQueues;

import java.util.EmptyStackException;

public class LinkedQueue <T>{
    private int count;
    private Node<T> head , tail;

    LinkedQueue(){
        head =null;
        tail = null;
        count = 0;
    }
    //isempty
    boolean isEmpty(){
        return count == 0;  //head = null;
    }
    //size
    int size(){
        return count;
    }
    //enqueue - add/insert
    void enqueue(T element){
        Node<T> temp = new Node<>(element);
        if(isEmpty())
            head = temp;
        else
            tail.setNext(temp);
        tail = temp;
        count++;
    }
    //dequeue - remove
    T dequeue () throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T removedElement = head.getElement();
        head = head.getNext();
        count--;
        if (isEmpty()) //count == 0
            tail = null;
        return removedElement;
    }
    //first - peek
    T first() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return head.getElement();
    }
    //print queue elements
    void printQueue() {
        if(isEmpty())
            System.out.println("The queueu is Empty!");
        else {
           Node<T> current = head;
           while (current != null){
               System.out.println(current.getElement());
               current = current.getNext();
           }
        }
    }
}
