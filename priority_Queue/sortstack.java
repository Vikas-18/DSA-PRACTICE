
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class sortstack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(3);
        s.add(2);
        s.add(1);
        System.out.println(sort(s));
    }

    public static Stack<Integer> sort(Stack<Integer> s)
	{
	   PriorityQueue<Integer> help = new PriorityQueue<>(Collections.reverseOrder());
	   while(s.size()!=0)
	   {
	       help.add(s.pop());
	   }
	   while(help.size()>0)
	   {
            s.add(help.peek());
            help.remove();
	   }
	   return s;
	}
}
