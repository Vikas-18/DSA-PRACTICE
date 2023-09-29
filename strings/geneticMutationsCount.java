import java.util.HashMap;

public class geneticMutationsCount {
    public static void main(String[] args) {
        String[] bank = {"AACCGGTA","AACCGCTA","AAACGGTA"};
        System.out.println(minMutation("AACCGGTT","AAACGGTA", bank));
    }
    public static int minMutation(String start, String end, String[] bank) {
    HashMap<String,Integer> map = new HashMap<>();
    String word = "";
    char[] arr = start.toCharArray();
    for(int i=0; i<bank.length; i++)
    {
        map.put(bank[i],1);
    }
    if(!map.containsKey(end))
    {
        return -1;
    }
    int ans=0;
    int i=start.length()-1;
    int j=end.length()-1;
    while(i>0 && j>0)
    {
        if(start.charAt(i)!=end.charAt(j))
        {
            arr[i] = end.charAt(i);
            for(int idx=0; idx<arr.length; idx++)
            {
                word+=arr[idx];
            }
            if(!map.containsKey(word))
            {
                return -1;
            }
            ans++;
            word="";
        }
        i++;
        j++;
    }
    return ans++;

}
}
