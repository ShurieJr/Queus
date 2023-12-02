package ca218.LinkedQueues;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<Integer> numbers = new LinkedQueue<>();
        LinkedQueue<String> names = new LinkedQueue<>();
        names.enqueue("ali");
        names.enqueue("abdi");
        names.enqueue("hawa");
        numbers.enqueue(200);
        numbers.enqueue(300);
        System.out.println(names.toString());
//        numbers.print();
        System.out.println("removed element: " + numbers.dequeue());
        System.out.println("size : " + numbers.size());
        System.out.println("isempty : " + numbers.isEmpty());
    }
}
