

public class armstrong {
    public static void main(String[] args) {
        System.out.println(solve(371));
    }
    static int solve(int A) {
        int temp=A;
        int armstrong =A;
        int power = 0;
        while(temp>0)
        {
            power++;
            temp=temp/10;

        }
        int num=0;
        while(A>0)
        {
            int lasdigit = A%10;
           num += Math.pow(lasdigit, power);
           A=A/10;
        }
        if(num==armstrong)
        {
            return 1;
        }
        return 0;

    }
}

