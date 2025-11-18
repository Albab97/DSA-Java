package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // By default, Priority queue implements a min heap. In order to make it a max heap we pass a comparator to PriorityQueue class

        Queue<Integer> pq = new PriorityQueue<>();
//        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(24);
        pq.offer(3);
        pq.offer(1);
        pq.offer(10);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
