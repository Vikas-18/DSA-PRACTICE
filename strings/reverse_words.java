import java.util.*;
public class reverse_words {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("VPtCBexbhyOqEHWMpF  VJOZpC"));
    }
    static String solve(String A) {
       A =  A.trim();
        Stack<String> st = new Stack<>();
        for(int i=0; i<A.length(); i++)
        {
            String word = "";
            
            while(i<A.length() && A.charAt(i)>=65 && A.charAt(i)<=123)
            {
                word+= A.charAt(i);
                i++;
            }
            if( word!="")
            st.push(word);
            
        }
        String ans = "";
        while(st.size()>0)
        {
        

         
               ans+=" ";
               ans+=st.pop();
           
          
        }
        ans = ans.trim();
        return ans;
    }

    static int lengthOfLastWord(String A) {
        A =  A.trim();
        Stack<String> st = new Stack<>();
        for(int i=0; i<A.length(); i++)
        {
            String word = "";
            
            while(i<A.length() && A.charAt(i)>=65 && A.charAt(i)<=123)
            {
                word+= A.charAt(i);
                i++;
            }
            if( word!="")
            st.push(word);
            
        }
        return st.pop().length();
        
        
    }
}
