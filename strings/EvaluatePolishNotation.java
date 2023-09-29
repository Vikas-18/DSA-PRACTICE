import java.util.Stack;

public class EvaluatePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>(); 
        for(String s : tokens){
                if(s.equals("+")){
                    int a = stk.pop(); 
                    int b = stk.pop(); 
                    stk.push(a+b);
                 }
               else if(s.equals("-")){
                    int a = stk.pop(); 
                    int b = stk.pop(); 
                    stk.push(b-a);
        }
                else if(s.equals("*")){
                    int a = stk.pop(); 
                    int b = stk.pop(); 
                    stk.push(a*b);
        }
                else if( s.equals("/")){ 
                    int a = stk.pop(); 
                    int b = stk.pop(); 
                    stk.push(b/a);
                }
                else  stk.push(Integer.parseInt(s));
        }
        return stk.peek();
    }
}
