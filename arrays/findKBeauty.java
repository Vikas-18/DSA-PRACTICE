public class findKBeauty {
    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240, 2));

    }
    public static int divisorSubstrings(int num, int k) {
        int ans=0;
        String n = Integer.toString(num);
        int i=0;
        int j=0;
        String temp = "";
        int divisor=0;
        while(j<n.length())
        {
            
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                for(int idx=i; idx<=j; idx++)
                {
                    temp+=n.charAt(idx);
                }
                divisor = Integer.parseInt(temp);
                if(divisor!=0 && num%divisor==0)
                {
                    ans++;
                }
                temp = "";
                j++;
                i++;
            }
        }
        return ans;
    }
}
