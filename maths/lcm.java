public class lcm {
    public static void main(String[] args) {
        int x = 8;
        int y = 26;

        System.out.println((x * y) / gcd(x, y));
    }

    public static int gcd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }
}
