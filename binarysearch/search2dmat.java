/**
 * search2dmat
 */
public class search2dmat {

    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int t = 3;
        System.out.println(searchMatrix(arr, t));
    }

    public static boolean searchMatrix(int[][] arr, int t) {

        int row = 0;

        while (row < arr.length) {
            if (arr[row][0] <= t && arr[row][arr[0].length - 1] > t) {
                return solve(arr, row, t);
            }
            row++;
        }
        return false;
    }

    public static boolean solve(int[][] arr, int r, int t) {
        int s = 0;
        int e = arr[0].length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[r][mid] == t)
                return true;

            else if (arr[r][mid] > t) {
                e--;
            } else {
                s++;
            }
        }
        return false;
    }

}