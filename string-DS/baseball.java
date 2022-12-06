/**
 * baseball
 */
import java.util.ArrayList;
public class baseball {

    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
     static int calPoints(String[] ops) {
        
       ArrayList<Integer> arr = new ArrayList<>();
        
        int i=0;
       
        while(i!=ops.length)
        {
            
           
            if(ops[i]!="+" && ops[i]!="D" && ops[i]!="C")
            {
                int x = ops[i].charAt(0)-48;
                arr.add(x);
                i++;
            }
            else if(ops[i]=="+")
            {
                int sum = arr.get(arr.size()-1)+ ops[i-1].charAt(0)-48;
                arr.add(sum);
                i++;
            }
            else if(ops[i]=="D")
            { int d = 2*arr.get(arr.size()-1);
                arr.add(d);
                i++;
            }
            else{
                arr.remove(arr.size()-1);
                i++;
            }
        }
        
        int ans =0;
        
        for(i=0; i<arr.size(); i++)
        {
            ans = ans  + arr.get(i);
        }
        return ans;
    }
}