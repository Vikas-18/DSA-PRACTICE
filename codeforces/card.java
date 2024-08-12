import java.util.Scanner;

public class card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int suneetWins = 0;

            // Check all 4 possible game outcomes:
            // 1. Suneet: a1, a2; Slavic: b1, b2
            // 2. Suneet: a1, a2; Slavic: b2, b1
            // 3. Suneet: a2, a1; Slavic: b1, b2
            // 4. Suneet: a2, a1; Slavic: b2, b1

            // Possible permutations
            int[][] suneetPermutations = { { a1, a2 }, { a2, a1 } };
            int[][] slavicPermutations = { { b1, b2 }, { b2, b1 } };

            for (int[] suneet : suneetPermutations) {
                for (int[] slavic : slavicPermutations) {
                    int suneetRoundWins = 0;
                    int slavicRoundWins = 0;

                    if (suneet[0] > slavic[0])
                        suneetRoundWins++;
                    if (suneet[0] < slavic[0])
                        slavicRoundWins++;
                    if (suneet[1] > slavic[1])
                        suneetRoundWins++;
                    if (suneet[1] < slavic[1])
                        slavicRoundWins++;

                    if (suneetRoundWins > slavicRoundWins)
                        suneetWins++;
                }
            }

            System.out.println(suneetWins);
        }

        sc.close();
    }
}
