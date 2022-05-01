public class uniquepaths {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[3][7];
        System.out.println(solve(arr, 0, 0));
    }
    static int ans1 = 0;
    static int ans2 = 0;
    public static int solve(boolean[][] arr,int row,int col)
    {
        if(row==arr.length-1 && col==arr[0].length-1)
        {
            return 1;
        }

        if(row>=arr.length|| col>=arr[0].length)
        {
            return 0;
        }
        ans1 = solve(arr, row+1, col);
        ans2 = solve(arr, row, col+1);
       return ans1 + ans2;
    }
}
