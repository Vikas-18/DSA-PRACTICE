public class rotate_possible {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","abced"));
    }
    public static boolean rotateString(String s, String goal) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = goal.toCharArray();
        if(s.length()!=goal.length())
        {
            return false;
        }
        for(int i=0; i<s.length(); i++)
        {
            reverse(arr1,0,s.length()-1);
            reverse(arr1,1,s.length()-1);
            if(compare(arr1, arr2)==true)
            {
                return true;
            }
        }
        return false;


    }

    public static boolean compare(char[]arr1,char[]arr2)
    {
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void reverse(char[]arr,int i,int j)
    {
       while(i<=j)
       {
          swap(arr,i,j);
          i++;
          j--;
       }
    }
    public static void swap(char[] arr,int x,int y)
    {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
