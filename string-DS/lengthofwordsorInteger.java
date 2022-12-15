public class lengthofwordsorInteger {
    public static void main(String[] args) {
        String[]strs = {"1","01","001","0001"};
        System.out.println(maximumValue(strs));
    }
    public static int maximumValue(String[] strs) {
        int ans=0;
          for(int i=0; i<strs.length; i++)
          {
              if(isNumber(strs[i])==true)
              {
                  ans = Math.max(ans,Integer.parseInt(strs[i]));
              }
              else
              {
                  ans = Math.max(ans,strs[i].length());
              }
          }
          return ans;
      }
      static boolean  isNumber(String s)
      {
          for(int i=0; i<s.length(); i++)
          {
              if(s.charAt(i)>=65 && s.charAt(i)<=122)
              {
                  return false;
              }
          }
          return true;
      }
}
