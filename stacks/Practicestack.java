public class Practicestack {

    public static void main(String[] args) {
        Practicestack st = new Practicestack();
        st.add(10);
        st.add(11);
        st.add(112);

        while (st.isEmpty() == false) {
            System.out.println(st.pop());
        }
    }

    static private int n = 10;
    int i = -1;
    int[] arr = new int[n];

    public void add(int num) {
        if (size() < n) {
            i++;
            arr[i] = num;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Nothing to pop");
            return -1;
        }
        int num = arr[i];
        i--;
        return num;
    }

    public boolean isEmpty() {
        return i == -1;
    }

    public int size() {
        return i + 1;
    }
}
