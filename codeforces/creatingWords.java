import java.util.Scanner;

public class creatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            String ans1 = "";
            ans1 += b.charAt(0);
            ans1 += a.charAt(1);
            ans1 += a.charAt(2);

            String ans2 = "";
            ans2 += a.charAt(0);
            ans2 += b.charAt(1);
            ans2 += b.charAt(2);

            System.out.println(ans1 + " " + ans2);

        }
    }
}
