package StackAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class queueINTRO {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        // System.out.println(queue);
        
        while(queue.isEmpty() == false) {
            queue2.add(queue.remove());
        }

        System.out.println(queue2);
        queue.add(90);

        while(queue2.isEmpty() == false) {
            queue.add(queue2.remove());
        }
       
        System.out.println(queue);
    }
}
