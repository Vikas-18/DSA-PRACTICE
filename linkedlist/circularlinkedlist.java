public class circularlinkedlist {
    public static void main(String[] args) {
        circularlinkedlist cll = new circularlinkedlist();
        cll.insertattail(2);
        cll.insertattail(3);
        cll.insertattail(4);
        cll.insertattail(5);
        cll.insertattail(6);
        cll.delete(5);
        cll.print();
    }

    public Node head;
    public Node tail;
    public class Node{
        public int val;
        public Node next;

       public Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }

    public void insertattail(int val)
    {
         Node node = new Node(val);
         if(head==null)
         {
            head = node;
            tail = node;
         }

         tail.next = node;
         node.next = head;
         tail = node;
    }

    public void delete(int val)
    {
        Node temp = head;
        if(head == null)
        {
            return;
        }
        if(temp.val == val)
        {
            head = head.next;
            tail.next = head;
            return;
        }

        else{
           
            
                do{
                    Node n = temp.next;

                    if(n.val==val)
                    {
                     temp.next = n.next;
                     return;
                    }

                    temp = temp.next;
                }
                while(temp!=head);
        }
    }

    public void print()
    {
        Node temp = head;
        if(head==null)
        {
            System.out.println("NULL");
            return;
        }
        do {
            System.out.print(temp.val + "->");
            temp = temp.next;
        } while (temp!=head);
        System.out.println("Head");
    }
}
