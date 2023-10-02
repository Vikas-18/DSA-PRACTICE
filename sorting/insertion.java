import java.util.Arrays;

/**
 * insertion
 */
public class insertion {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(j - 1, j, arr);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}