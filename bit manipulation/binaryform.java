import java.util.Scanner;

public class binaryform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String ans = "";
        while (n > 0) {
            int rem = n % 2;
            ans = rem + ans;
            n = n / 2;
        }
        System.out.println(Integer.parseInt(ans));
    }
}
