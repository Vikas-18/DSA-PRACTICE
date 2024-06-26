import java.util.List;

public class ants {
    public static void main(String[] args) {

    }

    public static long maxAntsKilled(int n, int[] arr, int t) {
        // Create a list of pairs to store (arr[i], i)
        ArrayListList<Pair<Integer, Integer>> anthills = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            anthills.add(new Pair<>(arr[i], i));
        }

        long totalTime = 0;
        long totalAntsKilled = 0;

        for (int i = 0; i < n; ++i) {
            int ants = anthills.get(i).getKey();
            int originalIndex = anthills.get(i).getValue();

            long timeNeeded = originalIndex + 1; // Time to kill current anthill

            if (totalTime + timeNeeded <= t) {
                totalTime += timeNeeded;
                totalAntsKilled += ants;
            } else {
                break; // If we cannot afford the current anthill, stop
            }
        }

        return totalAntsKilled;
    }

    class Pair {
        int ants;
        int originalIndex;

        public Pair(int ants, int originalIndex) {
            this.ants = ants;
            this.originalIndex = originalIndex;
        }

        public int getAnts() {
            return ants;
        }

        public int getOriginalIndex() {
            return originalIndex;
        }
    }
}
