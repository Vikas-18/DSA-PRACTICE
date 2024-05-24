import java.util.Scanner;

public class specialwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s = sc.nextLine();

            if (s.length() > 10) {
                String ans = "";
                ans = ans + s.charAt(0);
                ans = ans + Integer.toString(s.length() - 2);
                ans = ans + s.charAt(s.length() - 1);
                System.out.println(ans);
            } else {
                System.out.println(s);
            }
        }
    }
}
