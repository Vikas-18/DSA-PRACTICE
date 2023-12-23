import java.util.ArrayList;

public class klargestelementinarray {
    public static String findOdd(String[] series) {

        ArrayList<ArrayList<Integer>> distances = new ArrayList<>();

        String oddOneOut = "";

        for (String s : series) {

            ArrayList<Integer> dist = new ArrayList<>();

            for (int i = 0; i < s.length() - 1; i++) {

                dist.add((int) s.charAt(i + 1) - (int) s.charAt(i));

            }

            distances.add(dist);

        }

        for (int i = 0; i < distances.size(); i++) {

            if (distances.stream().filter(dist -> dist.equals(distances.get(i))).count() == 1) {

                oddOneOut = series[i];

                break;

            }

        }

        return oddOneOut;

    }

    public static void main(String[] args) {

        String[] series = { "ACB", "BDC", "CED", "DEF" };

        String oddOneOut = findOdd(series);

        System.out.println("Odd One Out: " + oddOneOut);

    }
}
