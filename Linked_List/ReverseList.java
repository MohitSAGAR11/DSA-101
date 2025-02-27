import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseUsingArrayList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ArrayList<ListNode> nodeList = new ArrayList<>();
        ListNode current = head;
        
        while (current != null) {
            nodeList.add(current);
            current = current.next;
        }
        
        for (int i = nodeList.size() - 1; i > 0; i--) {
            nodeList.get(i).next = nodeList.get(i - 1);
        }
        
        nodeList.get(0).next = null;
        
        return nodeList.get(nodeList.size() - 1);
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Original List:");
        printList(head);
        
        head = reverseUsingArrayList(head);
        
        System.out.println("Reversed List:");
        printList(head);
    }
}
