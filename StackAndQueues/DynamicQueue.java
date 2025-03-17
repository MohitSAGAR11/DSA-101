package StackAndQueues;

public class DynamicQueue extends circularQueue{
    public DynamicQueue(int size) {
        super(size);
    }
    
    public DynamicQueue() {
        super();
    }

    @Override
    public boolean insert(int item) {
        if (isFull()) {
            int[] temp = new int[arr.length * 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        return super.insert(item);
    }
}
