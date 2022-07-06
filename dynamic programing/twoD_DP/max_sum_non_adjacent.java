package twoD_DP;
public class max_sum_non_adjacent {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,5};
        solve(arr, 0,0);
        System.out.println(ans);
    }

    static int  ans = Integer.MIN_VALUE;
    static void solve(int[] arr,int idx,int sum)
    {
        // base case
        if(idx>=arr.length)
        {
            ans = Math.max(ans,sum);
            return;
        }

        //pick
        sum+=arr[idx];
        solve(arr, idx+2, sum);
        sum-=arr[idx];
        //not pick
        solve(arr, idx+1, sum);
    }
}
