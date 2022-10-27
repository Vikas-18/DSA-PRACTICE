import java.util.Stack;

public class baseball2 {

    public static void main(String[] args) {
       String[] operations = {"5","2","C","D","+"};
       System.out.println(calPoints(operations));
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>(); 
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+"))
            {
                int pop1 = st.pop();
                int pop2 = st.pop();
                int newentry = pop1+pop2;
                st.add(pop2);
                st.add(pop1);
                st.add(newentry);
            }
            else if(operations[i].equals("D"))
            {
                int pop1 = st.pop();
                int newentry = pop1*2;
                st.add(pop1);
                st.add(newentry);
            }
           else if(operations[i].equals("C"))
            {
                
                st.pop();
            }
            else
            {
               int newentry = Integer.parseInt(operations[i]);
               st.add(newentry);
            }
        }
        int ans = 0;
       while(st.size()>0)
       {
         ans+=st.pop();
       }

       return ans;
    }
}
