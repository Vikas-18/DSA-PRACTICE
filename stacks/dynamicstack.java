public class dynamicstack {
    public static void main(String[] args) throws Exception {
        dynamicstack st = new dynamicstack();
        st.push(3);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(5);
        st.push(5);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        
      
        
        
    }
   
    public int[] arr;
    public int size = 5;
    public int ptr = -1;
    dynamicstack()
    {
        this.arr = new int[size];

    }
    public void push(int data)
    {
        if(ptr==arr.length)
        {
            this.arr = new int[10];
        }

        ptr++;
        arr[ptr] = data;
        return;
    }

    public int pop() throws Exception
    {
        if(ptr==-1)
        {
            throw new Exception("Stack is Empty");
        }

       int removed = arr[ptr];
       ptr--;
       return removed;
    }


}
