package collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Deque means Doubly ended queue. Using an Array Deque we can add/remove element from front as wells as rear side of the queue.
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12); // offer() method comes from Queue Interface and adds element to the rear side.
        adq.offerFirst(24); // offerFirst() method is from the Deque interface and adds element to front side.
        adq.offerLast(35); // same as offer()
        adq.offerLast(10);

        System.out.println(adq);

        System.out.println(adq.peek()); // shows the first element (element which is at the front)
        System.out.println(adq.peekFirst()); // same as peek()
        System.out.println(adq.peekLast()); // shows the last element (element which at the rear end)

        System.out.println(adq.poll()); // removes the element from the front
        System.out.println("After poll() : "+ adq);

        System.out.println(adq.pollFirst()); // same as poll()
        System.out.println("After pollFirst() "+adq);

        System.out.println(adq.pollLast()); // removes the element from the rear end
        System.out.println("After pollLast() "+adq);
    }
}
