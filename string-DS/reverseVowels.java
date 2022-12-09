// import java.util.Stack;

// public class reverseVowels {
//     public static void main(String[] args) {
//         System.out.println(reverseVowels("hello"));
//     }
//     public static String reverseVowels(String s) {
//         Stack<Character> st = new Stack<>();
//         for(int i=0; i<s.length(); i++)
//         {
//             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
//             {
                
//             }
//         }

//         String ans = "";
//         for(int i=0; i<s.length(); i++)
//         {
//             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
//             {
//                 ans+=st.pop();
//             }
//             else
//             {
//                 ans+=s.charAt(i);
//             }
//         }
//         return ans;
//     }
// }