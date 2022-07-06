
public class titleT0Number {
    public static void main(String[] args) {
        //A->65
        String s = "AB";
        System.out.println(solve(s));
       
    }

 
    public static  int solve(String s)
    {
        double ans = 0;
        double j=1;
        double i=s.length()-2;
        ans =  ans + s.charAt(s.length()-1)-64*1;
        
        while(i>=0)
        {
            int num =  s.charAt((int)i)-64;
            ans = ans + num*Math.pow(26.0, j);
            
            i--;
            j++;
        }
        return (int)ans;
        
        
    }
}
