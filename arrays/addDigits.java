import java.util.Scanner;

public class addDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(addDigit(n));
    }
    public static int addDigit(int num) {
      
        while(count(num)==false)
        {
            int n = 0;
            while(num>0)
            {
                int lastdigit = num%10;
                n+=lastdigit;
                num = num/10;
            }
            num = n;
        }
        return num;
    }
    public static boolean count(int n)
    {
        if(n==0)
        {
            return true;
        }
        int cnt = 0;
        while(n>0)
        {
            cnt++;
            n = n/10;
        }
        return cnt==1;

    }
}
