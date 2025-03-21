package Linked_List;

import java.util.Scanner;

public class CacheMemory2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the cache memory: ");
        int size = sc.nextInt();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.addINcache(arr[i], size);
        }
        list.print();
    }

    static class Node {
        int data;
        int size;
        Node head;
        Node tail;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        int size() {
            return size;
        }

        void insertFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            size++;
        }

        // void insertAtEnd(int data) {
        //     if (head == null) {
        //         head = new Node(data);
        //         tail = head;
        //     } else {
        //         tail.next = new Node(data);
        //         tail = tail.next;
        //     }
        //     size++;
        // }

        void delete(int data) {
            if (head == null) return;

            if (head.data == data) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
                size--;
                return;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    if (current.next == null) {
                        tail = current;
                    }
                    size--;
                    return;
                }
                current = current.next;
            }
        }

        boolean search(int data) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == data) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + "<|>");
                temp = temp.next;
            }

        }

        void addINcache(int data, int n) {
            if (search(data)) {
                delete(data);
                insertFirst(data);
            } else {
                if (size == n) {
                    delete(tail.data);
                    insertFirst(data);
                } else {
                    insertFirst(data);
                }
            }
        }
    }

}
