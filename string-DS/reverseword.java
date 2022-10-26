import java.util.Stack;

public class reverseword {
    public static void main(String[] args) {
        System.out.println(reverseWords("the vikas kumar show"));
    }
    public static String reverseWords(String s) {
        String word = "";
        String s1 = s.trim().replaceAll(" +", " ");
        Stack<String> st = new Stack<>();
        for(int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i)!=32)
            {
                word+=s1.charAt(i);
                if(i==s1.length()-1)
                {
                    st.add(word);
                }
            }
            else
            {
                st.add(word);
                word="";
            }
        }
         
         String ans = "";
         while(st.size()>0)
         {
            ans = ans + " "+st.pop(); 
         }
         String result = ans.trim();
         return result;
    }
}
