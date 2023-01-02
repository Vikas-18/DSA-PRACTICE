import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
public class ringsRods {
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }
    public static int countPoints(String rings) {
        ArrayList<Set<Character>> list = new ArrayList<>();
        for(int i=0; i<=9; i++)
        {
            list.add(new HashSet<>());
        }
        int i=0; 
        int j=1;
        while(j<rings.length())
        {
           int idx = rings.charAt(j)-48;
           list.get(idx).add(rings.charAt(i));
           i+=2;
           j+=2;
        }
        int ans=0;
        for( i=0; i<=9; i++)
        {
            if(list.get(i).size()==3)
            {
                ans++;
            }
        }
        return ans;
    }
}
