public class pascals {
    public static void main(String[] args) {
        solve(5);
    }

    public static void solve(int numRows) {

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
