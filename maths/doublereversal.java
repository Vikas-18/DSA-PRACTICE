public class doublereversal {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
    }

      static boolean isSameAfterReversals(int num) {
         int check = num%10;
            if(check==0)
            {
                return false;
            }
        int reverse1 = 0;
        
        while(num>0)
        {
            int lastdigit = num%10;
            reverse1 = reverse1*10 + lastdigit;
            num = num/10;
        }
        int temp = reverse1;
        int reverse2 = 0;
        while(reverse1>0)
        {
            
            int lastdigit = reverse1%10;
            reverse2 = reverse2*10 + lastdigit;
            reverse1 = reverse1/10;
        }
        if(temp==reverse2)
            return true;
        
        return false;
    }
}
