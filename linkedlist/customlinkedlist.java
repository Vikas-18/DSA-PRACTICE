public class customlinkedlist {
    public static void main(String[] args) {
        customlinkedlist ll = new customlinkedlist();
        ll.insert(13);
        ll.insert(11);
        ll.insert(15);
        ll.insert(18);
        ll.size();
        ll.print();
        ll.reverse();
        
    }

    private Node head;
    private int size =0;
    class Node{
      private  int data;
       private Node next;

         Node(int data)
       {
        this.data = data;
        this.next = null;
        
       }
    }

 

    public void insert(int data)
    { 
       Node node = new Node(data);
        if(head==null)
        {
            head = node;
            size++;
            return;
        }    
      
        node.next = head;
        head = node;
        size++;
    }

    public void print()
    {
        Node temp = head;
        
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            
            temp = temp.next;
        }
        System.out.println();
    }
//reverse a linked list
    public void reverse()
    {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node temp = prev;
        
        while(temp!=null)
        {
          System.out.print(temp.data+"->");
          
            temp = temp.next;
        }
        System.out.println();
    }
//adjacent swap nodes
     public Node swapPairs(Node head) {
        if(head==null)
        {
            return head;
        }
        int k=0;
        Node curr = head;
        Node prev= null;
        Node next = null;
        
        while(curr!=null && k<2)
        {
           next = curr.next;
           curr.next = prev;
            prev = curr;
            curr = next;
            k++;
        }
        
        if(next!=null)
        {
            head.next = swapPairs(next);
            
            
        }
        
        return prev;

    }

    public void size()
    {
        Node temp = head;
        int count = 0;
        while (temp!=null) {
            
            count++;
            temp = temp.next;
        }

        System.out.println(count);
       
      
    }

    

}


