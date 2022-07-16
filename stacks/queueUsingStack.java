import java.util.Stack;

public class queueUsingStack {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.peek();
        obj.pop();
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }

    public static class MyQueue {

        
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();
    public MyQueue() {
        
    }
    
    public void push(int x) {
      s2.add(x);
    }
    
    public int pop() {
        
        if(s1.empty()){
           while(!s2.empty()){
           s1.add(s2.pop());
       }
         s2.clear();
        }
       
        return s1.pop();
    }
    
    public int peek() {
        if(s1.empty()){
           while(!s2.empty()){
           s1.add(s2.pop());
       }
         s2.clear();
        }
      return   s1.peek();
    }
    
    public boolean empty() {
       return (s1.empty() && s2.empty());
    }
    }
    
}
