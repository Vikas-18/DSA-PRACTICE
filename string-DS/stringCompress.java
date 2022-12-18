import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class stringCompress {
    public static void main(String[] args) {
        char[]chars = {'a','a','b','b','c','c','c'};
        System.out.println(1+'0');
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        LinkedHashMap<Character,Integer> map  =new LinkedHashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<chars.length; i++)
        {
            if(map.containsKey(chars[i]))
            {
                map.put(chars[i],map.get(chars[i])+1);
            }
            else
            {
                map.put(chars[i],1);
            }
        }
        for(Map.Entry<Character,Integer> m: map.entrySet())
        {
            if(m.getValue()==1)
            {
                list.add(m.getKey());
            }
            else
            {
                list.add(m.getKey());
                int n = m.getValue();
                n = reverse(n);
                while(n>0)
                {
                    int lastdigit = n%10;
                    int ch = lastdigit+'0';
                    list.add((char)ch);
                    n=n/10;
                }
            }
        }
        for(int i=0; i<list.size(); i++)
        {
            chars[i] = list.get(i);
        }
        System.out.print(Arrays.toString(chars));
        return list.size();
    }
    public static int reverse(int n)
    {
        int num = 0;
        int base = 1;
        while(n>0)
        {
            int lastdigit = n%10;
            num  = num*base + lastdigit;
            base = base*10;
            n=n/10;
        }
        return num;
    }
}
