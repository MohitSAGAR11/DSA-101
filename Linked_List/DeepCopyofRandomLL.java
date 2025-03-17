package Linked_List;

import java.util.HashMap;

class ListNode{
    int data;
    ListNode next, random;
    ListNode(int x){
        data = x;
        next = random = null;
    }
}
public class DeepCopyofRandomLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(13);
        head.next.next = new ListNode(11);
        head.next.next.next = new ListNode(10);
        head.next.next.next.next = new ListNode(1);

        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;
        head.next.next.next.next.next.random = head.next;

        DeepCopyofRandomLL obj = new DeepCopyofRandomLL();
        ListNode res = obj.copyRandomList(head);
        while(res != null){
            System.out.println(res.data);
            res = res.next;
        }
    }

    public ListNode copyRandomList(ListNode head) {
         if (head == null) return null;  // Handle the edge case where the list is empty.
    
    // Create a HashMap to map original nodes to their copies.
    HashMap<ListNode, ListNode> map = new HashMap<>();
    
    // First pass: create a copy of each node and store the mapping.
    ListNode temp = head;
    while (temp != null) {
        ListNode node = new ListNode(temp.val);
        map.put(temp, node);  // Use put() to add entries into the HashMap.
        temp = temp.next;
    }
    
    // Second pass: assign next and random pointers for the copied nodes.
    temp = head;
    while (temp != null) {
        ListNode copyNode = map.get(temp);
        copyNode.next = map.get(temp.next);       // If temp.next is null, map.get(null) returns null.
        copyNode.random = map.get(temp.random);   // Same for the random pointer.
        temp = temp.next;
    }
    
    // Return the head of the cloned list.
    return map.get(head);
    }


}
