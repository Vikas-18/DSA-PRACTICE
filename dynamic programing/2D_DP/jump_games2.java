import java.util.Arrays;

public class jump_games2 {
    public static void main(String[] args) {
        int[] nums = {2,1};
        int[]dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        System.out.println(solve(nums, 0,dp));
      
    }

//[2,3,1,1,4]
public static int solve(int[]arr,int idx,int[]dp)
{
    //base case
    if(idx==arr.length-1)
    {
      return 0;
    }
    if(idx>=arr.length)
    {
        return Integer.MAX_VALUE;
    }
    if(dp[idx]!=-1)
    {
        return dp[idx];
    }
    int mini = 10000;
    for(int i=1; i<=arr[idx]; i++)
    {
      
        mini = Math.min(mini,solve(arr, idx+i,dp));
    }
    return dp[idx] =  mini+1;
}

 }
