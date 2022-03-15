
import java.util.*;
public class peakfinding {
    public static void main(String[] args) {
       
    }

    static  int perfectPeak(int[] A) {
        
        int s=0;
        int e = A.length-1;

        while(s<e)
        {
            int mid = s+(e-s)/2;

            if(A[mid]<A[mid+1] && A[mid]>A[mid-1])
            {
                return mid;
            }

            else if(A[mid]<A[mid+1])
            {
                s= mid+1;
            }

            else{
                e = mid-1;
            }
        }

        return -1;
    }
}
