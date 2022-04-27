import java.util.Arrays;

public class houserob {
    public static void main(String[] args) {
        int[] nums = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        boolean[] f = new boolean[nums.length];
        int[] dp  = new int[nums.length+1];
        Arrays.fill(dp, 0,dp.length, -1);
        System.out.println(solve(nums,nums.length-1,f,0,dp));
    }
    static int ans = 0;
    static int solve(int[] arr,int idx,boolean[] f,int sum,int[] dp)
    {
        if(idx==0)
        {

            if(!f[idx+1])
            {
                sum += arr[0];
                if(ans<sum)
                ans = sum;
            }
            else if(ans<sum){
                ans = sum;
            }
            return sum;
        }
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
       
        if(idx==arr.length-1)
        {
            f[idx] = true;
            sum+=arr[idx];
            dp[idx] =  solve(arr,idx-1,f,sum,dp);
            f[idx] = false;
            sum-=arr[idx];
            dp[idx] =  solve(arr,idx-1,f,sum,dp);
        }
        if( idx<arr.length-1 && !f[idx-1] && !f[idx+1])
        {   f[idx] = true;
            sum+=arr[idx];
            dp[idx] =   solve(arr,idx-1,f,sum,dp);
            f[idx] = false;
            sum-=arr[idx];
            dp[idx] =   solve(arr,idx-1,f,sum,dp);
        }
        else{
            dp[idx] =   solve(arr,idx-1,f,sum,dp);
        }
        
        return ans;
        
    }
}
