public class can_make_Equals {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
        
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        for(int i=0; i<s2.length(); i++)
        {
            for(int j=0; j<s2.length(); j++)
            {
                char[] arr = s2.toCharArray();
                swap(arr,i,j);
                String temp = "";
                for (int k = 0; k < arr.length; k++) {
                    temp+=arr[k];
                }
                if(s1.equals(temp))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void swap(char[]arr,int x,int y)
    {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
