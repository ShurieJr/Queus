package ca219.CircularQueue;

import java.util.EmptyStackException;

public class CircularArrayQueue<T> {
    private static final int DEFAULT_CAPACITY = 3;
    private int front , rear , count;
    private T[] queue;
    CircularArrayQueue(int inital_capacity){
        front = 0;
        rear = 0;
        count = 0;
        queue = (T[]) new Object[inital_capacity];
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

    //first --peek
    T first() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return queue[front];
    }
    //enqueue
    void enqueue(T element) {
        if(size() == queue.length )
           expandCapacity();
        queue[rear] = element;
        rear = (rear +1) % queue.length ;
        count++;


    }

    //expand capacity
    private void expandCapacity(){
        T[] larger = (T[]) new Object[queue.length * 2];
        for(int scan=0; scan < count; scan++){
            larger[scan] = queue[front];
            front = (front + 1) % queue.length;
        }
        front =0;
        rear = count;
        queue = larger;
    }
    //dequeue
    T dequeue () throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T out = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        count--;
        return out ;
    }

    //print
    void printQueue() throws EmptyStackException{
        if(isEmpty())
            System.out.println("The queueu is Empty!");
        else {
            int index = front;
            for(int i = 0; i<count; i++){
                System.out.println(queue[index]);
                index = (index+1) % queue.length;
            }
        }
    }

    //search
    void searchElement(T key){
        int times=0;
        String index ="";
        int current =front;
        for(int scan =0; scan < count; scan++){
            if(key.equals(queue[current])){
                times++;
                index += current + " , ";
            }
            current = (current+1) % queue.length;
        }
        //display the result
        if(times == 0)
            System.out.println("NOT FOUND!");
        else
            System.out.println(key + " : found " + times + " times " + " at [ " + index + " ]");
    }
    //main method
    public static void main(String[] args) {
        CircularArrayQueue<String> names = new CircularArrayQueue<>(2);
        names.enqueue("ali");
        names.enqueue("Geedi"); //1
        names.enqueue("aisha");
        names.enqueue("Geedi"); //3
        names.enqueue("Kaafi");

        names.printQueue();
        System.out.println("Queue size:  " + names.size());
        System.out.println("isempty:  " + names.isEmpty());
       // System.out.println("removed element:  " + names.dequeue());
        System.out.println("First element:  " + names.first());

        names.searchElement("warsame");

    }
}
