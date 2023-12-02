package Ca2110.LinkedQueues;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<Integer> numbers  =new LinkedQueue<>();
        numbers.enqueue(100);
        numbers.enqueue(200);
        numbers.enqueue(400);

        numbers.printQueue();
        System.out.println("removed element: " + numbers.dequeue());
        System.out.println("First element: " + numbers.first());
        System.out.println("size: " + numbers.size());
        System.out.println("isEmpty: " + numbers.isEmpty());
    }
}
