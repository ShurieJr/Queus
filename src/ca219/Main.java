package ca219;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.offer(30);

        System.out.println("Queue elements: " + q);
        System.out.println("Queue size : " + q.size());
        System.out.println("Queue isempty : " + q.isEmpty());
        System.out.println("Front Element : " + q.peek());

        System.out.println("poll element: " + q.poll());
        System.out.println("removed element: " + q.remove());


        System.out.println("Queue elements: " + q);
    }
}