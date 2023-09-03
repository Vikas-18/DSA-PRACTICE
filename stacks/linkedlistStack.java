public class linkedlistStack {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class Customstack {

        static Node head = null;

        public static boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public static void push(int val) {
            Node newNode = new Node(val);

            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.val;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.val;
        }
    }

    public static void main(String[] args) {
        // Customstack s = new Customstack();
        Customstack.push(1);
        Customstack.push(2);
        Customstack.push(1);
        Customstack.push(4);

        while (!Customstack.isEmpty()) {
            int val = Customstack.pop();
            System.out.println(val);
        }
        System.out.println(Customstack.pop());

    }
}
