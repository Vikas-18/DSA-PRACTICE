public class stacksandqueues {
    public static void main(String[] args) {
        stacks st = new stacks();
        st.push(4);
        st.push(3);
        st.push(2);
        st.pop();
    int top =    st.top();
    System.err.println(top);
      

    }

   static class stacks{
       static  int size = 5;
      static int [] arr = new int[5];
      static int data;
    static   int top = -1;

stacks()
{
    this.size=size;
    this.data=data;
}
      stacks(int data)
    {
       this.data=data;
        
    }

 static void push(int data)
     {
         if(top!=5)
         {
         top++;
         arr[top]=data;
         }
     }
 static int top()
     {
        return arr[top];
     }


static void pop()
{
    if(top!=-1)
    {
        
        top--;

    }
}


   } 
}
