

public class ballonsCount {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
    public static int maxNumberOfBalloons(String text) {
        int a =0;
        int b = 0;
        int l = 0;
        int o = 0;
        int n = 0;
      
         for(int i=0; i<text.length(); i++)
        {
            if(text.charAt(i)=='a')
            {
                a++;
            }
            else if(text.charAt(i)=='b')
            {
                b++;
            }
           else if(text.charAt(i)=='l')
            {
                l++;
            }
            else if(text.charAt(i)=='o')
            {
                o++;
            }
            else if(text.charAt(i)=='n')
            {
                n++;
            }
        }
        int ans =0;
        while (a > 0 && b > 0 && n > 0 && l > 1 && o > 1) {
            ans++;
            l -= 2;
            o -= 2;
            a--;
            b--;
            n--;
        }
        return ans;
    }
}
