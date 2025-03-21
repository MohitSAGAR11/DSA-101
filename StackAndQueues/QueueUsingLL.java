package StackAndQueues;

public class QueueUsingLL {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;
    QueueUsingLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (head == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int ans = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return ans;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return head.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
