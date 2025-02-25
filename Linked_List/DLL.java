package Linked_List;

public class DLL {
    Node head;
    Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null)
            head.prev = node;
        else
            tail = node;
        head = node;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        while(last.next != null){
            last = last.next;
        }
        if(head == null){
            head = node;
            return;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }

    public void Display_Rev(){
        for(Node temp = tail; temp != null; temp = temp.prev){
            System.out.print(temp.val + " -> ");
        }
        System.out.print("END");
        System.out.println();
    }

    public void insert(int after, int val){
       Node p = find(after);
         if(p == null){
              System.out.println("Node not found");
              return;
         }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }


    }

    public Node find(int val){
        Node temp = head;
        // int index = 0;
        while(temp != null){
            if(temp.val == val){
                return temp;
            }
            temp = temp.next;
            // index++;
        }
        return null;
    }


}
