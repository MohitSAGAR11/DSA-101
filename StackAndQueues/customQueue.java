package StackAndQueues;

public class customQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int endptr = 0;

    public customQueue() {
        this(DEFAULT_SIZE);
    }
    
    public customQueue(int defaultSize) {
        this.data = new int[defaultSize];
    }

    public boolean isFull() {
        return endptr == data.length - 1;
    }

    public boolean isEmpty() {
        return endptr == 0;
    }

    public boolean insert(int item) {
        if(isFull()){
            return false;
        }

        data[endptr++] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int temp = data[0];
        //updating the array(shifting the elements to the left)
        for (int i = 0; i < endptr - 1; i++) {
            data[i] = data[i + 1];
        }
        endptr--;
        return temp;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }   


    public void display() {
        for (int i = 0; i < endptr; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public int size() {
        return endptr;
    }

}
