

public class firstindexoffirstoccurence {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issip"));
    }
        public static int strStr(String s, String t) {
            int i=0;
             int j=t.length()-1;
             
             while(i<s.length() && j<s.length())
             {
                 String subs = "";
                 for(int k=i; k<=j; k++)
                 {
                     subs+=s.charAt(k);
                 }
                 if(subs.compareTo(t)==0)
                 {
                     return i;
                 }
                 i++;
                 j++;
             }
             return -1;
         }
 
}
