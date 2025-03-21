package StackAndQueues;

public class StackUsingLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;
    int size;
    
    StackUsingLL() {
        this.top = null;
        this.size = 0;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            size++;
            return;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }   

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        size--;
        int ans = top.data;
        top = top.next;
        return ans;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }


}
