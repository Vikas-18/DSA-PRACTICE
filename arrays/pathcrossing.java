import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class pathcrossing {
    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }

    public static boolean isPathCrossing(String path) {

        int x = 0;
        int y = 0;
        Set<Pair> set = new HashSet<>();
        set.add(new Pair(x, y));

        for (int i = 0; i < path.length(); i++) {

            char ch = path.charAt(i);
            if (ch == 'N') {
                y += 1;
            } else if (ch == 'S') {
                y -= 1;
            } else if (ch == 'E') {
                x += 1;
            } else {
                x += -1;
            }
            Pair p = new Pair(x, y);
            if (set.contains(p)) {
                return true;
            }
            set.add(new Pair(x, y));
        }
        return false;
    }

    public static class Pair {
        int f;
        int s;

        Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair pair = (Pair) o;
            return f == pair.f && s == pair.s;
        }

        @Override
        public int hashCode() {
            return Objects.hash(f, s);
        }
    }
}
