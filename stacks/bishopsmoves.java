public class bishopsmoves {
    public static void main(String[] args) {
        System.out.println(isPower(4));
    }
     static  int solve(int A, int B) {
         int tempA=A;
         int tempB = B;
   int count = 0;
        while(A!=1 && B!=1)
        {
            count++;
            A--;
            B--;
        }
        A=tempA;
        B=tempB;
         while(A!=1 && B!=8)
        {
            count++;
            A--;
            B++;
        }
         A=tempA;
        B=tempB;
         while(A!=8 && B!=1)
        {
            count++;
            A++;
            B--;
        }
         A=tempA;
        B=tempB;
         while(A!=8 && B!=8)
        {
            count++;
            A++;
            B++;
        }
        return count;
    }
     static int isPower(int A) {
         
        if(A==4)
        {
            return 1;
        }
int ans =0;
        if(A%2==0)
        {
            A=A/2;
             ans = isPower(A);

        }
     

        return ans;
      
    }
}
