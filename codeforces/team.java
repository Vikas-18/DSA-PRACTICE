import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < 3; j++) {
                int num = sc.nextInt();
                if (num == 1)
                    cnt++;
            }
            if (cnt >= 2) {
                ans++;
            }
        }
        System.out.println(ans);

    }
}