import java.util.Arrays;
import java.util.Scanner;

public class representBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();

            int[] ans = new int[32];
            int idx = 31;
            // 15
            while (x > 0) {
                int digit = x % 2;
                ans[idx--] = digit;
                x = x / 2;
            }
            int i = 0;
            int j = 31;
            while (i <= j) {
                int temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
                i++;
                j--;
            }
            System.out.println(32);
            System.out.println(ans);
        }
    }
}
