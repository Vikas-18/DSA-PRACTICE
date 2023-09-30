public class appearing3times {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 3, 4, 3, 3 };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += tobinary(arr[i]);
        }
        String num = "";
        while (sum > 0) {
            int lastdigit = sum % 10;
            int rem = lastdigit % 3;
            num = rem + num;
            sum = sum / 10;
        }
        System.out.println(todecimal(Integer.parseInt(num)));

    }

    public static int tobinary(int n) {
        String ans = "";
        while (n > 0) {
            int rem = n % 2;
            ans = rem + ans;
            n = n / 2;
        }
        return Integer.parseInt(ans);
    }

    public static int todecimal(int n) {
        int ans = 0;
        int base = 1;

        while (n > 0) {
            ans = ans + (n & 1) * base;
            base = base * 2;
            n = n / 10;
        }
        return ans;
    }
}
