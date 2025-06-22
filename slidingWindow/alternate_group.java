public class alternate_group {
    public static void main(String[]args)
    {
        int[]arr = { 0, 1, 0, 0, 1, 0, 1};
        System.out.println(numberOfAlternatingGroups(arr, 6));
    }
    
    public static  int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int[] arr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            arr[i] = colors[i % n];
        }
        arr[arr.length - 1] = colors[0];
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < arr.length && i<arr.length) {
            if(j==0)
            {
                j++;
            }
            else if ((j - i + 1 < k )  && arr[j] != arr[j - 1]) {
                j++;
            } else if (j > 0 && arr[j] == arr[j - 1]) {
                i++;
            } else if (j - i + 1 == k) {
                ans++;
                j++;
                i++;
            }
        }

        return ans;
    }
}
