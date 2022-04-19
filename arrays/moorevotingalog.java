public class moorevotingalog {
    public static void main(String[] args) {
        int[] arr ={2,2,1,1,1,2,2};
        System.out.println(majorityelement(arr));
    }

    static int majorityelement(int [] arr)
    {
        int value = potientialcandidate(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value)
            {
                count++;
            }
        }
        if(count>arr.length/2)
        {
            return value;
        }
        return -1;
        
    }

    private static int potientialcandidate(int[] arr) {
        int val = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==val)
            {
                count++;
            }
            else{
                count--;//found distinct element so pair it;
            }

            if(count==0)
            {
                val = arr[i];
                count=1;
            }
        }
        return val;
    } 


}
