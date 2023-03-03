/**
 * indexOfFirstOccurence
 */
public class indexOfFirstOccurence {

    public static void main(String[] args) {
        String s = "hello";
        String t = "ll";
        System.out.println(strStr(s, t));
    }
        public static int strStr(String s, String t) {
            int i=0;
            int j=0;
            int k = t.length();
            StringBuilder temp = new StringBuilder();
            while(j<s.length())
            {
               temp.append(s.charAt(j));
    
               if(j-i+1<k)
               {
                   j++;
               }
               else if(j-i+1==k)
               {
                   
                   if(temp.toString().equals(t))
                   {
                       return i;
                   }
                   else
                   {
                       temp.deleteCharAt(0);
                       i++;
                       j++;
                   }
               }
            }
            return -1;
        }
}