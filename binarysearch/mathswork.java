import java.util.Arrays;

public class mathswork {
    public static void main(String[] args) {
        int[]nums = {2,10,5,4,8};
        int[]maxes = {3,1,7,8};
        int[]ans = new int[maxes.length];
        for (int i = 0; i < maxes.length; i++) {
            int counter=0;
            counter = ceil(nums, maxes[i]);
            ans[i] = counter;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static int ceil(int[]nums,int target)
    {
        int s= 0;
        int e = nums.length-1;

        while(s<=e)
        {
            int  mid = s + (e-s)/2;

            if(nums[mid]==target)
            {
                return mid;
            }

            else if(nums[mid]<target)
            {
                s = mid+1;
            }

            else {
                e = mid-1;
            }
        }
        if(e==-1)
        {
            return 0;
        }
        if(e==0)
        {
            return 1;
        }
        return e;
    }
}
