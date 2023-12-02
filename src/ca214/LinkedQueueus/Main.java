package ca214.LinkedQueueus;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> names = new LinkedQueue<>();

        names.enqueue("Salmaan");
        names.enqueue("Abdirahman");
        names.enqueue("Hawa");

        names.printQueue();
        System.out.println("size: " + names.size());
        System.out.println("isEmpty: " + names.isEmpty());
        System.out.println("removed element: " + names.dequeue());
        System.out.println("Front element: " + names.first());
    }
}
