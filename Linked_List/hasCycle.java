package Linked_List;

public class hasCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        hasCycle obj = new hasCycle();
        ListNode head = obj.new ListNode(3);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(0);
        head.next.next.next = obj.new ListNode(-4);
        head.next.next.next.next = head.next;
        System.out.println(obj.HasCycle(head));
    }

    public boolean HasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode start = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            start = start.next;
            fast = fast.next.next;

            if(start == fast) return true;
        }

        return false;
    }
}
