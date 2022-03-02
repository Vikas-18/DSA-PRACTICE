
import java.util.*;
public class balanced {
    public static void main(String[] args) {
     
    }

    static int solve(String A) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<A.length(); i++)
        {
            if(A.charAt(i)=='(')
            {
                char ch = A.charAt(i);
                s.push(A.charAt(i));
            }
            else if(A.charAt(0)==')')
            {
                return 0;
            }

            else{
                if(s.size()!=0 && A.charAt(i)==')' && s.peek()=='(')
                {
                   s.pop();
                } 
                else{
                    return 0;
                }
            }
        }

        if(s.size()==0)
        return 1;

        if(s.size()!=0)
        {
            return 0;
        }
        return-1;
    }
   
}
