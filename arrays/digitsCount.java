import java.util.HashMap;

public class digitsCount {
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }
    public static boolean digitCount(String num) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<num.length(); i++)
        {
              if(map.containsKey((int)num.charAt(i)-48))
              {
                  map.put((int)num.charAt(i)-48,map.get((int)num.charAt(i)-48)+1);
              }
              else
              {
                  map.put((int)num.charAt(i)-48,1);
              }
        }

        for(int i=0; i<num.length(); i++)
        {
            if(!map.containsKey(i))
            {
                map.put(i,0);
            }
        }

        for(int i=0; i<num.length(); i++)
        {
            if((int)num.charAt(i)-48!=map.get(i))
            {
                return false;
            }
        }
        return true;
    }
}
