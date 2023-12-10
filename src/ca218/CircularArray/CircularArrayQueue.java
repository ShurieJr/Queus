package ca218.CircularArray;

import java.util.EmptyStackException;

public class CircularArrayQueue<T> {
    private int front , rear , count;
    private T[] queueu;
    private static final int DEFAULT_CAPACITY = 3;

    CircularArrayQueue(int initial_capacity){
        front =0;
        rear = 0;
        count = 0;
        queueu = (T[]) new Object[initial_capacity];
    }
    CircularArrayQueue(){
        this(DEFAULT_CAPACITY);
    }
    //size
    int size(){
        return count;
    }
    //isempty
    boolean isEmpty(){
        return count == 0;
    }
    //enqueue  -add - insert
    void enqueue(T element){
        //isfull
        if(size() == queueu.length)
            expandCapacity();
        queueu[rear] = element;
        rear = (rear+1) % queueu.length;
        count++;
    }
    //expand capacity
    private void expandCapacity(){
        T[] larger = (T[]) new Object[queueu.length * 2];
        for(int i=0; i< count; i++){
            larger[i] = queueu[front];
            front = (front +1) % queueu.length;
        }
        front = 0;
        rear = count;
        queueu = larger;
    }
    //dequeu
    T dequeu() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T out = queueu[front];
        queueu[front] = null;
        front = (front + 1) % queueu.length;
        count--;
        return out;
    }

    //first element
    T first () throws EmptyStackException{
        if(isEmpty())
            throw  new EmptyStackException();
        return queueu[front];
    }

    //print queue
    void printqueue(){
        if(isEmpty())
            System.out.println("The quueue is Empty!");
        else{
            int current = front;
            for (int i=0; i<count; i++ ){
                System.out.println(queueu[current]);
                current = (current + 1) % queueu.length;
            }
        }
    }

    //main mehtod
    public static void main(String[] args) {
        CircularArrayQueue<String> names = new CircularArrayQueue<>();
        names.enqueue("Ali");
        names.enqueue("Oamr");
        names.enqueue("Geedi");
        names.enqueue("Hawa");

        names.printqueue();
        System.out.println("Size: " + names.size());
        System.out.println("isempty: " + names.isEmpty());
        System.out.println("Remoevd: " + names.dequeu());
        System.out.println("Front element: " + names.first());
    }

}
