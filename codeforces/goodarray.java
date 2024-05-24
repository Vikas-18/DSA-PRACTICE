import java.util.Scanner;

/**
 * goodarray
 */
public class goodarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            if (n == 1) {
                System.out.println("NO");
            } else {
                int max = -1;
                for (int i = 0; i < arr.length; i++) {
                    max = Math.max(max, arr[i]);
                }
                if (max >= n) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}