import java.util.Scanner;

public class maxmultiplesum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int optimalX = 2; // Initial value for the optimal x
            int maxSum = 0; // Initial value for the maximum sum

            for (int x = 2; x <= n; x++) {
                int k = n / x;
                int sum = x * k * (k + 1) / 2;
                if (sum > maxSum) {
                    maxSum = sum;
                    optimalX = x;
                }
            }

            System.out.println(optimalX);
        }

        scanner.close();
    }
}
