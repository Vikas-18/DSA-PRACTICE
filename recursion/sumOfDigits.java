public class sumOfDigits {
    public static void main(String[] args) {
        System.err.println(sum(1234));
    }
    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }

        int digit = n%10;
        int recAns = sum(n/10);
        return digit + recAns;
    }
}
