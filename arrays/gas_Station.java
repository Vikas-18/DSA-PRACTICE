

/**
 * gas_Station
 */
public class gas_Station {

    public static void main(String[] args) {
        int[]gas = {1,2,3,4,5};
        int[]cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
        //when ever we saw that the sum is positive and not going to -ve value again then that will be our ans, and also check that total sum is positve as well
    }
     public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum =0;
        int tsum = 0;
        int ans=0;
        for(int i=0; i<gas.length; i++)
        {
            sum = sum + (gas[i]-cost[i]);
            if(sum<0)
            {
                ans = i+1;
                sum=0;
            }
            
            tsum+=gas[i]-cost[i];
        }
        if(tsum<0)
        {
            return -1;
        }
        return ans;
    }
}