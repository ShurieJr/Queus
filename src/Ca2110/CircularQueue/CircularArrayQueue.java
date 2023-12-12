package Ca2110.CircularQueue;

import java.util.EmptyStackException;

public class CircularArrayQueue <T> {
    private final static int DEFAULT_CAPACITY = 3;
    private int front , rear , count;
    private T[] queue;

    CircularArrayQueue(int initial_capacity){
        front = 0;
        rear    = 0;
        count = 0;
        queue = (T[]) new Object[initial_capacity];
    }
    CircularArrayQueue(){
        this(DEFAULT_CAPACITY);
    }

    //operations
    //size
    int size(){
        return count;
    }
    //isempty
    boolean isEmpty(){
        return count==0;
    }

    //enqueue
    void enqueue(T element){
        if(size() == queue.length)  // isfull()
            expandCapacity();
        queue[rear] = element;
        rear = (rear +1) % queue.length;
        count++;
    }
    //expandcapacity
    private void expandCapacity(){
        T[] larger = (T[]) new Object[queue.length * 2];
        for(int scan = 0 ; scan < count; scan++){
            larger[scan] = queue[front];
            front = (front+1) % queue.length;
        }

        front = 0;
        rear = count;
        queue = larger;
    }

    //dequeu
    T dequeue() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T out = queue[front];
        queue[front] = null;
        front = (front+1) % queue.length;
        count--;
        return out;
    }
    //first
    T first() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return queue[front];
    }
    //printqueue
    void printQueue() throws  EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        int index  = front;
        for(int i = 0; i < count; i++){
            System.out.println(queue[index]);
            index = (index +1) % queue.length;
        }
    }

    //main method
    public static void main(String[] args) {
        CircularArrayQueue<String> names = new CircularArrayQueue<>();
        names.enqueue("Ali");
        names.enqueue("Abdullahi");
        names.enqueue("Oamr");


        names.printQueue();
        System.out.println("Removed element: " + names.dequeue());
        names.enqueue("Aisha");
        System.out.println("Front element: " + names.first());
        System.out.println("Size: " + names.size());
        System.out.println("isEmpty: " + names.isEmpty());
    }
}
