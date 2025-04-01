package StackAndQueues;

class DLLnode {
    DLLnode prev;
    DLLnode next;
    int data;

    DLLnode(int data) {
        this.data = data;
    }

}

public class MySTACK {
    DLLnode head;
    DLLnode mid;
    DLLnode prev;
    DLLnode next;
    int size;

    public void push(int data) {
        DLLnode newNode = new DLLnode(data);
        if (size == 0) {
            head = newNode;
            mid = newNode;
            size++;
            return;
        }

        head.next = newNode;
        newNode.prev = head;
        head = newNode;
        if (size % 2 != 0) {
            mid = mid.next;
        }

        size++;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }

        int data = head.data;
        head = head.prev;
        head.next = null;
        if (size % 2 == 0) {
            mid = mid.prev;
        }
        size--;
        return data;
    }

    public int peek() {
        if (size == 0) {
            return -1;
        }
        return head.data;
    }


    public int findMiddle() {
        if (size == 0) {
            return -1;
        }
        return mid.data;
    }

    public void deleteMiddle() {
        if (size == 0) {
            return;
        }
        mid.prev.next = mid.next;
        mid.next.prev = mid.prev;
        mid = mid.prev;
        size--;
    }

}
