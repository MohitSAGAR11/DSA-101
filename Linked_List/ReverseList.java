package Linked_List;
import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseList {
    // public static ListNode reverseUsingArrayList(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
        
    //     ArrayList<ListNode> nodeList = new ArrayList<>();
    //     ListNode current = head;
        
    //     while (current != null) {
    //         nodeList.add(current);
    //         current = current.next;
    //     }
        
    //     for (int i = nodeList.size() - 1; i > 0; i--) {
    //         nodeList.get(i).next = nodeList.get(i - 1);
    //     }
        
    //     nodeList.get(0).next = null;
        
    //     return nodeList.get(nodeList.size() - 1);
    // }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode present = head;
        ListNode Next = present.next;
 
 
        while(present != null){
         present.next = prev;
         prev = present;
         present = Next;
         if(Next != null){
             Next = Next.next;
         } 
        }
 
        head = prev;
        return prev;
     }


     public static ListNode insertAtFirst(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static ListNode reverseUsingInsertAtFirst(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            newHead = insertAtFirst(newHead, head.val);
            head = head.next;
        }
        return newHead;
    }


    static ListNode reverseListUsingRecursion(ListNode head){
        if (head == null || head.next == null)
            return head;

        // Reverse the rest of the list
        ListNode revHead = reverseListUsingRecursion(head.next);

        // Make the current head the last node
        head.next.next = head;

        // Update the next of current head to NULL
        head.next = null;

        // Return the new head of the reversed list
        return revHead;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static ListNode reverseKNodes(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        
        ListNode prev = null, current = head, next = null;
        int count = 0;
        
        ListNode temp = head;
        for (int i = 0; i < k && temp != null; i++) {
            temp = temp.next;
            count++;
        }
        
        if (count < k) {
            return head;
        }
        
        count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        
        if (next != null) {
            head.next = reverseKNodes(next, k);
        }
        
        return prev;
    }
    
    
}
