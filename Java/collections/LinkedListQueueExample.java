package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {

        //Popular methods for Queue : .offer(value) [enqueue] , .poll() [dequeue], .peek() [head element in the front]

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(9);
        queue.offer(7);
        queue.offer(1);

        System.out.println(queue.offer(0));

        System.out.println(queue.add(19));

        System.out.println(queue);

        queue.poll();
        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
