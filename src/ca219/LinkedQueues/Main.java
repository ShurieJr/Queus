package ca219.LinkedQueues;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> names = new LinkedQueue<>();
        names.enqueue("Abdullahi");
        names.enqueue("Omar");
        names.enqueue("Hawa");
        System.out.println("size: " + names.size());
        names.printQueue();
        System.out.println("removed element: " + names.dequeue());

        System.out.println("front element: " + names.first());
    }
}
