public class dynamicstack {
    public static void main(String[] args) throws Exception {
        dynamicstack st = new dynamicstack();
        st.push(3);
        st.push(6);
        st.push(7);
    
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        
        
      
        
        
    }
   
    public int[] arr;
    public int DEFAULT_SIZE = 5;
    public int ptr = 0;
    dynamicstack()
    {
        this.arr = new int[DEFAULT_SIZE];
    }
    public void push(int data)
    {
       if(isFull())
       {
         resize();
         arr[ptr] = data; 
         ptr++;
         return;
       }
       arr[ptr] = data; 
       ptr++;
    }

    private void resize() {
        int[] temp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
    private boolean isFull() {

        return ptr==arr.length;
    }
    public int pop() throws Exception
    {
        if(ptr==-1)
        {
            throw new Exception("Stack is Empty");
        }

        ptr--;
      
        return arr[ptr];

    }


}
