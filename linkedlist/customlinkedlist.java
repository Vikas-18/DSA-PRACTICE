
public class customlinkedlist {
    public static void main(String[] args) {
        customlinkedlist ll1 = new customlinkedlist();
        ll1.insertatfirst(3);
        ll1.insertatfirst(2);
        ll1.insertatfirst(1);
        ll1.insertatfirst(0);
        ll1.insertatfirst(5);
        ll1.insertatlast(4);
        ll1.print();
        ll1.reverse();

    }

    private Node head;
    private int size =0;
    class Node{//basic structure for LinkedList
      private  int val;
      private Node next;

        Node(int val)
       {
        this.val = val;
        this.next = null;
        
       }
    }

 

    public void insertatfirst(int val)
    { 
       Node node = new Node(val);
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
    
    public void insertatlast(int val)
    {
        Node node  = new Node(val);
        if(head==null)
        {
            head = node;
            head.next = null;
            return;
        }
        Node temp  = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }

        temp.next = node;
        node.next = null;
 
    }
    public void print()
    {
        Node temp = head;
        
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            
            temp = temp.next;
        }
        System.out.println("NULL");
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
          System.out.print(temp.val+"->");
          
            temp = temp.next;
        }
        System.out.println("NULL");
    }
//adjacent swap nodes, use recursion 
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
//add two numbers 2 represented as linked list
public Node addTwoNumbers(Node l1, Node l2) {
        Node ll1 = reverse(l1);
        Node ll2 = reverse(l2);
        
        Node ans = new Node(-1);
        Node dummy = ans;
        
        int carry = 0;
        while(ll1!=null && ll2!=null)
        {
            int sum = ll1.val + ll2 .val + carry;
            int lastdigit = sum%10;
            dummy.next = new Node(lastdigit);
            carry = sum/10;
            ll1 = ll1.next;
            ll2 = ll2.next;
            dummy = dummy.next;
        }
        
         while(ll1!=null)
        {
            int sum = ll1.val  + carry;
            int lastdigit = sum%10;
            dummy.next = new Node(lastdigit);
            carry = sum/10;
              ll1 = ll1.next;
              dummy = dummy.next;
        }
        
            while(ll2!=null)
        {
            int sum = ll2.val  + carry;
            int lastdigit = sum%10;
            dummy.next = new Node(lastdigit);
            carry = sum/10;
                 ll2 = ll2.next;
                 dummy = dummy.next;
        }
            while(carry!=0)
        {
            int sum = carry;
            int lastdigit = sum%10;
            dummy.next = new Node(lastdigit);
            carry = sum/10;
            dummy = dummy.next;
        }
        
      
        return ans.next;
    }
    
    public Node reverse(Node head)
    {
       Node prev = null;
       Node next = null;
        Node curr = head;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr =next;
        }
        return prev;
    }
    //first find mid then set a pointer at mid and another pointer at start then recreate the list

    //reorder list medium
      public Node reorderList(Node head) {
         if(head==null || head.next==null)
        {
            return head;
        }
        Node ans = head;
        Node mid = middle(head);
        Node hs = reverse(mid);
        Node hf = head;
        
        while(hf!=null && hs!=null)
        {
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;
            
            temp = hs.next;
            hs.next = hf;
            hs = temp;
            
        }
        if(hf!=null)
        {
            hf.next =null;
        }
        return ans;

    }
    public Node middle(Node head)
    {
        Node f = head;
        Node s = head;
        
        while(f!=null && f.next!=null)
        {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
}


