public class customstack  {
    public static void main(String[] args) throws Exception {
        customstack st = new customstack();
        st.push(7);
        st.push(9);
        st.push(10);
        st.push(90);

      System.out.println(st.pop());
      System.out.println(st.pop());
      System.out.println(st.pop());
      System.out.println(st.pop());
      System.out.println(st.peek());
      System.out.println(st.pop());
    }
    
    customstack()
    {
        this.arr = new int[default_size];
    }
    public  int[] arr;
    public int default_size = 10;
    public int ptr = -1;

    public void push(int val)
    { 
        if(isFull())
        {
            System.out.println("Stack is Full");
            return;
        }
       ptr++;
       arr[ptr] = val;
    }

    public boolean isFull()
    {
        return  ptr==arr.length;
    }

    public boolean isEmpty()
    {
        return ptr == -1;
    }

    public int pop() throws Exception
    {
        if(isEmpty())
        {
           throw new Exception("Stack is Empty");
        }
        int removed = arr[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        return arr[ptr];
    }
}
