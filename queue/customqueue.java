public class customqueue {
    public static void main(String[] args) throws Exception {
        customqueue q = new customqueue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(5);
        q.insert(6);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.err.println(q.poll());
    }
    customqueue()
    {
       this.arr = new int[default_size];
    }

    customqueue(int size)
    {
        this.arr = new int[size];
    }

    public int[] arr;
    public int default_size = 10;

    int end = 0;

    public void insert(int data)
    {
        if(end==arr.length)
        {
            System.out.println("Queue Is Full");
            return;
        }
        arr[end++] = data;
    }

    public int poll() throws Exception
    {
       if(end==-1)
       {
         throw new Exception("Queue Is Empty");
       }
       int removed = arr[0];
       for (int i = 1; i <end; i++) {
          arr[i-1] = arr[i];
       }
       end--;
       return removed;
    }
}
