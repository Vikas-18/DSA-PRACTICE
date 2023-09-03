public class sequence {
    public static void main(String[] args) {
        // 5 25 30 125 130 150 155 625
        System.out.println(solve(9));
    }

    public static int solve(int n) {

        int power = 1;
        int ans = 0;
        while (n > 0) {
            ans = ans + (n & 1) * (int) (Math.pow(5, power));
            n = n >> 1;
            power++;
        }
        return ans;
    }
}
