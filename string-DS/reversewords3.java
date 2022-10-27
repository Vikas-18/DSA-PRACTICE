import java.util.LinkedList;
import java.util.Queue;


public class reversewords3 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String word = "";
        Queue<String> st = new LinkedList<>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=32)
            {
                word+=s.charAt(i);
                if(i==s.length()-1)
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
            ans = ans + " "+reverse(st.remove()); 
         }
         String result = ans.trim();
         return result;
    }
    public static String reverse(String s)
    {
        String ans = "";
        char[] ch = s.toCharArray();
        int i=0; 
        int j =ch.length-1;
        while(i<j)
        {
            swap(i,j,ch);
            i++;
            j--;
        }

        for(i=0; i<ch.length; i++)
        {
            ans+=ch[i];
        }
        return ans;

    }
    public static void swap(int i,int j,char[]arr)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
