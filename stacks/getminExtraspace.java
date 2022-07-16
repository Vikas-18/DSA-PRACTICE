import java.util.Stack;

public class getminExtraspace {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-1);
        System.out.println(obj.getMin());
        
    }

    public static class MinStack {
      
        Stack<Integer> st;
        int min;
        public MinStack() {
            st = new Stack<>();
            min = Integer.MAX_VALUE;
        }
        
        public void push(int val) {
            if(st.size()==0)
            {
                st.add(val);
                min = val;
            }
            else if(st.size()!=0 && min<=val)
            {
                st.add(val);
            }
            
            else if(st.size()!=0 && min>val)
            {
                st.add(2*val-min);
                min = val;
            }
        }
        
        public void pop() {
            if(st.size()==0)
            {
                return;
            }
            else{
                
                if(st.peek()<min){
                  min = 2*min-st.peek();
                }

                  st.pop();
            }
        }
        
        public int top() {
            if(st.size()==0)
            {
                return -1;
            }
            else{
                
                if(st.peek()<min){
                    int x = min;
                    min = 2*min-st.peek();
                    return x;  
                }
                  return st.peek();
            }
        }
        
        public int getMin() {
            return min;
        }
    }
    
}
