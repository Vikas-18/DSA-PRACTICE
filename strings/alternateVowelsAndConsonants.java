import java.util.PriorityQueue;

public class alternateVowelsAndConsonants {
    public static void main(String[] args) {
        String s = "aeroplane";
        System.out.println(rearrange(s));
    }

    public static String rearrange(String s){
        PriorityQueue<Character> pq1 = new PriorityQueue<>();
        PriorityQueue<Character> pq2 = new PriorityQueue<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                pq1.add(s.charAt(i));
            }
            else
            {
                pq2.add(s.charAt(i));
            }
        }
        if(pq1.size()+1!=pq2.size() && pq2.size()+1!=pq1.size())
        {
            return "-1";
        }
        String ans = "";
        int i=0;
        if(pq1.size()>=pq2.size())
        {
            while(i<s.length())
            {
                if(i%2==0)
                {
                    ans+=pq1.peek();
                    pq1.remove();
                }
                else
                {
                    ans+=pq2.peek();
                    pq2.remove();
                }
                i++;
            }
        }
        else
        {
             while(pq1.size()>0 && pq2.size()>0)
            {
                if(i%2!=0)
                {
                    ans+=pq1.peek();
                    pq1.remove();
                }
                else
                {
                    ans+=pq2.peek();
                    pq2.remove();
                }
                i++;
            }
        }
        return ans;
        
    }
}
