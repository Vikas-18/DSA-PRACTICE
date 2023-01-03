public class minDeletions {
    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }
    public static int minDeletionSize(String[] strs) {
        int ans=0;
        for(int i=0; i<strs[0].length(); i++)
        {
            int j=0;
            while(j<strs.length)
            {
                char ch = strs[j].charAt(i);
                j++;
                if(j<strs.length && strs[j].charAt(i)<ch)
                {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
