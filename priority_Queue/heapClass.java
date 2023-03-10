import java.util.ArrayList;
public class heapClass {
    //min heap
    static class Heap
    {
        ArrayList<Integer> list = new ArrayList<>();

        public void add(int data)
        {
           //insert at last
           list.add(data);

           int x = list.size()-1;
           int par = (x-1)/2;

           while(list.get(x)<list.get(par))
           {
             int temp = list.get(x);
             list.set(x,list.get(par));
             list.set(par,temp);
           }

        }
        private void heapify(int i)
        {
            int left  = 2*i+1;
            int right = 2*i+2;
            int minidx = i;

            if(left<list.size() && list.get(left)<list.get(i))
            {
                minidx = left;
            }
            if(right<list.size() && list.get(right)<list.get(i))
            {
                minidx = right;
            }

            if(minidx!=i)
            {
                int temp = list.get(i);
                list.set(i,list.get(minidx));
                list.set(minidx,temp);

                heapify(minidx);
            }
        }
        public int delete()
        {
            int data = list.get(0);
             //swap first and last index
            int temp  = list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);
            //remove last index
            list.remove(list.size()-1);

            heapify(0);
            return data;

        }
        public int peek()
        {
            return list.get(0);
        }
        public boolean isEmpty()
        {
            return list.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(0);
        h.add(1);
        h.add(9);
        h.add(3);

        while(!h.isEmpty())
        {
            System.out.println(h.delete());
        }
    }
}
