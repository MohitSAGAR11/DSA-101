package StackAndQueues;

public class DynamicStack extends customStack {
    public DynamicStack() {
        super(); // calling the default constructor of the parent class
    }

    public DynamicStack(int size) {
        super(size); // calling the parameterized constructor of the parent class
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            // for (int i = 0; i < data.length; i++) {
            // temp[i] = data[i];
            // }
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }

        return super.push(item);

    }

}