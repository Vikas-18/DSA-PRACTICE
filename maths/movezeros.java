/**
 * movezeros
 */
import java.util.ArrayList;
import java.util.Arrays;
public class movezeros {

    public static void main(String[] args) {
        int[] A = {1, 6, 1, 0, 9, 6, 2, 5, 6, 2, 10, 2, 0, 6};
        System.out.println(Arrays.toString(solve(A)));
    }

    static int[] solve(int[] A) {
        ArrayList<Integer> arr = new ArrayList<>();
        int counter=0;
        for(int i=0; i<A.length; i++)
        {
            if(A[i]!=0)
            {
                arr.add(A[i]);
            }
            else
            counter++;
        }
        int i=0;

        while(i<arr.size())
        {
            if(i!=arr.size())
            {
                A[i]=arr.get(i);
                i++;
            }

          
        }

        while(counter!=0)
        {
            A[i]=0;
            i++;
            counter--;
        }

        return A;
    }
}