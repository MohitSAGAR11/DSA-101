package Linked_List;
class LinkedList {
    static class Node {
        int val;
        Node next;
        
        public Node(int val) {
            this.val = val;
        }

        public static Node head;

        public static void insert_node(int position, int value) {
            if (position < 1) return;
            Node node = new Node(value);
            if (position == 1) {
                node.next = head;
                head = node;
                return;
            }

            Node temp = head;
            for (int i = 0; i < position - 2 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) return;
            node.next = temp.next;
            temp.next = node;
        }

        public static void delete_node(int position) {
            if (position < 1 || head == null) return;
            if (position == 1) {
                head = head.next;
                return;
            }

            Node temp = head;
            for (int i = 0; i < position - 2 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) return;
            temp.next = temp.next.next;
        }

        public static void print_ll() {
            Node temp = head;
            StringBuilder sb = new StringBuilder();
            while (temp != null) {
                sb.append(temp.val).append(" ");
                temp = temp.next;
            }
            if (sb.length() > 0) sb.setLength(sb.length() - 1);
            System.out.println(sb);
        }
    }
}

