import java.util.Arrays;
import java.util.Scanner;

public class countNumberOfVowelsString {
    public static void main(String[] args) {
        // String[] words = {"v","ab","fu","nu"};
        // int left = 1, right = 3;
        // System.out.println(vowelStrings(words, left, right));

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] num = new int[n1];
        for (int i = 0; i < num.length; i++) {
            int numb = sc.nextInt();
            num[i] = numb;
        }
        System.out.println(Arrays.toString(num));

    }
    public static int vowelStrings(String[] words, int left, int right) {
        int ans=0;
        for(int i=left; i<=right; i++)
        {
            if(check(words[i]))
            {
                ans++;
            }
        }
        return ans;
    }
    public static boolean check(String s)
    {
        boolean flag1 =false;
        boolean flag2 = false;
        if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u')
        {
            flag1 = true;
        }

          if(s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='e' || s.charAt(s.length()-1)=='i' || s.charAt(s.length()-1)=='o' || s.charAt(s.length()-1)!='u')
          {
              flag2 = true;
          }

          return flag1&&flag2;
    }
}
