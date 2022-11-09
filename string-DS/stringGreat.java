import java.util.Stack;

public class stringGreat {
    public static void main(String[] args) {
        System.out.println(makeGood("aBAcC"));
    }
    public static String makeGood(String s) {
        String temp1 = s.toLowerCase();
        String temp2 = s.toUpperCase();
        Stack<Character> st = new Stack<>();
        String ans = "";
        
        for (int i= 0; i < s.length(); i++)
        {
            if(st.size()>0 && s.charAt(i)<97 && temp1.charAt(i)==st.peek() || st.size()>0 && s.charAt(i)>=97 && temp2.charAt(i)==st.peek())
            {
               st.pop();
            }
            else
            st.push(s.charAt(i));
            
        }
        
        while(st.size()>0)
        {
            ans =  st.pop()+ans;
        }
   
        return ans;
    }
}
