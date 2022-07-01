

public class perfectSquare {
    public static void main(String[] args) {
        int[]squares = {1,4,9,16};
        System.out.println(solve(5, squares, 3));
    }

    public static int solve(int target,int[]squares,int idx)
    {
        //base case
        if(idx==0)
        {
            if(target==0)
            {
                return 1;
            }
            return 0;
        }


        //pick
        int pick = Integer.MAX_VALUE;
        if(target>=squares[idx])
        {
            pick = 1 + solve(target-squares[idx], squares, idx);
        }

        int notpick = solve(target, squares, idx-1);

        return Math.min(pick,notpick);
    }
}
