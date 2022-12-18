public class frogJump {
    public static void main(String[] args) {
        int[]stones = {0,1,3,5,6,8,12,17};
        System.out.println(canCross(stones));
    }
    public static boolean canCross(int[] stones) {
        return solve(1,stones);
    }

    public static boolean solve(int idx,int[] arr)
    {
        if(idx>=arr.length)
        {
            return false;
        }
        if(idx==arr.length-1)
        {
            return true;
        }
        boolean jump1 = false;
        boolean jump2 = false;
        boolean jump3 = false;

        if(arr[idx]+1<arr.length && arr[idx]-1<arr.length && arr[idx]<arr.length)
        {
            jump1 =  solve(arr[idx]+1,arr);
            jump2 = solve(arr[idx]-1,arr);
            jump3 = solve(arr[idx],arr);
        }

        return jump1|jump2|jump3;

    }
}
