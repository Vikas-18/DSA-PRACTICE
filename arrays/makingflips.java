public class makingflips {
    public static void main(String[] args) {
        System.out.println(minFlips(2, 6, 5));
    }

    public static int minFlips(int a, int b, int c) {
        int ans = 0;
        while (a > 0 || b > 0 || c > 0) {
            int check1 = a & 1;
            int check2 = b & 1;
            int check3 = c & 1;
            if (check1 == 0 && check2 == 0 && check3 == 1) {
                ans++;
            } else if (check1 == 1 && check2 == 1 && check3 == 0) {
                ans += 2;
            } else if (check1 == 1 && check2 == 0 && check3 == 0) {
                ans++;
            } else if (check1 == 0 && check2 == 1 && check3 == 0) {
                ans++;
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;

        }
        return ans;
    }
}
