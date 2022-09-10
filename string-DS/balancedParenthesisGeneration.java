import java.util.ArrayList;

public class balancedParenthesisGeneration {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }

    public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        int open  =n;
        int close =n;
        String op = "";
        solve(open,close,ans,op);
        return ans;
    }
    
    public static void solve(int open ,int close,ArrayList<String> ans,String op)
    {
        if(open==0 && close==0)
        {
            ans.add(op);
            return ;
        }
        
        if(open>0)//till the time we have open brackets we can take it
        {
            String op1 = op;
            op1+="(";
            solve(open-1,close,ans,op1);
            
        }
        
        if(open<close)//if closed bracket is more that means we need to use it now 
        {
            String op2 = op;
            op2+=")";
            solve(open,close-1,ans,op2);
        }
    }
}
