package ca214.CiircularARRAY;

import java.util.EmptyStackException;

public class CircularArrayQueue<T> {
    private int front , rear , count;
    private T[] queue;
    private final static int DEFAULT_CAPACITY  = 3;

    CircularArrayQueue(int initialCapacity){
        front =0;
        rear =0;
        count =0;
        queue = (T[]) new Object[initialCapacity];
    }
    CircularArrayQueue(){
        this(DEFAULT_CAPACITY);
    }
    //SIZE
    int size(){
        return count;
    }
    //ISEMPTY
    boolean isEmpty(){
        return count == 0;
    }

    //enqueue -add - insert
    void enqueue(T element){
        if(size() == queue.length)  // isfull
            expandCapacity();
        queue[rear] = element;
        rear = (rear +1) % queue.length;
        count++;
    }

    //expand
    private void expandCapacity(){
        T[] larger = (T[]) new Object[queue.length * 2];
        for(int scan =0; scan < count; scan++){
            larger[scan] = queue[front];
            front = (front + 1) % queue.length;
        }
        front = 0;
        rear = count;
        queue = larger;
    }
    //dequeue
    T dequeue() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T result = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        count--;
        return result;
    }
    //first element
    T first() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return queue[front];
    }
    //print
    void printQueue(){
        if(isEmpty())
            System.out.println("The queue is Empty!");
        else {
            int index = front;
            for(int i=0; i< count; i++){
                System.out.println(queue[index]);
                index = (index + 1) % queue.length;
            }
        }
    }
    //search element
    void searchElement(T key){
        int times =0;
        String index="";
        if(isEmpty())
            return;
        else {
            int current = front;
            for(int i =0; i<count; i++){
                if(key.equals(queue[current])){
                    times++;
                    index += current + " ";
                }
               current = (current +1 ) % queue.length;
            }
            //display the result
            if(times == 0)
                System.out.println("NOT FOUND!");
            else
                System.out.println(key + " found " + times + " times , at [ " + index + " ] ");
        }
    }

    //main method
    public static void main(String[] args) {
        CircularArrayQueue<String> address = new CircularArrayQueue<>();
        address.enqueue("Waaberi");  //0
        address.enqueue("Hodan");
        address.enqueue("Howlwadaag");
        address.enqueue("Waaberi"); // 3
        address.enqueue("Xamarweyne");
        address.enqueue("Waaberi"); //5
        address.enqueue("Waaberi"); //6

        System.out.println("Size: "  + address.size());
        System.out.println("Isempty: "  + address.isEmpty());

       // address.dequeue();
        address.printQueue();
        System.out.println("Size: "  + address.size());
        System.out.println("front element: " + address.first());
        address.searchElement("Ali");
     }
}
