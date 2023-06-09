/**
 * ceilingChar
 */
public class ceilingChar {

    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int n = letters.length;
        int high = n - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (letters[mid] > target) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return letters[low % n];
    }
}