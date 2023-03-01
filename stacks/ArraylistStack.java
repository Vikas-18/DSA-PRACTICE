import java.util.ArrayList;
public class ArraylistStack {

    public static class CustomStack{
        static ArrayList<Integer> list = new ArrayList<>();

        //isempty
        public boolean isEmpty()
        {
           return list.size()==0;
        }

        //push
        public void push(int val)
        {
           list.add(val);
           return;
        }

        //pop
        public int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }


    public static void main(String[] args) {
        CustomStack s = new CustomStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty())
        {
            int val = s.pop();
            System.out.println(val);
        }
        System.out.println(s.pop());
    }
}
