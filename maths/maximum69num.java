import java.util.ArrayList;

public class maximum69num {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9996));
    }
    public static int maximum69Number (int num) {
        ArrayList<Integer> list = new ArrayList<>();

        while(num>0)
        {
            int lastdigit = num%10;
            list.add(lastdigit);
            num = num/10;
        }
        int[]arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        int i=0;
        int j = arr.length-1;
        while(i<j)
        {
            swap(i,j,arr);
            i++;
            j--;
        }
        for(i=0; i<arr.length; i++)
        {
            if(arr[i]==6)
            {
                arr[i] = 9;
                break;
            }
        }
        int ans = 0;
        int base = 1;
        for(i=arr.length-1; i>=0; i--)
        {
            ans = ans + arr[i]*base;
            base = base*10;
        }
        return ans;
    }
    public static void swap(int i,int j,int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
}
