import java.util.*;
public class reverse_words {
    public static void main(String[] args) {
        System.out.println(solve("zlue sky is vikas"));
    }
    static String solve(String A) {

        Stack<String> st = new Stack<>();
        for(int i=0; i<A.length(); i++)
        {
            String word = "";
            
            while(i<A.length() && A.charAt(i)>=97 && A.charAt(i)<=123)
            {
                word+= A.charAt(i);
                i++;
            }
            
            st.push(word);
        }
        String ans = "";
        int counter = 0;
        while(st.size()>0)
        {
           if(counter==0 || counter==st.size()-1)
           {
           ans += st.pop();
           counter++;
           }

           else{
               ans+=" ";
               ans+=st.pop();
               counter++;
           }
          
        }
        return ans;
    }
}
