public class linkedlistStack {
    public static class Node{
        int val;
        Node next;
        public Node(int val)
        {
            this.val = val;
            this.next = null;
        }
     }
    public static class Customstack{
        
         Node head = null;
         public boolean isEmpty()
         {
            if(head==null)
            {
                return true;
            }
            return false;
         }

         public void push(int val)
         {
            Node newNode = new Node(val);

            if(isEmpty())
            {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
         }

         public int pop()
         {
            if(isEmpty())
            {
                return -1;
            }

            int top = head.val;
            head = head.next;
            return top;
         }

         public int peek()
         {
            if(isEmpty())
            {
                return -1;
            }

            return head.val;
         }
    }
    public static void main(String[] args) {
        Customstack s = new Customstack();
            s.push(1);
            s.push(2);
            s.push(1);
            s.push(4);
    
            while(!s.isEmpty())
            {
                int val = s.pop();
                System.out.println(val);
            }
            System.out.println(s.pop());
            
    }
}
