import java.util.Scanner;

public class phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = 0;

            // odd 11 cells even 7 cells
            while (y > 0) {

                if (y >= 2) {
                    y = y - 2;
                    ans++;
                } else {
                    ans++;
                    y--;
                }
            }
            // ans is even then for x 7 cells in each screen
            if (ans % 2 == 0) {
                int cells = ans * 7;
                if (x > cells) {
                    x = x - cells;
                    while (x > 0) {
                        if (x >= 15) {
                            x = x - 15;
                            ans++;
                        } else {
                            ans++;
                            x = 0;
                        }
                    }
                }
            }
            // ans is odd then in last screen 11 cells are remaiing
            else {
                int cells = 0;
                if (y % 2 == 1)
                    cells = (ans - 1) * 7 + 11;
                else {
                    cells = ans * 7;
                }
                if (x > cells) {
                    x = x - cells;
                    while (x > 0) {
                        if (x >= 15) {
                            x = x - 15;
                            ans++;
                        } else {
                            ans++;
                            x = 0;
                        }
                    }
                }

            }

            System.out.println(ans);

        }
    }
}
