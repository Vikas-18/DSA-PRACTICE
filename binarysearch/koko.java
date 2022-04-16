import java.util.*;
public class koko {
    public static void main(String[] args) {
        int[] pile = {3,6,7,11};
       System.out.println(minEatingSpeed(pile,8));
      
    }
    static int minEatingSpeed(int[] piles, int hour)
    {
         int max = Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++)
        {
            max = Math.max(max,piles[i]);
        }
        if(hour==piles.length)
        {
            return max;
        }
        
        int sp = Integer.MAX_VALUE;
        int l=0;
        int h = max;
        
        while(l<=h)
        {
            int speed = l+(h-l)/2;
            if(isPossible(piles,speed,hour))
            {
                sp = speed;
                h = speed-1;
            }
            else{
                l = speed+1;
            }
        }
        return sp;
    }
   static boolean isPossible(int[]piles,int speed,int h)
    {
      int time=0;
        for(int i=0; i<piles.length; i++)
        {
           time+= (int)Math.ceil(piles[i]*1.0/speed);
        }
        return time<=h;
    }
}
