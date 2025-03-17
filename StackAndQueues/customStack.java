package StackAndQueues;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public customStack(int size) {
        this.data = new int[size];
    }

    public customStack() {
        this(DEFAULT_SIZE);
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr];
    }

    public boolean push(int item) {
        if (isFull()) {
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    protected boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int size() {
        return ptr + 1;
    }

}

