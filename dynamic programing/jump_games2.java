public class jump_games2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(ans+1);
    }

//[2,3,1,1,4]
    public static int ans = Integer.MAX_VALUE;
    public static void solve(int[]arr, int idx,int counter)
    {
           //base case
           if(idx+arr[idx]==arr.length-1)
           {
             ans = Math.min(ans, counter);
             return;

           }



           for (int i = 1; i < arr[idx]; i++) {
                counter+=1;
                solve(arr, idx+i, counter);
                counter-=1;
           }


    }
}
