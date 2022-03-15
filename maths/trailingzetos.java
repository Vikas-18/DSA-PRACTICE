

public class trailingzetos {
    public static void main(String[] args) {
        // System.out.println(solve(8));
        int [] A= {0,4,7,9};
        System.out.println(findMinXor(A));
    }
     static int solve(int A) {
        int i=1;
        int count=0;
        while(!((A&1)==1))
        {
            count++;
            A=A>>1;
        }
        return count;
    }

    static int findMinXor(int[] A) {
        int i=0;
        int j=i+1;
        int ans = 0;
        int res= Integer.MAX_VALUE;

        while(i<=A.length-2)
        {
            ans = A[i]^A[j];
            if(res>ans)
            res=ans;
            if(j<A.length-2)
            j++;
            else{
                break;
            }
            if(j<=A.length-1)
            {
                i++;
                j=i+1;
            }
        }
        return res;
    }
}
