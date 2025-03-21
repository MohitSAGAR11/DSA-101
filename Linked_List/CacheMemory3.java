package Linked_List;

import java.util.HashMap;
import java.util.Scanner;

public class CacheMemory3 {
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

        LRUCache cache = new LRUCache(size);
        for (int i = 0; i < n; i++) {
            cache.addINcache(arr[i]);
        }
        cache.print();
    }

    // Node to represent each cache entry
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    // The LRU Cache implementation
    static class LRUCache {
        private int capacity;
        private int size;
        private HashMap<Integer, Node> cache;
        private Node head, tail;

        // Constructor
        LRUCache(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.cache = new HashMap<>();
            this.head = new Node(-1); 
            this.tail = new Node(-1); 
            head.next = tail;
            tail.prev = head;
        }

        // Add a new element into the cache or update it if already exists
        void addINcache(int data) {
            // If the element exists, remove it and add it at the front (most recent)
            if (cache.containsKey(data)) {
                removeNode(cache.get(data));
            } else {
                // If capacity is reached, remove the least recently used (LRU) item
                if (size == capacity) {
                    Node lruNode = removeFirst();
                    cache.remove(lruNode.data);
                }
            }

            Node newNode = new Node(data);
            addNodeAtEnd(newNode);
            cache.put(data, newNode);
        }

        // Remove node from the list
        private void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        // Add node at the end (most recent place)
        private void addNodeAtEnd(Node node) {
            Node prev = tail.prev;
            prev.next = node;
            node.prev = prev;
            node.next = tail;
            tail.prev = node;
            size++;
        }

        // Remove the first node (LRU item)
        private Node removeFirst() {
            if (head.next == tail) {
                return null; // List is empty
            }
            Node first = head.next;
            removeNode(first);
            size--;
            return first;
        }

        // Print the cache content
        void print() {
            Node temp = head.next;
            while (temp != tail) {
                System.out.println(temp.data + "<|>");
                temp = temp.next;
            }
        }
    }
}
