public class doublylinkedlist2 {
    public static void main(String[] args) {
        doublylinkedlist2 ddl = new doublylinkedlist2();
        ddl.insertatfirst(5);
        ddl.insertatfirst(3);
        ddl.insertatfirst(4);
        ddl.insertatfirst(1);
        ddl.insertlast(9);
        ddl.printfrontwards();
        ddl.printbackwards();
    
    }

    public Node head;
    public class Node{
         int val;
         Node next;
         Node prev;
         Node(int val)
         {
            this.val = val;
            this.next = null;
            this.prev = null;
         }
    }

    public void insertatfirst(int data){
           //creation of node
           Node node = new Node(data);
           if(head==null)
           {
            node.next = null;
            node.prev = null;
            head = node;//head will be the first node
            return;
           }

           node.next = head;
           node.prev = null;
           head.prev = node;
           head = node;
    }

    public void printfrontwards()
    {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void printbackwards()
    {
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }

        while(temp!=null)
        {
            System.out.print(temp.val + "->");
            temp  = temp.prev;
        }
        System.out.println("end");
    }

    public void insertlast(int data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            insertatfirst(data);
            return;
        }

        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }

        temp.next = node;
        node.next = null;
        node.prev = temp;
    }
}
