

public class pow {

public static void main(String[] args) {
     System.out.println(myPow(2,8));
}
static double myPow(double x,  int n) {
    if(n==0)
    {
     return 1;
    }
        
    if(n==2)
        return x*x;
    
    if(n%2 == 0)
        return myPow( myPow(x, n/2), 2);
    else if(n>0)
        return x * myPow( myPow(x, n/2), 2);
    else
        return 1/x * myPow( myPow(x, n/2), 2);
        
    }
}
