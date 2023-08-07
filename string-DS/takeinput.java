import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Consume the newline character left in the buffer after reading integers
        sc.nextLine();

        String[][] arr = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextLine();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
