package StackAndQueues;

public class circularQueue {
    protected int arr[];
    private static final int DEFAULT_SIZE = 10;

    protected int size = 0;
    protected int front = 0;
    protected int rear = 0;

    public circularQueue() {
        this(DEFAULT_SIZE);
    }

    public circularQueue(int size) {
        this.arr = new int[size];
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        arr[rear++] = item;
        rear = (rear) % arr.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int temp = arr[front++];
        front = (front) % arr.length;
        size--;
        return temp;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return arr[front];
    }

    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("END");
    }
}