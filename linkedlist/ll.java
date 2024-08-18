public class ll {
    public static class ListNode {
        private ListNode next;
        private int val;

        // Constructor to initialize the node
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        // Static head pointer
        private static ListNode head;

        // Method to insert a node at the beginning of the list
        public static void insert(int val) {
            ListNode node = new ListNode(val);
            node.next = head;
            head = node;
        }

        // Method to print the list
        public static void printList() {
            ListNode current = head;
            while (current != null) {
                System.out.println(current.val);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        // Insert values into the linked list
        ListNode.insert(5);
        ListNode.insert(6);
        ListNode.insert(7);

        // Print the linked list
        ListNode.printList();
    }
}
