import java.util.Arrays;

public class boatsNeeded {
    public static void main(String[] args) {
        int[]people = {1,2,3,4,5,6};
             System.out.println(numRescueBoats(people, 8));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum <= limit) {
                boatCount++;
                left++;
                right--;
            } else {
                boatCount++;
                right--;
            }
        }
        return boatCount;
    }
}
