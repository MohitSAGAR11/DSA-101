package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
// import java.util.LinkedList;

public class dequeINTRO {
    public static void main(String[] args) {
        // Deque<Integer> deque = new LinkedList<Integer>();
        // deque.addFirst(1);
        // deque.addLast(2);
        // deque.addFirst(3);
        // deque.addLast(4);
        // System.out.println(deque.poll());
        // System.out.println(deque.peek());
        // System.out.println(deque.peekFirst());
        // System.out.println(deque.peekLast());
        // System.out.println(deque.add(5));
        // System.out.println(deque.remove());
        // System.out.println(deque.removeFirst());
        // System.out.println(deque.removeLast());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);  
        deque.addLast(4);
        System.out.println(deque.poll());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());  
    }
}
