import java.util.ArrayList;
import java.util.Stack;

public class stockSpanContructor {
    public static void main(String[] args) {
        
        System.out.println(next(100));
        System.out.println(next(80));
        System.out.println(next(60));
        System.out.println(next(70));
        System.out.println(next(60));
        System.out.println(next(75));
        System.out.println(next(85));
    }
    public static ArrayList<Integer> list = new ArrayList<>();
    public static int next(int price) {
        list.add(price);
        Stack<Integer> st = new Stack<>();
        int counter=0;
        for(int i=0; i<list.size(); i++)
        {
            counter = 0;
            if(i==list.size()-1)
            {
                if(st.size()>0 && st.peek()<list.get(i))
                {
                    counter++;
                    break;
                }
                else{
                    while(st.size()>0 && list.get(i)>=st.peek())
                    {
                        st.pop();
                        counter++;
                    }
                }
            }
            st.push(list.get(i));
        }
        if(counter==0)
        {
            return 1;
        }
        return counter;
    }
}
