import java.util.Arrays;
import java.util.Scanner;

public class mergesortingalgo {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 5, 1, 2 };

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(mergesort(arr)));

    }

    public static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                arr[k++] = nums2[j++];
            } else {
                arr[k++] = nums1[i++];
            }
        }
        while (i < nums1.length) {
            arr[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            arr[k++] = nums2[j++];
        }
        return arr;
    }

}
