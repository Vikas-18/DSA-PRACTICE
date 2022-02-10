import java.util.*;
public class stacksandqueues {
    public static void main(String[] args) {
        stacks st = new stacks();
        st.push(4);
        st.push(3);
        st.push(2);
        st.print();

    }

   static class stacks{
       static int size = 5;
    static int [] arr = new int[5];
   static int data;
    static int top = -1;

    static  stacks()
    {
        this.size = size;
        
    }

     static void push(int data)
     {
         top++;
         arr[top]=data;
     }

static void print()
{
    int i=0;
     while (i<=top) {
         System.out.println(arr[i]);
         
     }
}


   } 
}
