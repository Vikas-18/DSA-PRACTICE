public class squareroot {
    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }
//use long instead of int in leetcode
     static int mySqrt(int n) {
             int start=1;
             int end=n;
              int ans=n;
    while(start<end)
    {    
       int  mid=start+(end-start)/2;
        if (mid*mid==n )
       {
         ans = (int)mid;
            return ans;
        
       }
        if (mid*mid>n)
       {
        end=mid-1;
       }
        else{
            start = mid+1;
        }

    }
    if(start*start>n)
    {
        return start-1;
    }
        return (int)start;
       
    }
}
