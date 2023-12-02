package Ca2110;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
       Queue<String> names = new LinkedList<>();
       names.add("Ali");
       names.add("Omar");
       names.offer("Ahmed");

        System.out.println("front element: " + names.peek() );
        System.out.println("front element: " + names.element() );

        System.out.println("removed element : " + names.remove());
        System.out.println("poll element : " + names.poll());

        System.out.println("Isempty: " + names.isEmpty());
        System.out.println("size : " + names.size());

        System.out.println("queue elements : " + names);

    }
}
