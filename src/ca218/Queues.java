package ca218;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
       // System.out.println("Removed element: " + numbers.remove());
        System.out.println("poll element: " + numbers.poll());
        numbers.add(10);
        numbers.offer(20);
        numbers.offer(30);

        System.out.println("Front element: " + numbers.peek());
        System.out.println("Front element: " + numbers.element());
        System.out.println(numbers);

        System.out.println("size: " + numbers.size());
        System.out.println("ismepty: " + numbers.isEmpty());
    }
}
