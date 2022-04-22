public class bishopsmoves {
    public static void main(String[] args) {
        System.out.println(solve(8, 8));
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
}
