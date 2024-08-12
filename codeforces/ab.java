import java.util.Scanner;

public class ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(sum(n));
        }
        sc.close();
    }

    public static int sum(int n) {
        int ans = 0;

        while (n > 0) {
            int digit = n % 10;
            ans += digit;
            n = n / 10;
        }
        return ans;
    }
}
