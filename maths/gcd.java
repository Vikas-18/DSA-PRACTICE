public class gcd {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        System.out.println(x);
    }
}
