
/**
 * heap
 */
import java.util.ArrayList;

public class heap {
    static ArrayList<Integer> list = new ArrayList<>();

    public static class Priorityqueue {

        public void add(int val) {
            list.add(val);
            upheapify(list.size() - 1);
        }

        public int peek() {
            if (list.isEmpty()) {
                return -1;
            }
            return list.get(0);
        }

        public void upheapify(int i) {
            if (i == 0) {
                return;
            }

            int pi = (i - 1) / 2;
            if (list.get(i) < list.get(pi)) {
                swap(i, pi);
                upheapify(pi);
            }
        }

        public void swap(int i, int j) {
            int ival = list.get(i);
            int jval = list.get(j);
            list.set(i, jval);
            list.set(j, ival);

        }

        public void downheapify(int pi) {
            int lc = 2 * pi + 1;
            int rc = 2 * pi + 2;

            int min = pi;

            if (lc < list.size() && list.get(lc) < list.get(pi)) {
                min = lc;
            }

            if (rc < list.size() && list.get(rc) < list.get(pi)) {
                min = rc;
            }

            if (min != pi) {
                swap(pi, min);
                downheapify(min);
            }

        }

        public void remove() {
            swap(0, list.size() - 1);
            list.remove(list.size() - 1);
            downheapify(0);
        }

        public void display() {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }

    public static void main(String[] args) {
        Priorityqueue pq = new Priorityqueue();
        pq.add(59);
        pq.add(35);
        pq.add(56);
        pq.add(0);
        pq.add(3);

        // System.out.println(pq.peek());
        pq.remove();
        pq.remove();
        pq.remove();
        pq.display();

    }

}