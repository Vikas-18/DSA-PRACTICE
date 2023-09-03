public class sequence {
    public static void main(String[] args) {
        // 5 25 30 125 130 150 155 625
        int n = 5;
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 25;

        for (int i = 2; i < arr.length; i++) {
            if (isPowerofTwo(i + 1)) {
                arr[i] = (int) Math.pow(5, nthpower(i + 1) + 1);
            } else {
                if (i + 1 % 2 == 0) {

                } else {
                    arr[i] = arr[0] + arr[i - 1];
                }
            }
        }
    }

    public static boolean isPowerofTwo(int n) {
        int ans = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans++;
            }
        }
        return ans == 1;

    }

    public static int nthpower(int n) {
        int ans = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                return ans;
            }
            ans++;
        }
        return -1;
    }
}
