public class kokoEatingBananas {
    public static void main(String[] args) {
        int[]piles  = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int s = piles[0];
        int e  = piles[piles.length-1];
        int ans = -1;
        while(true)
        {
            int mid = s+(e-s)/2;
            int cnt = 0;
            for(int i=0; i<piles.length; i++)
            {
                cnt+= Math.ceil(piles[i]/mid);
            }
            if(cnt==h)
            {
                ans =  mid;
                break;
            }
            else if(cnt<h)
            {
                e = mid-1;
            }
            else 
            {
                s = mid+1;
            }
        }
        return ans;
    }
}
