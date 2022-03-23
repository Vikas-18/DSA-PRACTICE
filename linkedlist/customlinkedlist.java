
public class customlinkedlist {
    public static void main(String[] args) {
        customlinkedlist ll1 = new customlinkedlist();
        
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
//add two numbers 2
public Node addTwoNumbers(Node l1, Node l2) {
        Node ll1 = reverse(l1);
        Node ll2 = reverse(l2);
        
        Node ans = new Node(-1);
        Node dummy = ans;
        
        int carry = 0;
        while(ll1!=null && ll2!=null)
        {
            int sum = ll1.data + ll2 .data + carry;
            int lastdigit = sum%10;
            dummy.next = new Node(lastdigit);
            carry = sum/10;
            ll1 = ll1.next;
            ll2 = ll2.next;
            dummy = dummy.next;
        }
        
         while(ll1!=null)
        {
            int sum = ll1.data  + carry;
            int lastdigit = sum%10;
            dummy.next = new Node(lastdigit);
            carry = sum/10;
              ll1 = ll1.next;
              dummy = dummy.next;
        }
        
            while(ll2!=null)
        {
            int sum = ll2.data  + carry;
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


